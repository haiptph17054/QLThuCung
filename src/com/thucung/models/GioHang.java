package com.thucung.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class GioHang {

    private static GioHang instance;

    private final List<ThuCung> listThuCung;
    private final List<SanPham_PhuKien> listSanPham_PhuKien;
    private final List<Integer> soLuongSanPham_PhuKien;

    private GioHang() {
        listThuCung = new ArrayList<>();
        listSanPham_PhuKien = new ArrayList<>();
        soLuongSanPham_PhuKien = new ArrayList<>();
        
//        listThuCung.addAll(DAOService.thuCung.selectAll());
//        listSanPham_PhuKien.addAll(DAOService.sanPham_PhuKien.selectAll());
//        for(int i = 0 ; i < listSanPham_PhuKien.size(); i++){
//            soLuongSanPham_PhuKien.add(10);
//        }
    }

    public static GioHang getInstance() {
        if (instance == null) {
            instance = new GioHang();
        }
        return instance;
    }

    public void addThuCung(ThuCung thuCung) {
        boolean added = false;
        if (listThuCung.size() > 0) {
            for (int i = 0; i < listThuCung.size(); i++) {
                if (listThuCung.get(i).getIdThuCung() == thuCung.getIdThuCung()) {
                    added = true;
                    break;
                }
            }
        }
        if (!added) {
            listThuCung.add(thuCung);
        }
    }

    public void addSanPhamPhuKien(SanPham_PhuKien sanPham_PhuKien, int soLuong) {
        boolean added = false;
        int index = -1;
        if (listSanPham_PhuKien.size() > 0) {
            for (int i = 0; i < listSanPham_PhuKien.size(); i++) {
                if (listSanPham_PhuKien.get(i).getIdSanPham_PhuKien() == sanPham_PhuKien.getIdSanPham_PhuKien()) {
                    added = true;
                    index = i;
                    break;
                }
            }
        }
        if (!added) {
            listSanPham_PhuKien.add(sanPham_PhuKien);
            soLuongSanPham_PhuKien.add(soLuong);
        } else {
            soLuongSanPham_PhuKien.set(index, soLuong);
        }
    }
    
    public double getTongTien(){
        double tongTien = 0;
        for(ThuCung thuCung : listThuCung){
            tongTien += thuCung.getDonGia();
        }
        for(int i = 0; i < listSanPham_PhuKien.size(); i++){
            tongTien += (listSanPham_PhuKien.get(i).getDonGia() * soLuongSanPham_PhuKien.get(i));
        }
        return tongTien;
    }
    
    public boolean isEmpty(){
        return (listThuCung.isEmpty() && listSanPham_PhuKien.isEmpty());
    }

    public void removeThuCungIndex(int index) {
        listThuCung.remove(index);
    }

    public void removeSanPham_PhuKienIndex(int index) {
        listSanPham_PhuKien.remove(index);
        soLuongSanPham_PhuKien.remove(index);
    }
    
    public void removeAll(){
        listThuCung.clear();
        listSanPham_PhuKien.clear();
        soLuongSanPham_PhuKien.clear();
    }

    public List<ThuCung> getListThuCung() {
        return listThuCung;
    }

    public List<SanPham_PhuKien> getListSanPham_PhuKien() {
        return listSanPham_PhuKien;
    }

    public List<Integer> getSoLuongSanPham_PhuKien() {
        return soLuongSanPham_PhuKien;
    }
}
