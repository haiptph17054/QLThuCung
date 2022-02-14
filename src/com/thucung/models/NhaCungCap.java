package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class NhaCungCap {

    private int idNhaCungCap;
    private String tenNhaCungCap;
    private String ngayHopTac;
    private String diaChi;
    private String soDienThoai;
    private int trangThai;

    public NhaCungCap() {
    }

    public NhaCungCap(int idNhaCungCap, String tenNhaCungCap, String ngayHopTac, String diaChi, String soDienThoai, int trangThai) {
        this.idNhaCungCap = idNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.ngayHopTac = ngayHopTac;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
    }

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getNgayHopTac() {
        return ngayHopTac;
    }

    public void setNgayHopTac(String ngayHopTac) {
        this.ngayHopTac = ngayHopTac;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
