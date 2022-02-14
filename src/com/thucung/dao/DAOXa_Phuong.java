package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.Xa_Phuong;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOXa_Phuong implements IDAOService<Xa_Phuong, Integer> {

    private final String selectOne = "select * from xa_phuong where idxa_phuong = ? and idhuyen = ? and idthanhpho = ?";
    private final String selectByHuyenThanhPho = "select * from xa_phuong where idhuyen = ? and idthanhpho = ?";

    @Deprecated
    @Override
    public void insert(Xa_Phuong o) {

    }

    @Deprecated
    @Override
    public void update(Xa_Phuong o) {

    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Deprecated
    @Override
    public List<Xa_Phuong> selectAll() {
        return null;
    }

    public List<Xa_Phuong> selectByHuyenThanhPho(int district, int city) {
        List<Xa_Phuong> list = new ArrayList<Xa_Phuong>();
        ResultSet rs = JDBCService.executeSelect(selectByHuyenThanhPho, district, city);
        try {
            while (rs.next()) {
                list.add(new Xa_Phuong(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Deprecated
    @Override
    public Xa_Phuong selectID(Integer i) {
        return null;
    }

    public Xa_Phuong selectID(int commune, int district, int city) {
        Xa_Phuong xa_Phuong = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, commune, district, city);
        try {
            if (rs.next()) {
                xa_Phuong = new Xa_Phuong(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return xa_Phuong;
    }

}
