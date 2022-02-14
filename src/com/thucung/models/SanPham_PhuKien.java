package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class SanPham_PhuKien {
    
    private int idSanPham_PhuKien;
    private int loaiSanPham_PhuKien;
    private String tenSanPham_PhuKien;
    private int nhaCungCap;
    private int soLuong;
    private String donViTinh;
    private double donGia;
    private String chiTietSanPham;
    private String huongDanSuDung;
    private String hinhAnh;

    public SanPham_PhuKien() {
    }

    public SanPham_PhuKien(int idSanPham_PhuKien, int loaiSanPham_PhuKien, 
            String tenSanPham_PhuKien, int nhaCungCap, int soLuong, String donViTinh, 
            double donGia, String chiTietSanPham, String huongDanSuDung, String hinhAnh) {
        this.idSanPham_PhuKien = idSanPham_PhuKien;
        this.loaiSanPham_PhuKien = loaiSanPham_PhuKien;
        this.tenSanPham_PhuKien = tenSanPham_PhuKien;
        this.nhaCungCap = nhaCungCap;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
        this.chiTietSanPham = chiTietSanPham;
        this.huongDanSuDung = huongDanSuDung;
        this.hinhAnh = hinhAnh;
    }

    public int getIdSanPham_PhuKien() {
        return idSanPham_PhuKien;
    }

    public void setIdSanPham_PhuKien(int idSanPham_PhuKien) {
        this.idSanPham_PhuKien = idSanPham_PhuKien;
    }

    public int getLoaiSanPham_PhuKien() {
        return loaiSanPham_PhuKien;
    }

    public void setLoaiSanPham_PhuKien(int loaiSanPham_PhuKien) {
        this.loaiSanPham_PhuKien = loaiSanPham_PhuKien;
    }

    public String getTenSanPham_PhuKien() {
        return tenSanPham_PhuKien;
    }

    public void setTenSanPham_PhuKien(String tenSanPham_PhuKien) {
        this.tenSanPham_PhuKien = tenSanPham_PhuKien;
    }

    public int getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(int nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getChiTietSanPham() {
        return chiTietSanPham;
    }

    public void setChiTietSanPham(String chiTietSanPham) {
        this.chiTietSanPham = chiTietSanPham;
    }

    public String getHuongDanSuDung() {
        return huongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        this.huongDanSuDung = huongDanSuDung;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
