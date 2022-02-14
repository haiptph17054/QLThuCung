package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAONhanVien implements IDAOService<NhanVien, Integer> {

    private final String insert = "insert into nhanvien output inserted.idnhanvien values (?,?,?,?,?,?,?)";
    private final String update = "update nhanvien set tennhanvien = ?, ngaysinh = ?,"
            + "gioitinh = ?, diachi = ?, sodienthoai = ?, email = ?, hinhanh = ? where idnhanvien = ?";
    private final String delete = "delete nhanvien where idnhanvien = ?";
    private final String selectAll = "select * from nhanvien";
    private final String selectOne = "select * from nhanvien where idnhanvien = ?";
    private final String find = "timnhanvien ?";
    private final String selectByEmail = "select * from nhanvien where email = ?";
    private final String selectBySDT = "select * from nhanvien where sodienthoai = ?";

    @Deprecated
    @Override
    public void insert(NhanVien o) {
    }

    public TaiKhoan insertOuputAccount(NhanVien o) {
        ResultSet rs = JDBCService.executeHaveOutput(insert, o.getTenNhanVien(), o.getNgaySinh(), o.getGioiTinh(),
                o.getDiaChi(), o.getSoDienThoai(), o.getEmail(), o.getHinhAnh());
        try {
            if (rs.next()) {
                o.setIdNhanVien(rs.getInt(1));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        TaiKhoan taiKhoanNV = DAOService.taiKhoan.insert(o);
        return taiKhoanNV;
    }

    @Override
    public void update(NhanVien o) {
        JDBCService.executeUpdate(update, o.getTenNhanVien(), o.getNgaySinh(), o.getGioiTinh(),
                o.getDiaChi(), o.getSoDienThoai(), o.getEmail(), o.getHinhAnh(), o.getIdNhanVien());
    }

    @Override
    public void delete(Integer i) {
        
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<NhanVien> selectAll() {
        List<NhanVien> list = new ArrayList<NhanVien>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public NhanVien selectID(Integer i) {
        NhanVien nhanVien = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                nhanVien = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nhanVien;
    }

    public NhanVien selectByEmail(String email) {
        NhanVien nhanVien = null;
        ResultSet rs = JDBCService.executeSelect(selectByEmail, email);
        try {
            if (rs.next()) {
                nhanVien = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nhanVien;
    }

    public NhanVien selectBySoDienThoai(String sdt) {
        NhanVien nhanVien = null;
        ResultSet rs = JDBCService.executeSelect(selectBySDT, sdt);
        try {
            if (rs.next()) {
                nhanVien = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nhanVien;
    }

    public List<NhanVien> find(String ten) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        ResultSet rs = JDBCService.executeProcedure(find, ten);
        try {
            while (rs.next()) {
                list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
