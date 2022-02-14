package com.thucung.main;

import com.thucung.dao.DAOService;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.other.Config;
import com.thucung.other.Scene;
import com.thucung.ui.form.*;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Component;
import com.thucung.event.IEventMenu;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class Main extends javax.swing.JFrame {

    public Main(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
        int nv = taiKhoan.getNhanVien();
        if (nv != 0) {
            this.nhanVien = DAOService.nhanVien.selectID(nv);
        }
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        body = new javax.swing.JPanel();
        header = new com.thucung.ui.components.Header();
        article = new com.thucung.ui.components.Article();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(20, 20, 20));

        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(article, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addComponent(article, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.thucung.ui.components.Article article;
    private javax.swing.JPanel body;
    private com.thucung.ui.components.Header header;
    private com.girlkun.panel.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        this.setIconImage(ImageUtil.getInstance().getIcon("icon").getImage());
        article.setParent(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(new Color(0, 0, 0, 0));
        header.showTime();
        setUser();
        that = this;
        initForm();

        initEvent();
        header.setButton(this);
        body.setOpaque(false);

        article.initMenu(event);
        //setdefault form 1
        event.selected(Menu.TRANGCHU);
        article.choseTrangChu();
    }
    
    private void initForm(){
        trangChuForm = new TrangChuForm();
        
        thuCungForm = new ThuCungForm();
        sanPham_PhuKienForm = new SanPham_PhuKienForm();
        nhaCungCapForm = new NhaCungCapForm();
        nhanVienForm = new NhanVienForm();
        khachHangForm = new KhachHangForm();
        taiKhoanForm = new TaiKhoanForm();
        maGiamGiaForm = new MaGiamGiaForm();
        hoaDonForm = new HoaDonForm(that);
        thongKeForm = new ThongKeFormX();
    }

    private void setUser() {
        if (taiKhoan.getVaiTro() == 0) {
            article.setNameUser(Config.ADMIN_NAME);
            article.setRole("Admin");
            article.setAvatar(ImageUtil.getInstance().getIcon(Config.ADMIN_IMAGE));
        } else {
            article.setNameUser(nhanVien.getTenNhanVien());
            article.setRole("Nhân viên");
            article.setAvatar(ImageUtil.getImage(nhanVien.getHinhAnh(), ImageUtil.NHANVIEN));
        }
    }

    private void initEvent() {
        event = new IEventMenu() {
            @Override
            public void selected(Menu chose) {
                switch (chose) {
                    case GIOHANG:
                        new GioHangForm(that).setVisible(true);
                        break;
                    case TRANGCHU:
                        showForm(trangChuForm);
                        break;
                    case THUCUNG:
                        showForm(thuCungForm);
                        break;
                    case SANPHAM_PHUKIEN:
                        showForm(sanPham_PhuKienForm);
                        break;
                    case TAIKHOAN:
                        showForm(taiKhoanForm);
                        break;
                    case NHACUNGCAP:
                        showForm(nhaCungCapForm);
                        break;
                    case NHANVIEN:
                        showForm(nhanVienForm);
                        break;
                    case KHACHHANG:
                        showForm(khachHangForm);
                        break;
                    case HOADON:
                        showForm(hoaDonForm);
                        break;
                    case MAGIAMGIA:
                        showForm(maGiamGiaForm);
                        break;
                    case THONGKE:
                        showForm(thongKeForm);
                        break;
                    case CHUNGLOAI:
                        showForm(new ChungLoaiForm());
                        break;
                    case LOAISANPHAM_PHUKIEN:
                        showForm(new LoaiSanPham_PhuKienForm());
                        break;
                    case DANGXUAT:
                        logout();
                        break;
                }
            }
        };
    }

    private void logout() {
        new Start().setVisible(true);
        this.dispose();
    }

    private void showForm(Scene scene) {
        if (body.getComponentCount() > 0) {
            ((Scene) body.getComponent(0)).destroy();
        }
        if(scene instanceof TrangChuForm){
            trangChuForm.start();
        } else {
            trangChuForm.stop();
            scene.reload();
        }
        body.removeAll();
        body.add((Component) scene);
        body.revalidate();
        body.repaint();
    }

    public void showThongTinForm() {
        showForm(new ThongTinForm(this));
    }

    public void showDoiMatKhauForm() {
        showForm(new DoiMatKhauForm(taiKhoan));
    }

    public void reload() {
        ((Scene) body.getComponent(0)).reload();
    }

    private Main that;
    private IEventMenu event;
    public NhanVien nhanVien;
    private TaiKhoan taiKhoan;
    
    private TrangChuForm trangChuForm;
    private ThuCungForm thuCungForm;
    private SanPham_PhuKienForm sanPham_PhuKienForm;
    private NhaCungCapForm nhaCungCapForm;
    private NhanVienForm nhanVienForm;
    private KhachHangForm khachHangForm;
    private TaiKhoanForm taiKhoanForm;
    private MaGiamGiaForm maGiamGiaForm;
    private HoaDonForm hoaDonForm;
    private ThongKeFormX thongKeForm;

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public enum Menu {
        TRANGCHU, THUCUNG,
        SANPHAM_PHUKIEN, NHANVIEN,
        KHACHHANG, TAIKHOAN,
        MAGIAMGIA, NHACUNGCAP,
        HOADON, DANGXUAT,
        GIOHANG, THONGKE,
        CHUNGLOAI, LOAISANPHAM_PHUKIEN
    }
}
