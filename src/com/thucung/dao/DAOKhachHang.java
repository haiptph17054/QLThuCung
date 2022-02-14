package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.KhachHang;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOKhachHang implements IDAOService<KhachHang, Integer> {

    private final String insert = "insert into khachhang values (?,?,?,?,?)";
    private final String update = "update khachhang set tenkhachhang = ?, gioitinh = ?,"
            + "diachi = ?, sodienthoai = ?, email = ? where idkhachhang = ?";
    private final String delete = "delete khachhang where idkhachhang = ?";
    private final String selectAll = "select * from khachhang";
    private final String selectOne = "select * from khachhang where idkhachhang = ?";
    private final String find = "timkhachhang ?";
    private final String selectByEmail = "select * from khachhang where email = ?";
    private final String selectBySDT = "select * from khachhang where sodienthoai = ?";
    private final String selectKhachHangThanThiet = "laykhachhangthanthiet";
    private final String selectKhachHangBinhThuong = "laykhachhangbinhthuong";
    private final String insertHaveOutput = "insert into khachhang output inserted.idkhachhang values (?,?,?,?,?)";

    @Override
    public void insert(KhachHang o) {
        JDBCService.executeInsert(insert, o.getTenKhachHang(), o.getGioiTinh(), o.getDiaChi(),
                o.getSoDienThoai(), o.getEmail());
    }

    public void insertHaveOutput(KhachHang o) {
        ResultSet rs = JDBCService.executeHaveOutput(insertHaveOutput, o.getTenKhachHang(), o.getGioiTinh(),
                o.getDiaChi(), o.getSoDienThoai(), o.getEmail());
        try {
            if (rs.next()) {
                o.setIdKhachHang(rs.getInt(1));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(KhachHang o) {
        JDBCService.executeUpdate(update, o.getTenKhachHang(), o.getGioiTinh(), o.getDiaChi(),
                o.getSoDienThoai(), o.getEmail(), o.getIdKhachHang());
    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<KhachHang> selectAll() {
        List<KhachHang> list = new ArrayList<KhachHang>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public KhachHang selectID(Integer i) {
        KhachHang khachHang = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                khachHang = new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return khachHang;
    }

    public List<KhachHang> find(String ten) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        ResultSet rs = JDBCService.executeProcedure(find, ten);
        try {
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<KhachHang> selectKhachHangThanThiet() {
        List<KhachHang> list = new ArrayList<KhachHang>();
        ResultSet rs = JDBCService.executeProcedure(selectKhachHangThanThiet);
        try {
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<KhachHang> selectKhachHangBinhThuong() {
        List<KhachHang> list = new ArrayList<KhachHang>();
        ResultSet rs = JDBCService.executeProcedure(selectKhachHangBinhThuong);
        try {
            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public KhachHang selectByEmail(String email) {
        KhachHang khachHang = null;
        ResultSet rs = JDBCService.executeSelect(selectByEmail, email);
        try {
            if (rs.next()) {
                khachHang = new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return khachHang;
    }

    public KhachHang selectBySoDienThoai(String sdt) {
        KhachHang khachHang = null;
        ResultSet rs = JDBCService.executeSelect(selectBySDT, sdt);
        try {
            if (rs.next()) {
                khachHang = new KhachHang(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return khachHang;
    }
}
