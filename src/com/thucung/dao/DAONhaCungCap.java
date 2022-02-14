package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.NhaCungCap;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAONhaCungCap implements IDAOService<NhaCungCap, Integer> {

    private final String insert = "insert into nhacungcap values (?,?,?,?,?)";
    private final String update = "update nhacungcap set tennhacungcap = ?, ngayhoptac = ?, diachi = ?,"
            + "sodienthoai = ?, trangthai = ? where idnhacungcap = ?";
    private final String delete = "delete nhacungcap where idnhacungcap = ?";
    private final String selectAll = "select * from nhacungcap";
    private final String selectOne = "select * from nhacungcap where idnhacungcap = ?";
    private final String selectAvailable = "select * from nhacungcap where trangthai = 1";
    private final String stopCooperate = "update nhacungcap set trangthai = 0 where idnhacungcap = ?";
    private final String cooperate = "update nhacungcap set trangthai = 1 where idnhacungcap = ?";
    private final String selectByTrangThai = "select * from nhacungcap where trangthai = ?";
    private final String selectBySDT = "select * from nhacungcap where sodienthoai = ?";

    @Override
    public void insert(NhaCungCap o) {
        JDBCService.executeInsert(insert, o.getTenNhaCungCap(), o.getNgayHopTac(),
                o.getDiaChi(), o.getSoDienThoai(), 1);
    }

    @Override
    public void update(NhaCungCap o) {
        JDBCService.executeUpdate(update, o.getTenNhaCungCap(), o.getNgayHopTac(),
                o.getDiaChi(), o.getSoDienThoai(), o.getTrangThai(), o.getIdNhaCungCap());
    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        List<NhaCungCap> list = new ArrayList<NhaCungCap>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<NhaCungCap> selectByTrangThai(int trangThai) {
        List<NhaCungCap> list = new ArrayList<NhaCungCap>();
        ResultSet rs = JDBCService.executeSelect(selectByTrangThai, trangThai);
        try {
            while (rs.next()) {
                list.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<NhaCungCap> selectAvailable() {
        List<NhaCungCap> list = new ArrayList<NhaCungCap>();
        ResultSet rs = JDBCService.executeSelect(selectAvailable);
        try {
            while (rs.next()) {
                list.add(new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public NhaCungCap selectID(Integer i) {
        NhaCungCap nhaCungCap = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                nhaCungCap = new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nhaCungCap;
    }
    
    public NhaCungCap selectBySoDienThoai(String sdt) {
        NhaCungCap nhaCungCap = null;
        ResultSet rs = JDBCService.executeSelect(selectBySDT, sdt);
        try {
            if (rs.next()) {
                nhaCungCap = new NhaCungCap(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nhaCungCap;
    }

    public void stopCopperate(NhaCungCap nhaCungCap) {
        JDBCService.executeUpdate(stopCooperate, nhaCungCap.getIdNhaCungCap());
    }

    public void cooperate(NhaCungCap nhaCungCap) {
        JDBCService.executeUpdate(cooperate, nhaCungCap.getIdNhaCungCap());
    }
}
