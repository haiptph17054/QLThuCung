package com.thucung.models;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN  💖
 *
 */
public class ChungLoai {
    
    private int idChungLoai;
    private String tenChungLoai;
    private String dacDiemNhanDang;

    public ChungLoai() {
    }

    public ChungLoai(int idChungLoai, String tenChungLoai, String dacDiemNhanDang) {
        this.idChungLoai = idChungLoai;
        this.tenChungLoai = tenChungLoai;
        this.dacDiemNhanDang = dacDiemNhanDang;
    }

    public int getIdChungLoai() {
        return idChungLoai;
    }

    public void setIdChungLoai(int idChungLoai) {
        this.idChungLoai = idChungLoai;
    }

    public String getTenChungLoai() {
        return tenChungLoai;
    }

    public void setTenChungLoai(String tenChungLoai) {
        this.tenChungLoai = tenChungLoai;
    }

    public String getDacDiemNhanDang() {
        return dacDiemNhanDang;
    }

    public void setDacDiemNhanDang(String dacDiemNhanDang) {
        this.dacDiemNhanDang = dacDiemNhanDang;
    }
}
