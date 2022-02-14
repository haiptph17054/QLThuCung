package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.SanPham_PhuKien;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Map;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOSanPham_PhuKien implements IDAOService<SanPham_PhuKien, Integer> {
    
    private final String insert = "insert into sanpham_phukien values (?,?,?,?,?,?,?,?,?)";
    private final String update = "update sanpham_phukien set loaisanpham_phukien = ?,"
            + "tensanpham_phukien = ?, nhacungcap = ?, soluong = ?, donvitinh = ?, dongia = ?,"
            + "chitietsanpham = ?, huongdansudung = ?, hinhanh = ? where idsanpham_phukien = ?";
    private final String delete = "delete sanpham_phukien where idsanpham_phukien = ?";
    private final String selectAll = "select * from sanpham_phukien";
    private final String selectOne = "select * from sanpham_phukien where idsanpham_phukien = ?";
    private final String selectAvailable = "select * from sanpham_phukien where soluong > 0";
    private final String find = "timsanpham_phukien ?";
    private final String findPrice = "timsanpham_phukienkhoanggia ?,?";
    private final String findLoaiSanPham_PhuKien = "select * from sanpham_phukien where loaisanpham_phukien = ? and soluong > 0";
    private final String subtractionSoluong = "trusanpham_phukien ?,?";
    private final String selectByNCC = "select * from sanpham_phukien where nhacungcap = ?";
    
    @Override
    public void insert(SanPham_PhuKien o) {
        JDBCService.executeInsert(insert, o.getLoaiSanPham_PhuKien(), o.getTenSanPham_PhuKien(),
                o.getNhaCungCap(), o.getSoLuong(), o.getDonViTinh(), o.getDonGia(), o.getChiTietSanPham(),
                o.getHuongDanSuDung(), o.getHinhAnh());
    }
    
    @Override
    public void update(SanPham_PhuKien o) {
        JDBCService.executeUpdate(update, o.getLoaiSanPham_PhuKien(), o.getTenSanPham_PhuKien(),
                o.getNhaCungCap(), o.getSoLuong(), o.getDonViTinh(), o.getDonGia(), o.getChiTietSanPham(),
                o.getHuongDanSuDung(), o.getHinhAnh(), o.getIdSanPham_PhuKien());
    }
    
    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }
    
    @Override
    public List<SanPham_PhuKien> selectAll() {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    @Override
    public SanPham_PhuKien selectID(Integer i) {
        SanPham_PhuKien sanPham_PhuKien = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                sanPham_PhuKien = new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sanPham_PhuKien;
    }
    
    public List<SanPham_PhuKien> find(String name) {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeProcedure(find, name);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<SanPham_PhuKien> findPrice(double min, double max) {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeProcedure(findPrice, min, max);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<SanPham_PhuKien> findLoaiSanPham_PhuKien(int loaiSanPham_PhuKien) {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(findLoaiSanPham_PhuKien, loaiSanPham_PhuKien);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public void subtractionSoluong(Map<Integer, Integer> mapSoLuong, Integer... ids) {
        for (int i = 0; i < ids.length; i++) {
            JDBCService.executeProcedureIUD(subtractionSoluong, ids[i], mapSoLuong.get(ids[i]));
        }
    }
    
    public List<SanPham_PhuKien> selectAvailable() {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectAvailable);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public List<SanPham_PhuKien> selectByNCC(int nhaCungCap) {
        List<SanPham_PhuKien> list = new ArrayList<SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectByNCC, nhaCungCap);
        try {
            while (rs.next()) {
                list.add(new SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
}
