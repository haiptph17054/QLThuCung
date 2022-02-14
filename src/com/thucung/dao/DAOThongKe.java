package com.thucung.dao;

import com.thucung.jdbc.JDBCService;
import com.thucung.dao.DAOThongKe.ThongKeTheoNhanVien;
import com.thucung.models.HoaDon;
import com.thucung.models.NhanVien;
import com.thucung.other.Config;
import com.thucung.util.DateUtil;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DAOThongKe {

    private final String tkdtbhnvttn = "tkdtbhnvttn ?,?,?"; //nhânviên,tháng,năm
    private final String tkdtbhadminttn = "tkdtbhadminttn ?,?"; //tháng,năm
    private final String tkbh12ttn = "tkbh12ttn ?"; //nhânviên
    private final String sodonhangtrongthang = "sodonhangtrongthang ?,?";
    private final String tongTienHoaDon = "tongtienhoadon ?";
    private final String top5sanphamtrongthang = "top5sanphamtrongthang ?,?";
    private final String soluongsanphambantrongthang = "soluongsanphambantrongthang ?,?";

    public double getThuNhapThang(int thang, int year) {
        double thuNhapThang = 0;
        List<HoaDon> listHoaDon = DAOService.hoaDon.selectByMonth(thang, year);
        for (HoaDon hoaDon : listHoaDon) {
            ResultSet rs = JDBCService.executeProcedure(tongTienHoaDon, hoaDon.getIdHoaDon());
            try {
                if (rs.next()) {
                    thuNhapThang += (rs.getDouble(2) + rs.getDouble(3));
                }
                rs.getStatement().close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return thuNhapThang;
    }

    public int getSoDonTrongThang(int thang, int nam) {
        int soLuongDonTrongThang = 0;
        ResultSet rs = JDBCService.executeProcedure(sodonhangtrongthang, thang, nam);
        try {
            if (rs.next()) {
                soLuongDonTrongThang = rs.getInt(1);
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return soLuongDonTrongThang;
    }

    public List<ThongKeTheoNhanVien> getTop3NV() {
        List<ThongKeTheoNhanVien> list = new ArrayList<ThongKeTheoNhanVien>();
        List<NhanVien> listNhanVien = DAOService.nhanVien.selectAll();
        for (NhanVien nhanVien : listNhanVien) {
            list.add(getThongKeTheoThangNamNhanVien(nhanVien.getIdNhanVien(), DateUtil.getMonthNow(), DateUtil.getYearNow()));
        }
        list.sort((ThongKeTheoNhanVien o1, ThongKeTheoNhanVien o2) -> {
            Double d1 = o1.getTongTien();
            Double d2 = o2.getTongTien();
            return d2.compareTo(d1);
        });
        if (list.size() > 3) {
            for (int i = 2; i < list.size(); i++) {
                list.remove(i);
            }
        }
        return list;
    }

    public ThongKeTheoNhanVien getThongKeTheoThangNamAdmin(int thang, int nam) {
        ThongKeTheoNhanVien thongKe = null;
        ResultSet rs = JDBCService.executeProcedure(tkdtbhadminttn, thang, nam);
        try {
            if (rs.next()) {
                thongKe = new ThongKeTheoNhanVien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5) + rs.getDouble(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return thongKe;
    }

    public ThongKeTheoNhanVien getThongKeTheoThangNamNhanVien(int nhanVien, int thang, int nam) {
        ThongKeTheoNhanVien thongKe = null;
        ResultSet rs = JDBCService.executeProcedure(tkdtbhnvttn, nhanVien, thang, nam);
        try {
            if (rs.next()) {
                thongKe = new ThongKeTheoNhanVien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5) + rs.getDouble(6));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return thongKe;
    }

    public List<ThongKeTheoNhanVien> getThongKeNamNV(int nhanVien) {
        List<ThongKeTheoNhanVien> listThongKe = new ArrayList<ThongKeTheoNhanVien>();
        ResultSet rs = JDBCService.executeProcedure(tkbh12ttn, nhanVien);
        try {
            while (rs.next()) {
                listThongKe.add(new ThongKeTheoNhanVien(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5)));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listThongKe;
    }

    public int soluongsanphambantrongthang(int thang, int nam) {
        int soLuong = 0;
        ResultSet rs = JDBCService.executeProcedure(soluongsanphambantrongthang, thang, nam);
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return soLuong;
    }

    public List<SanPham_PhuKienThang> top5SanPhamThang(int thang, int nam) {
        List<SanPham_PhuKienThang> list = new ArrayList<SanPham_PhuKienThang>();
        int soLuongSanPhamBanTrongThang = soluongsanphambantrongthang(thang, nam);
        ResultSet rs = JDBCService.executeProcedure(top5sanphamtrongthang, thang, nam);
        try {
            while (rs.next()) {
                int soLuong = rs.getInt(2);
                double tiLe = Double.parseDouble(Config.formatDecimal.format((float) soLuong / soLuongSanPhamBanTrongThang * 100));
                list.add(new SanPham_PhuKienThang(rs.getInt(1), soLuong, tiLe));
            }
            rs.getStatement().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public class SanPham_PhuKienThang {

        private int idSanPham_PhuKien;
        private int soLuong;
        private double tiLePT;

        public SanPham_PhuKienThang() {
        }

        public SanPham_PhuKienThang(int idSanPham_PhuKien, int soLuong, double tiLePT) {
            this.idSanPham_PhuKien = idSanPham_PhuKien;
            this.soLuong = soLuong;
            this.tiLePT = tiLePT;
        }

        public int getIdSanPham_PhuKien() {
            return idSanPham_PhuKien;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public double getTiLePT() {
            return tiLePT;
        }
    }

    public class ThongKeTheoNhanVien {

        private int nhanVien;
        private int thang;
        private int nam;
        private int soLuongDon;
        private double tongTien;

        public ThongKeTheoNhanVien() {
        }

        public ThongKeTheoNhanVien(int nhanVien, int thang, int nam, int soLuongDon, double tongTien) {
            this.nhanVien = nhanVien;
            this.thang = thang;
            this.nam = nam;
            this.soLuongDon = soLuongDon;
            this.tongTien = tongTien;
        }

        public int getNhanVien() {
            return nhanVien;
        }

        public void setNhanVien(int nhanVien) {
            this.nhanVien = nhanVien;
        }

        public int getThang() {
            return thang;
        }

        public void setThang(int thang) {
            this.thang = thang;
        }

        public int getNam() {
            return nam;
        }

        public void setNam(int nam) {
            this.nam = nam;
        }

        public int getSoLuongDon() {
            return soLuongDon;
        }

        public void setSoLuongDon(int soLuongDon) {
            this.soLuongDon = soLuongDon;
        }

        public double getTongTien() {
            return tongTien;
        }

        public void setTongTien(double tongTien) {
            this.tongTien = tongTien;
        }
    }
}
