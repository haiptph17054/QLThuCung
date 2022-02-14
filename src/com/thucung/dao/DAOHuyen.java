package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.Huyen;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOHuyen implements IDAOService<Huyen, Integer> {

    private final String selectByThanhPho = "select * from huyen where idthanhpho = ?";
    private final String selectOne = "select * from huyen where idhuyen = ? and idthanhpho = ?";

    @Deprecated
    @Override
    public void insert(Huyen o) {

    }

    @Deprecated
    @Override
    public void update(Huyen o) {

    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Deprecated
    @Override
    public List<Huyen> selectAll() {
        return null;
    }

    public List<Huyen> selectByThanhPho(int city) {
        List<Huyen> list = new ArrayList<Huyen>();
        ResultSet rs = JDBCService.executeSelect(selectByThanhPho, city);
        try {
            while (rs.next()) {
                list.add(new Huyen(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Deprecated
    @Override
    public Huyen selectID(Integer i) {
        return null;
    }

    public Huyen selectID(int district, int city) {
        Huyen huyen = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, district, city);
        try {
            if (rs.next()) {
                huyen = new Huyen(rs.getInt(1), rs.getInt(2), rs.getString(3));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return huyen;
    }

}
