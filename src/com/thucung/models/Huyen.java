package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class Huyen {
    
    private int idHuyen;
    private int idThanhPho;
    private String tenHuyen;

    public Huyen() {
    }

    public Huyen(int idHuyen, int idThanhPho, String tenHuyen) {
        this.idHuyen = idHuyen;
        this.idThanhPho = idThanhPho;
        this.tenHuyen = tenHuyen;
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

    public String getTenHuyen() {
        return tenHuyen;
    }

    public void setTenHuyen(String tenHuyen) {
        this.tenHuyen = tenHuyen;
    }
}
