package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.models.LoaiSanPham_PhuKien;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class DAOLoaiSanPham_PhuKien implements IDAOService<LoaiSanPham_PhuKien, Integer>{

    private final String insert = "insert into loaisanpham_phukien values (?)";
    private final String update = "update loaisanpham_phukien set tenloaisanpham_phukien = ? where idloaisanpham_phukien = ?";
    private final String delete = "delete loaisanpham_phukien where idloaisanpham_phukien = ?";
    private final String selectAll = "select * from loaisanpham_phukien";
    private final String selectOne = "select * from loaisanpham_phukien where idloaisanpham_phukien = ?";
    
    @Override
    public void insert(LoaiSanPham_PhuKien o) {
        JDBCService.executeInsert(insert, o.getTenLoaiSanPham_PhuKien());
    }

    @Override
    public void update(LoaiSanPham_PhuKien o) {
        JDBCService.executeUpdate(update, o.getTenLoaiSanPham_PhuKien(), o.getIdLoaiSanPham_PhuKien());
    }

    @Override
    public void delete(Integer i) {
        JDBCService.executeDelete(delete, i);
    }

    @Override
    public List<LoaiSanPham_PhuKien> selectAll() {
        List<LoaiSanPham_PhuKien> list = new ArrayList<LoaiSanPham_PhuKien>();
        ResultSet rs = JDBCService.executeSelect(selectAll);
        try {
            while(rs.next()){
                list.add(new LoaiSanPham_PhuKien(rs.getInt(1), rs.getString(2)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    @Override
    public LoaiSanPham_PhuKien selectID(Integer i) {
        LoaiSanPham_PhuKien loaiSanPham_PhuKien = null;
        ResultSet rs = JDBCService.executeSelect(selectOne, i);
        try {
            if(rs.next()){
                loaiSanPham_PhuKien = new LoaiSanPham_PhuKien(rs.getInt(1), rs.getString(2));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return loaiSanPham_PhuKien;
    }

}
