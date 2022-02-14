package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class TaiKhoan {
    
    private String taiKhoan;
    private String matKhau;
    private int nhanVien;
    private int vaiTro;
    private int trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau, int nhanVien, int vaiTro, int trangThai) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.nhanVien = nhanVien;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(int nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
