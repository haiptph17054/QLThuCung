package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.MaGiamGia;
import com.thucung.util.DateUtil;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOMaGiamGia implements IDAOService<MaGiamGia, Integer> {

    private final String insert = "insert into magiamgia values (?,?,?,?,?)";
    private final String selectAll = "select * from magiamgia";
    private final String selectOne = "select * from magiamgia where magiamgia = ? and soluong > 0 and ngayketthuc > ?";
    private final String findAvailable = "timmagiamgiaconhan ?";
    private final String removeUnvailable = "xoamagiamgiahong";
    private final String selectByID = "select * from magiamgia where idmagiamgia = ?";
    private final String truSoLuong = "trumagiamgia ?";

    @Override
    public void insert(MaGiamGia o) {
        JDBCService.executeInsert(insert, o.getMaGiamGia(), o.getGiaTri(), o.getSoLuong(),
                o.getNgayBatDau(), o.getNgayKetThuc());
    }

    @Deprecated
    @Override
    public void update(MaGiamGia o) {

    }
    public void truSoLuong(MaGiamGia o) {
        JDBCService.executeProcedureIUD(truSoLuong, o.getIdMaGiamGia());
    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Override
    public List<MaGiamGia> selectAll() {
        List<MaGiamGia> list = new ArrayList<MaGiamGia>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new MaGiamGia(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public MaGiamGia selectID(Integer i) {
        MaGiamGia maGiamGia = null;
        ResultSet rs = JDBCService.executeSelect(selectByID, i);
        try {
            if (rs.next()) {
                maGiamGia = new MaGiamGia(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getString(5), rs.getString(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maGiamGia;
    }

    public MaGiamGia selectMa(String ma) {
        MaGiamGia maGiamGia = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, ma, DateUtil.getTimeNowUS());
        try {
            if (rs.next()) {
                maGiamGia = new MaGiamGia(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maGiamGia;
    }

    public List<MaGiamGia> selectAvailable() {
        List<MaGiamGia> list = new ArrayList<MaGiamGia>();
        ResultSet rs = JDBCService.executeProcedure(findAvailable, DateUtil.getTimeNowUS());
        try {
            while (rs.next()) {
                list.add(new MaGiamGia(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void removeUnvailable() {
        JDBCService.executeProcedureIUD(removeUnvailable);
    }
}
