package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class HoaDonChiTiet_ThuCung {
    
    private int idHoaDon;
    private int idThuCung;
    private double donGia;

    public HoaDonChiTiet_ThuCung() {
    }

    public HoaDonChiTiet_ThuCung(int idHoaDon, int idThuCung, double donGia) {
        this.idHoaDon = idHoaDon;
        this.idThuCung = idThuCung;
        this.donGia = donGia;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdThuCung() {
        return idThuCung;
    }

    public void setIdThuCung(int idThuCung) {
        this.idThuCung = idThuCung;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
