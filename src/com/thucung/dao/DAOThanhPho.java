package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.ThanhPho;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOThanhPho implements IDAOService<ThanhPho, Integer> {

    private final String selectAll = "select * from thanhpho";
    private final String selectOne = "select * from thanhpho where idthanhpho = ?";

    @Deprecated
    @Override
    public void insert(ThanhPho o) {

    }

    @Deprecated
    @Override
    public void update(ThanhPho o) {

    }

    @Deprecated
    @Override
    public void delete(Integer i) {

    }

    @Override
    public List<ThanhPho> selectAll() {
        List<ThanhPho> list = new ArrayList<ThanhPho>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while (rs.next()) {
                list.add(new ThanhPho(rs.getInt(1), rs.getString(2)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public ThanhPho selectID(Integer i) {
        ThanhPho thanhPho = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if (rs.next()) {
                thanhPho = new ThanhPho(rs.getInt(1), rs.getString(2));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return thanhPho;
    }

}
