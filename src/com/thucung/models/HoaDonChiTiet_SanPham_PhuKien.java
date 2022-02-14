package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class HoaDonChiTiet_SanPham_PhuKien {

    private int idHoaDon;
    private int idSanPham_PhuKien;
    private int soLuong;
    private double donGia;

    public HoaDonChiTiet_SanPham_PhuKien() {
    }

    public HoaDonChiTiet_SanPham_PhuKien(int idHoaDon, int idSanPham_PhuKien, int soLuong, double donGia) {
        this.idHoaDon = idHoaDon;
        this.idSanPham_PhuKien = idSanPham_PhuKien;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdSanPham_PhuKien() {
        return idSanPham_PhuKien;
    }

    public void setIdSanPham_PhuKien(int idSanPham_PhuKien) {
        this.idSanPham_PhuKien = idSanPham_PhuKien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
