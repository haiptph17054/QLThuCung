package com.thucung.dao;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOService {

    static {
        chungLoai = new DAOChungLoai();
        thuCung = new DAOThuCung();
        loaiSanPham_PhuKien = new DAOLoaiSanPham_PhuKien();
        hoaDonChiTiet_ThuCung = new DAOHoaDonChiTiet_ThuCung();
        nhaCungCap = new DAONhaCungCap();
        sanPham_PhuKien = new DAOSanPham_PhuKien();
        nhanVien = new DAONhanVien();
        hoaDon = new DAOHoaDon();
        hoaDonChiTiet_SanPham_PhuKien = new DAOHoaDonChiTiet_SanPham_PhuKien();
        taiKhoan = new DAOTaiKhoan();
        maGiamGia = new DAOMaGiamGia();
        khachHang = new DAOKhachHang();
        thanhPho = new DAOThanhPho();
        huyen = new DAOHuyen();
        xa_Phuong = new DAOXa_Phuong();
        thongKe = new DAOThongKe();
    }

    public static DAOChungLoai chungLoai;
    public static DAOThuCung thuCung;
    public static DAOLoaiSanPham_PhuKien loaiSanPham_PhuKien;
    public static DAOHoaDonChiTiet_ThuCung hoaDonChiTiet_ThuCung;
    public static DAONhaCungCap nhaCungCap;
    public static DAOSanPham_PhuKien sanPham_PhuKien;
    public static DAONhanVien nhanVien;
    public static DAOHoaDon hoaDon;
    public static DAOHoaDonChiTiet_SanPham_PhuKien hoaDonChiTiet_SanPham_PhuKien;
    public static DAOTaiKhoan taiKhoan;
    public static DAOMaGiamGia maGiamGia;
    public static DAOKhachHang khachHang;
    public static DAOThanhPho thanhPho;
    public static DAOHuyen huyen;
    public static DAOXa_Phuong xa_Phuong;
    public static DAOThongKe thongKe;

    public static void open() {
        
    }

    private DAOService() {
    }

}
