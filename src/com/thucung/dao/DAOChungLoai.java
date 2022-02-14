package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.ChungLoai;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOChungLoai implements IDAOService<ChungLoai, Integer> {

    private final String insert = "insert into chungloai values (?,?)";
    private final String update = "update chungloai set tenchungloai = ?, dacdiemnhandang = ? where idchungloai = ?";
    private final String delete = "delete chungloai where idchungloai = ?";
    private final String selectAll = "select * from chungloai";
    private final String selectOne = "select * from chungloai where idchungloai = ?";

    @Override
    public void insert(ChungLoai o) {
        JDBCService.executeInsert(insert, o.getTenChungLoai(), o.getDacDiemNhanDang());
    }

    @Override
    public void update(ChungLoai o) {
        JDBCService.executeDelete(update, o.getTenChungLoai(), o.getDacDiemNhanDang(), o.getIdChungLoai());
    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<ChungLoai> selectAll() {
        List<ChungLoai> list = new ArrayList<ChungLoai>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new ChungLoai(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public ChungLoai selectID(Integer i) {
        ChungLoai chungLoai = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if(rs.next()){
                chungLoai = new ChungLoai(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return chungLoai;
    }

}
