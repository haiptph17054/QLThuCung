package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class Xa_Phuong {

    private int idXa_Phuong;
    private int idHuyen;
    private int idThanhPho;
    private String tenXa_Phuong;

    public Xa_Phuong() {
    }

    public Xa_Phuong(int idXa_Phuong, int idHuyen, int idThanhPho, String tenXa_Phuong) {
        this.idXa_Phuong = idXa_Phuong;
        this.idHuyen = idHuyen;
        this.idThanhPho = idThanhPho;
        this.tenXa_Phuong = tenXa_Phuong;
    }

    public int getIdXa_Phuong() {
        return idXa_Phuong;
    }

    public void setIdXa_Phuong(int idXa_Phuong) {
        this.idXa_Phuong = idXa_Phuong;
    }

    public int getIdHuyen() {
        return idHuyen;
    }

    public void setIdHuyen(int idHuyen) {
        this.idHuyen = idHuyen;
    }

    public int getIdThanhPho() {
        return idThanhPho;
    }

    public void setIdThanhPho(int idThanhPho) {
        this.idThanhPho = idThanhPho;
    }

    public String getTenXa_Phuong() {
        return tenXa_Phuong;
    }

    public void setTenXa_Phuong(String tenXa_Phuong) {
        this.tenXa_Phuong = tenXa_Phuong;
    }
}
