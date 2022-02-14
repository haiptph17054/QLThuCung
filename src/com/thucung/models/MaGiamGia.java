package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class MaGiamGia {

    private int idMaGiamGia;
    private String maGiamGia;
    private int giaTri;
    private int soLuong;
    private String ngayBatDau;
    private String ngayKetThuc;

    public MaGiamGia() {
    }

    public MaGiamGia(int idMaGiamGia, String maGiamGia, int giaTri, int soLuong, String ngayBatDau, String ngayKetThuc) {
        this.idMaGiamGia = idMaGiamGia;
        this.maGiamGia = maGiamGia;
        this.giaTri = giaTri;
        this.soLuong = soLuong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getIdMaGiamGia() {
        return idMaGiamGia;
    }

    public void setIdMaGiamGia(int idMaGiamGia) {
        this.idMaGiamGia = idMaGiamGia;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
