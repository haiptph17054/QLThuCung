package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.util.CharUtil;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOTaiKhoan implements IDAOService<TaiKhoan, Integer> {

    private final String insert = "insert into taikhoan values (?,?,?,?,?)";
    private final String update = "update taikhoan set matkhau = ?, trangthai = ? where taikhoan = ?";
    private final String delete = "delete taikhoan where taikhoan = ?";
    private final String selectAll = "select * from taikhoan";
    private final String selectOne = "select * from taikhoan where taikhoan = ?";
    private final String selectByIDNhanVien = "select * from taikhoan where nhanvien = ?";
    private final String selectByTrangThai = "select * from taikhoan where trangthai = ?";
    private final String ban = "update taikhoan set trangthai = 0 where taikhoan = ?";
    private final String active = "update taikhoan set trangthai = 1 where taikhoan = ?";
    private final String deleteByNhanVien = "delete taikhoan where nhanvien = ?";

    @Deprecated
    @Override
    public void insert(TaiKhoan o) {

    }

    public TaiKhoan insert(NhanVien o) {
        String account = CharUtil.getAccountFromNameAndID(o.getTenNhanVien(), o.getIdNhanVien());
        String passWord = CharUtil.getRandomStr(4);
        JDBCService.executeInsert(insert, account, CharUtil.getEndCoding(passWord), o.getIdNhanVien(), 1, 1);
        return new TaiKhoan(account, passWord, o.getIdNhanVien(), 1, 0);
    }

    @Override
    public void update(TaiKhoan o) {
        //mật khẩu o phải chưa được mã khóa
        JDBCService.executeUpdate(update, CharUtil.getEndCoding(o.getMatKhau()), o.getTrangThai(), o.getTaiKhoan());
        o.setMatKhau(selectID(o.getTaiKhoan()).getMatKhau());
    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    public void delete(String tk) {
        JDBCService.executeDelete(delete, tk);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Deprecated
    @Override
    public TaiKhoan selectID(Integer i) {
        return null;
    }

    public void deleteByNhanVien(int nhanVien) {
        JDBCService.executeDelete(deleteByNhanVien, nhanVien);
    }

    public TaiKhoan selectID(String tk) {
        TaiKhoan taiKhoan = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, tk);
        try {
            if (rs.next()) {
                taiKhoan = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return taiKhoan;
    }

    public TaiKhoan selectByIDNhanVien(int id) {
        TaiKhoan taiKhoan = null;
        ResultSet rs = JDBCService.executeSelect(selectByIDNhanVien, id);
        try {
            if (rs.next()) {
                taiKhoan = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return taiKhoan;
    }

    public List<TaiKhoan> selectByTrangThai(int trangthai) {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        ResultSet rs = JDBCService.executeSelect(selectByTrangThai, trangthai);
        try {
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<TaiKhoan> selectByIDNhanVien(Integer... ids) {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        String query = selectByIDNhanVien;
        if (ids.length > 1) {
            query += " or nhanvien = ?";
        }
        ResultSet rs = JDBCService.executeSelect(query, (Object) ids);
        try {
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void ban(TaiKhoan taiKhoan) {
        JDBCService.executeUpdate(ban, taiKhoan.getTaiKhoan());
    }

    public void active(TaiKhoan taiKhoan) {
        JDBCService.executeUpdate(active, taiKhoan.getTaiKhoan());
    }

}
