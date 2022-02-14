package com.thucung.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.thucung.dao.DAOService;
import com.thucung.models.HoaDon;
import com.thucung.models.HoaDonChiTiet_SanPham_PhuKien;
import com.thucung.models.HoaDonChiTiet_ThuCung;
import com.thucung.models.MaGiamGia;
import com.thucung.other.Config;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ExportHoaDon {

    private static final Font fontTitle = getFont("data/font/Itim-Regular.ttf", 22f, Font.BOLD, new BaseColor(255, 0, 0));
    private static final Font fontInfo = getFont("data/font/Itim-Regular.ttf", 14f, Font.NORMAL, new BaseColor(255, 0, 0));
    private static final Font fontTitleTable = getFont("data/font/Itim-Regular.ttf", 16f, Font.BOLD, new BaseColor(255, 0, 0));
    private static final Font fontHeaderAndFooterTable = getFont("data/font/Itim-Regular.ttf", 12f, Font.BOLD, new BaseColor(255, 0, 0));
    private static final Font fontProducts = getFont("data/font/Itim-Regular.ttf", 12f, Font.NORMAL, new BaseColor(255, 0, 0));

    private static final String filePath = "data/hoadon/";

    private static String initNameForFile(HoaDon hoaDon) {
        return "hoadon" + CharUtil.removeChar(DateUtil.changeTimeUStoVN(hoaDon.getNgayXuatHoaDon()), ":", " ", "-");
    }

    public static void createPDF(HoaDon hoaDon) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            Rectangle pageSize = new Rectangle(595, 842);
            Document document = new Document(pageSize, 70, 70, 40, 40);
            String dest = filePath + initNameForFile(hoaDon) + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(new File(dest)));
            document.open();
            addInfo(document, hoaDon);
            addDanhSachSanPham(document, hoaDon);
            setBackground(document, "data/icon/bgpet.jpg");
            document.close();
            Desktop.getDesktop().open(new File(dest));
        } catch (Exception ex) {
            DialogUtil.showAlert(ex.getMessage(), null);
        }
    }

    private static Font getFont(String fontPath, float fontSize, int fontStyle, BaseColor color) {
        BaseFont base = null;
        try {
            base = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        } catch (Exception ex) {
            DialogUtil.showAlert(ex.getMessage(), null);
        }
        return new Font(base, fontSize, fontStyle, color);
    }

    private static void addInfo(Document document, HoaDon hoaDon) throws Exception {
        String thuNgan;
        if (hoaDon.getNhanVien() == 0) {
            thuNgan = Config.ADMIN_NAME;
        } else {
            thuNgan = DAOService.nhanVien.selectID(hoaDon.getNhanVien()).getTenNhanVien();
        }
        Paragraph tieuDe = new Paragraph(40f, "Hóa đơn mua hàng", fontTitle);
        tieuDe.setAlignment(Element.ALIGN_CENTER);
        Paragraph idHoaDon = new Paragraph(String.format("%s%s", "Mã hóa đơn: ", "HD" + hoaDon.getIdHoaDon()), fontInfo);
        Paragraph khachHang = new Paragraph(String.format("%s%s", "Khách hàng: ",
                DAOService.khachHang.selectID(hoaDon.getKhachHang()).getTenKhachHang()), fontInfo);
        Paragraph nhanvien = new Paragraph(String.format("%s%s", "Thu ngân: ", thuNgan), fontInfo);
        Paragraph ngayXuatHoaDon = new Paragraph(String.format("%s%s", "Ngày xuất hóa đơn: ",
                DateUtil.changeTimeUStoVN(hoaDon.getNgayXuatHoaDon())), fontInfo);
        MaGiamGia mgg = DAOService.maGiamGia.selectID(hoaDon.getMaGiamGia());
        String giaTri = "";
        if (mgg != null) {
            giaTri = mgg.getMaGiamGia() + " " + "( giảm" + mgg.getGiaTri() + " %)";
        }
        Paragraph maGiamGia = new Paragraph(
                String.format("%s%s", "Mã giảm giá: ", giaTri), fontInfo);
        Paragraph danhSachSanPham = new Paragraph("Danh sách sản phẩm: ", fontTitleTable);
        danhSachSanPham.setAlignment(Element.ALIGN_CENTER);

        //------------------------------------------------------------------
        document.add(tieuDe);
        document.add(idHoaDon);
        document.add(khachHang);
        document.add(nhanvien);
        document.add(ngayXuatHoaDon);
        document.add(maGiamGia);
        document.add(danhSachSanPham);
    }

    private static void addDanhSachSanPham(Document document, HoaDon hoaDon) throws Exception {
        double tongTien = 0;

        PdfPTable table = new PdfPTable(4);
        table.setSpacingBefore(10f);
        table.setWidths(new int[]{25, 50, 18, 30});
        addHeaderTable(table, "ID sản phẩm");
        addHeaderTable(table, "Tên sản phẩm");
        addHeaderTable(table, "Số lượng");
        addHeaderTable(table, "Đơn giá");

        List<HoaDonChiTiet_ThuCung> listThuCung = DAOService.hoaDonChiTiet_ThuCung.selectByIDHoaDon(hoaDon.getIdHoaDon());
        List<HoaDonChiTiet_SanPham_PhuKien> listSanPham_PhuKien = DAOService.hoaDonChiTiet_SanPham_PhuKien.selectByIDHoaDon(hoaDon.getIdHoaDon());

        for (HoaDonChiTiet_ThuCung hoadDonThuCung : listThuCung) {
            tongTien += hoadDonThuCung.getDonGia();
            PdfPCell cell1 = new PdfPCell(new Phrase("TC" + hoadDonThuCung.getIdThuCung(), fontProducts));
            PdfPCell cell2 = new PdfPCell(new Phrase(DAOService.thuCung.selectID(hoadDonThuCung.getIdThuCung()).getTenThuCung(), fontProducts));
            PdfPCell cell3 = new PdfPCell(new Phrase("1", fontProducts));
            PdfPCell cell4 = new PdfPCell(new Phrase(hoadDonThuCung.getDonGia() + " VNĐ", fontProducts));

            setCell(cell1, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell2, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell3, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell4, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);

            cell1.setBackgroundColor(BaseColor.WHITE);
            cell2.setBackgroundColor(BaseColor.WHITE);
            cell3.setBackgroundColor(BaseColor.WHITE);
            cell4.setBackgroundColor(BaseColor.WHITE);

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
        }

        for (HoaDonChiTiet_SanPham_PhuKien hoadDonChiTiet_SanPham_PhuKien : listSanPham_PhuKien) {
            tongTien += hoadDonChiTiet_SanPham_PhuKien.getDonGia();
            PdfPCell cell1 = new PdfPCell(new Phrase("SP-PK" + hoadDonChiTiet_SanPham_PhuKien.getIdSanPham_PhuKien(), fontProducts));
            PdfPCell cell2 = new PdfPCell(new Phrase(DAOService.sanPham_PhuKien.selectID(
                    hoadDonChiTiet_SanPham_PhuKien.getIdSanPham_PhuKien()).getTenSanPham_PhuKien(), fontProducts));
            PdfPCell cell3 = new PdfPCell(new Phrase(String.valueOf(hoadDonChiTiet_SanPham_PhuKien.getSoLuong()), fontProducts));
            PdfPCell cell4 = new PdfPCell(new Phrase(hoadDonChiTiet_SanPham_PhuKien.getDonGia() + " VNĐ", fontProducts));

            setCell(cell1, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell2, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell3, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
            setCell(cell4, 30, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);

            cell1.setBackgroundColor(BaseColor.WHITE);
            cell2.setBackgroundColor(BaseColor.WHITE);
            cell3.setBackgroundColor(BaseColor.WHITE);
            cell4.setBackgroundColor(BaseColor.WHITE);

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
        }
        addFooterTable(table, tongTien);
        document.add(table);
    }

    private static void setCell(PdfPCell cell, float heiht, int A_H, int A_V) {
        cell.setFixedHeight(heiht);
        cell.setVerticalAlignment(A_V);
        cell.setHorizontalAlignment(A_H);
    }

    private static void addHeaderTable(PdfPTable table, String title) throws Exception {

        PdfPCell header = new PdfPCell(new Phrase(title, fontHeaderAndFooterTable));
        header.setHorizontalAlignment(Element.ALIGN_CENTER);
        header.setVerticalAlignment(Element.ALIGN_MIDDLE);

        header.setBackgroundColor(new BaseColor(235, 255, 215));

        setCell(header, 40, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
        table.addCell(header);
    }

    private static void addFooterTable(PdfPTable table, double tongTien) throws Exception {

        PdfPCell footer1 = new PdfPCell(new Phrase("Tổng tiền", fontHeaderAndFooterTable));
        footer1.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell footer2 = new PdfPCell(new Phrase(tongTien + "VNĐ", fontHeaderAndFooterTable));
        footer2.setHorizontalAlignment(Element.ALIGN_CENTER);

        footer1.setColspan(3);

        setCell(footer1, 40, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);
        setCell(footer2, 40, Element.ALIGN_CENTER, Element.ALIGN_MIDDLE);

        footer1.setBackgroundColor(new BaseColor(235, 255, 215));
        footer2.setBackgroundColor(new BaseColor(235, 255, 215));

        table.addCell(footer1);
        table.addCell(footer2);
    }

    private static void setBackground(Document document, String imagePath) throws Exception {
        Image img = Image.getInstance(imagePath);
        img.scaleAbsolute(595, 850);
        img.setAbsolutePosition(0, 0);
        document.add(img);
    }
}
