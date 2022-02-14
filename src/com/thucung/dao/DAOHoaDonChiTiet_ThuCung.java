package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.HoaDonChiTiet_ThuCung;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOHoaDonChiTiet_ThuCung implements IDAOService<HoaDonChiTiet_ThuCung, Integer> {

    private final String insert = "insert into hoadonchitiet_thucung values (?,?,?)";
    private final String selectAll = "select * from hoadonchitiet_thucung";
    private final String selectByIDHoaDon = "select * from hoadonchitiet_thucung where idhoadon = ?";
    private final String selectByIDThuCung = "select * from hoadonchitiet_thucung where idthucung = ?";

    @Override
    public void insert(HoaDonChiTiet_ThuCung o) {
        JDBCService.executeInsert(insert, o.getIdHoaDon(), o.getIdThuCung(), o.getDonGia());
    }

    public void insertList(List<HoaDonChiTiet_ThuCung> list) {
        if (list.isEmpty()) {
            return;
        }
        String sql = insert;
        Integer[] ids = new Integer[list.size()];
        ids[0] = list.get(0).getIdThuCung();
        for (int i = 1; i < list.size(); i++) {
            sql += ",(?,?,?)";
            ids[i] = list.get(i).getIdThuCung();
        }
        Object[] objects = new Object[list.size() * 3];
        for (int i = 0; i < list.size(); i++) {
            objects[i * 3] = list.get(i).getIdHoaDon();
            objects[i * 3 + 1] = list.get(i).getIdThuCung();
            objects[i * 3 + 2] = list.get(i).getDonGia();
        }
        JDBCService.executeInsert(sql, objects);
        DAOService.thuCung.unavailable(ids);
    }

    @Deprecated
    @Override
    public void update(HoaDonChiTiet_ThuCung o) {

    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Override
    public List<HoaDonChiTiet_ThuCung> selectAll() {
        List<HoaDonChiTiet_ThuCung> list = new ArrayList<HoaDonChiTiet_ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_ThuCung(rs.getInt(1), rs.getInt(2), rs.getDouble(3)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDonChiTiet_ThuCung> selectByIDThuCung(int thuCung) {
        List<HoaDonChiTiet_ThuCung> list = new ArrayList<HoaDonChiTiet_ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectByIDThuCung, thuCung);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_ThuCung(rs.getInt(1), rs.getInt(2), rs.getDouble(3)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDonChiTiet_ThuCung> selectByIDHoaDon(int id) {
        List<HoaDonChiTiet_ThuCung> list = new ArrayList<HoaDonChiTiet_ThuCung>();
        ResultSet rs = JDBCService.executeSelect(selectByIDHoaDon, id);
        try {
            while (rs.next()) {
                list.add(new HoaDonChiTiet_ThuCung(rs.getInt(1), rs.getInt(2), rs.getDouble(3)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Deprecated
    @Override
    public HoaDonChiTiet_ThuCung selectID(Integer i) {
        return null;
    }

}
