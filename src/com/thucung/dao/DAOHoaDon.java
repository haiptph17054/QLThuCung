package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.HoaDon;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOHoaDon implements IDAOService<HoaDon, Integer> {

    private final String insert = "insert into hoadon values (?,?,?,?)";
    private final String delete = "delete hoadon where idhoadon = ?";
    private final String selectAll = "select * from hoadon";
    private final String selectOne = "select * from hoadon where idhoadon = ?";
    private final String findDate = "timhoadontheongay ?,?";
    private final String selectByNhanVien = "select * from hoadon where nhanvien = ?";
    private final String selectByKhachHang = "select * from hoadon where khachhang = ?";
    private final String insertHaveOutput = "insert into hoadon output inserted.idhoadon values (?,?,?,?)";
    private final String tongTienHoaDon = "tongtienhoadon ?";
    private final String findNV = "timhdtheonv ?";
    private final String findKH = "timhdtheokh ?";
    private final String top10hd = "top10hd";
    private final String hdThangHienTai = "hdthanghientai";
    private final String hoaDonAdmin = "hoadonadmin";
    private final String selectByDate = "select * from hoadon where month(ngayxuathoadon) = ? and year(ngayxuathoadon) = ?";
    private final String selectCountByKhachHang = "select count(*) from hoadon where khachhang = ?";

    @Override
    public void insert(HoaDon o) {
        JDBCService.executeInsert(insert, o.getKhachHang(), o.getNhanVien(),
                o.getMaGiamGia(), o.getNgayXuatHoaDon());
    }

    public void insertHaveOutput(HoaDon o) {
        ResultSet rs = null;
        if (o.getMaGiamGia() != 0) {
            rs = JDBCService.executeHaveOutput(insertHaveOutput, o.getKhachHang(),
                    o.getNhanVien() != 0 ? o.getNhanVien() : null,
                    o.getMaGiamGia(), o.getNgayXuatHoaDon());
        } else {

            rs = JDBCService.executeHaveOutput(insertHaveOutput, o.getKhachHang(),
                    o.getNhanVien() != 0 ? o.getNhanVien() : null, null, o.getNgayXuatHoaDon());
        }
        try {
            if (rs.next()) {
                o.setIdHoaDon(rs.getInt(1));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int selectCountByKhachHang(int khachhang){
        int count = 0;
        ResultSet rs = JDBCService.executeSelect(selectCountByKhachHang, khachhang);
        try {
            if(rs.next()){
                count = rs.getInt(1);
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return count;
    }

    @Deprecated
    @Override
    public void update(HoaDon o) {

    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<HoaDon> selectAll() {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public HoaDon selectID(Integer i) {
        HoaDon hoaDon = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                hoaDon = new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hoaDon;
    }

    public List<HoaDon> findByDate(String min, String max) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(findDate, min, max);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDon> selectByNhanVien(int nhanVien) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeSelect(selectByNhanVien, nhanVien);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDon> selectByTenNhanVien(String nhanVien) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(findNV, nhanVien);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDon> selectByTenKhachHang(String khachHang) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(findKH, khachHang);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public double tongTienHoaDon(int hoaDon) {
        double tongTien = 0;
        ResultSet rs = JDBCService.executeProcedure(tongTienHoaDon, hoaDon);
        try {
            if (rs.next()) {
                tongTien = rs.getDouble(2) + rs.getDouble(3);
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tongTien;
    }

    public List<HoaDon> selectByKhachHang(int khachHang) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeSelect(selectByKhachHang, khachHang);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<HoaDon> top10hd(){
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(top10hd);
        try {
            while(rs.next()){
                list.add(selectID(rs.getInt(1)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDon> hoaDonThangHienTai() {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(hdThangHienTai);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<HoaDon> hoaDonAdmin(){
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeProcedure(hoaDonAdmin);
        try {
            while(rs.next()){
                list.add(selectID(rs.getInt(1)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDon> selectByMonth(int month, int year) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        ResultSet rs = JDBCService.executeSelect(selectByDate, month, year);
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
