package com.thucung.models;

/**
 *
 * @author ๐ Trแบงn Lแบกi ๐
 * @copyright ๐ GirlkuN  ๐
 *
 */
public class ThanhPho {
    
    private int idThanhPho;
    private String tenThanhPho;

    public ThanhPho() {
    }

    public ThanhPho(int idThanhPho, String tenThanhPho) {
        this.idThanhPho = idThanhPho;
        this.tenThanhPho = tenThanhPho;
    }

    public int getIdThanhPho() {
        return idThanhPho;
    }

    public void setIdThanhPho(int idThanhPho) {
        this.idThanhPho = idThanhPho;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }
}
