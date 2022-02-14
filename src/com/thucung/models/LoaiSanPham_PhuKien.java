package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class LoaiSanPham_PhuKien {
    
    private int idLoaiSanPham_PhuKien;
    private String tenLoaiSanPham_PhuKien;

    public LoaiSanPham_PhuKien() {
    }

    public LoaiSanPham_PhuKien(int idLoaiSanPham_PhuKien, String tenLoaiSanPham_PhuKien) {
        this.idLoaiSanPham_PhuKien = idLoaiSanPham_PhuKien;
        this.tenLoaiSanPham_PhuKien = tenLoaiSanPham_PhuKien;
    }

    public int getIdLoaiSanPham_PhuKien() {
        return idLoaiSanPham_PhuKien;
    }

    public void setIdLoaiSanPham_PhuKien(int idLoaiSanPham_PhuKien) {
        this.idLoaiSanPham_PhuKien = idLoaiSanPham_PhuKien;
    }

    public String getTenLoaiSanPham_PhuKien() {
        return tenLoaiSanPham_PhuKien;
    }

    public void setTenLoaiSanPham_PhuKien(String tenLoaiSanPham_PhuKien) {
        this.tenLoaiSanPham_PhuKien = tenLoaiSanPham_PhuKien;
    }
}
