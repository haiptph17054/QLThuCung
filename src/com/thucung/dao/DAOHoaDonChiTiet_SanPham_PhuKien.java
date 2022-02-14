package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.HoaDonChiTiet_SanPham_PhuKien;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOHoaDonChiTiet_SanPham_PhuKien implements IDAOService<HoaDonChiTiet_SanPham_PhuKien, Integer> {

    private final String insert = "insert into hoadonchitiet_sanpham_phukien values (?,?,?,?)";
    private final String selectAll = "select * from hoadonchitiet_sanpham_phukien";
    private final String selectByIDHoaDon = "select * from hoadonchitiet_sanpham_phukien where idhoadon = ?";
    private final String selectByIDSanPham_PhuKien = "select * from hoadonchitiet_sanpham_phukien where idsanpham_phukien = ?";

    @Override
    public void insert(HoaDonChiTiet_SanPham_PhuKien o) {
        JDBCService.executeInsert(insert, o.getIdHoaDon(), o.getIdSanPham_PhuKien(), o.getSoLuong(), o.getDonGia());
    }

    @Deprecated
    @Override
    public void update(HoaDonChiTiet_SanPham_PhuKien o) {

    }

    public void insertList(List<HoaDonChiTiet_SanPham_PhuKien> list) {
        if (list.isEmpty()) {
            return;
        }
        String sql = insert;
        Map<Integer, Integer> mapSoLuong = new HashMap<Integer, Integer>();
        Integer[] ids = new Integer[list.size()];
        ids[0] = list.get(0).getIdSanPham_PhuKien();
        mapSoLuong.put(ids[0], list.get(0).getSoLuong());
        for (int i = 1; i < list.size(); i++) {
            sql += ",(?,?,?,?)";
            ids[i] = list.get(i).getIdSanPham_PhuKien();
            mapSoLuong.put(ids[i], list.get(i).getSoLuong());
        }
        Object[] objects = new Object[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            objects[i * 4] = list.get(i).getIdHoaDon();
            objects[i * 4 + 1] = list.get(i).getIdSanPham_PhuKien();
            objects[i * 4 + 2] = list.get(i).getSoLuong();
            objects[i * 4 + 3] = list.get(i).getDonGia();
        }
        JDBCService.executeInsert(sql, objects);
        DAOService.sanPham_PhuKien.subtractionSoluong(mapSoLuong, ids);
    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Override
    public List<HoaDonChiTiet_SanPham_PhuKien> selectAll() {
        List<HoaDonChiTiet_SanPham_PhuKien> list = new ArrayList<HoaDonChiTiet_SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<HoaDonChiTiet_SanPham_PhuKien> selectByIDSanPham_PhuKien(int sanPham_PhuKien) {
        List<HoaDonChiTiet_SanPham_PhuKien> list = new ArrayList<HoaDonChiTiet_SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectByIDSanPham_PhuKien, sanPham_PhuKien);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDonChiTiet_SanPham_PhuKien> selectByIDHoaDon(int id) {
        List<HoaDonChiTiet_SanPham_PhuKien> list = new ArrayList<HoaDonChiTiet_SanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectByIDHoaDon, id);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_SanPham_PhuKien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Deprecated
    @Override
    public HoaDonChiTiet_SanPham_PhuKien selectID(Integer i) {
        return null;
    }
}
