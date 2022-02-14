package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class ThuCung {
    
    private int idThuCung;
    private int chungLoai;
    private String tenThuCung;
    private int nhaCungCap;
    private int gioiTinh;
    private String mauSac;
    private int thangTuoi;
    private double donGia;
    private String thongTinChiTiet;
    private String hinhAnh;
    private int trangthai;

    public ThuCung() {
    }

    public ThuCung(int idThuCung, int chungLoai, String tenThuCung, int nhaCungCap, int gioiTinh, String mauSac, int thangTuoi, double donGia, String thongTinChiTiet, String hinhAnh, int trangthai) {
        this.idThuCung = idThuCung;
        this.chungLoai = chungLoai;
        this.tenThuCung = tenThuCung;
        this.nhaCungCap = nhaCungCap;
        this.gioiTinh = gioiTinh;
        this.mauSac = mauSac;
        this.thangTuoi = thangTuoi;
        this.donGia = donGia;
        this.thongTinChiTiet = thongTinChiTiet;
        this.hinhAnh = hinhAnh;
        this.trangthai = trangthai;
    }

    public int getIdThuCung() {
        return idThuCung;
    }

    public void setIdThuCung(int idThuCung) {
        this.idThuCung = idThuCung;
    }

    public int getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(int chungLoai) {
        this.chungLoai = chungLoai;
    }

    public String getTenThuCung() {
        return tenThuCung;
    }

    public void setTenThuCung(String tenThuCung) {
        this.tenThuCung = tenThuCung;
    }

    public int getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(int nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getThangTuoi() {
        return thangTuoi;
    }

    public void setThangTuoi(int thangTuoi) {
        this.thangTuoi = thangTuoi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setGia(double donGia) {
        this.donGia = donGia;
    }

    public String getThongTinChiTiet() {
        return thongTinChiTiet;
    }

    public void setThongTinChiTiet(String thongTinChiTiet) {
        this.thongTinChiTiet = thongTinChiTiet;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
}
