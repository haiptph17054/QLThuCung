package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.ThuCung;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOThuCung implements IDAOService<ThuCung, Integer> {

    private final String insert = "insert into thucung values (?,?,?,?,?,?,?,?,?,?)";
    private final String update = "update thucung set chungloai = ?, tenthucung = ?, nhacungcap = ?,"
            + "gioitinh = ?, mausac = ?, thangtuoi = ?, dongia = ?, thongtinchitiet = ?, hinhanh = ? , "
            + "trangthai = ? where idthucung = ?";
    private final String delete = "delete thucung where idthucung = ?";
    private final String selectAll = "select * from thucung";
    private final String selectOne = "select * from thucung where idthucung = ?";
    private final String find = "timthucung ?";
    private final String findPrice = "timthucungkhoanggia ?,?";
    private final String findChungLoai = "select * from thucung where chungloai = ?";
    private final String changeUnavailable = "update thucung set trangthai = 0 where idthucung = ?";
    private final String selectAvailable = "select * from thucung where trangthai = 1";
    private final String selectByNCC = "select * from thucung where nhacungcap = ?";

    @Override
    public void insert(ThuCung o) {
        JDBCService.executeInsert(insert, o.getChungLoai(), o.getTenThuCung(), o.getNhaCungCap(), o.getGioiTinh(),
                o.getMauSac(), o.getThangTuoi(), o.getDonGia(), o.getThongTinChiTiet(), o.getHinhAnh(), o.getTrangthai());
    }

    @Override
    public void update(ThuCung o) {
        JDBCService.executeUpdate(update, o.getChungLoai(), o.getTenThuCung(), o.getNhaCungCap(), o.getGioiTinh(),
                o.getMauSac(), o.getThangTuoi(), o.getDonGia(), o.getThongTinChiTiet(), o.getHinhAnh(), o.getTrangthai(), o.getIdThuCung());
    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<ThuCung> selectAll() {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public ThuCung selectID(Integer i) {
        ThuCung thuCung = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                thuCung = new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return thuCung;
    }

    public List<ThuCung> find(String name) {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeProcedure(find, name);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<ThuCung> findPrice(double min, double max) {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeProcedure(findPrice, min, max);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<ThuCung> findChungLoai(int chungLoai) {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeSelect(findChungLoai, chungLoai);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<ThuCung> selectByNhaCungCap(int nhaCungCap) {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectByNCC, nhaCungCap);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<ThuCung> selectAvailable() {
        List<ThuCung> list = new ArrayList<ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectAvailable);
        try {
            while (rs.next()) {
                list.add(new ThuCung(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getInt(11)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void unavailable(Integer... ids) {
        String query = changeUnavailable;
        if (ids.length > 1) {
            for (int i = 1; i < ids.length; i++) {
                query += " or idthucung = ?";
            }
        }
        JDBCService.executeUpdateInteger(query, ids);
    }

}
