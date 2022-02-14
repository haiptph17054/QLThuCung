package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class HoaDon {

    private int idHoaDon;
    private int khachHang;
    private int nhanVien;
    private int maGiamGia;
    private String ngayXuatHoaDon;

    public HoaDon() {
    }

    public HoaDon(int idHoaDon, int khachHang, int nhanVien, int maGiamGia, String ngayXuatHoaDon) {
        this.idHoaDon = idHoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maGiamGia = maGiamGia;
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(int khachHang) {
        this.khachHang = khachHang;
    }

    public int getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(int nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(int maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getNgayXuatHoaDon() {
        return ngayXuatHoaDon;
    }

    public void setNgayXuatHoaDon(String ngayXuatHoaDon) {
        this.ngayXuatHoaDon = ngayXuatHoaDon;
    }
}
