package com.thucung.ui.form;

import com.thucung.dao.DAOService;
import com.thucung.main.Main;
import com.thucung.models.GioHang;
import com.thucung.models.HoaDon;
import com.thucung.models.HoaDonChiTiet_SanPham_PhuKien;
import com.thucung.models.HoaDonChiTiet_ThuCung;
import com.thucung.models.MaGiamGia;
import com.thucung.models.NhanVien;
import com.thucung.other.Config;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ThongTinHoaDon extends javax.swing.JFrame {
    
    private HoaDon hoaDon;
    
    public ThongTinHoaDon(HoaDonForm parent, HoaDon hoaDon) {
        this.main = (Main) parent.getMain();
        this.hoaDon = hoaDon;
        initComponents();
        new Thread(() -> {
            setup();
        }).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        header = new com.thucung.ui.components.Header();
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIDHoaDon = new com.girlkun.textfield.TextField();
        txtKhachHang = new com.girlkun.textfield.TextField();
        txtNhanVien = new com.girlkun.textfield.TextField();
        txtMaGiamGia = new com.girlkun.textfield.TextField();
        txtNgayXuat = new com.girlkun.textfield.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(204, 204, 0));

        tblSanPham.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSanPham.setSelectionBackground(new java.awt.Color(255, 255, 153));
        tblSanPham.setSelectionForeground(new java.awt.Color(0, 0, 51));
        tblSanPham.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi tiết hóa đơn");

        txtIDHoaDon.setEditable(false);
        txtIDHoaDon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtIDHoaDon.setLabelText("ID hóa đơn");

        txtKhachHang.setEditable(false);
        txtKhachHang.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtKhachHang.setLabelText("Khách hàng");

        txtNhanVien.setEditable(false);
        txtNhanVien.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNhanVien.setLabelText("Nhân viên");

        txtMaGiamGia.setEditable(false);
        txtMaGiamGia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaGiamGia.setLabelText("Mã giảm giá");

        txtNgayXuat.setEditable(false);
        txtNgayXuat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNgayXuat.setLabelText("Ngày xuất");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIDHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(txtKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(txtIDHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

    }//GEN-LAST:event_tblSanPhamMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.thucung.ui.components.Header header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private javax.swing.JTable tblSanPham;
    private com.girlkun.textfield.TextField txtIDHoaDon;
    private com.girlkun.textfield.TextField txtKhachHang;
    private com.girlkun.textfield.TextField txtMaGiamGia;
    private com.girlkun.textfield.TextField txtNgayXuat;
    private com.girlkun.textfield.TextField txtNhanVien;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        this.setLocationRelativeTo(main);
        this.setResizable(false);
        this.setBackground(new Color(0, 0, 0, 0));
        header.setButton(this);
        setText();
        setTable();
    }
    
    private void setText() {
        txtIDHoaDon.setText("HD" + hoaDon.getIdHoaDon());
        txtKhachHang.setText(DAOService.khachHang.selectID(hoaDon.getKhachHang()).getTenKhachHang());
        NhanVien nv = DAOService.nhanVien.selectID(hoaDon.getNhanVien());
        if (nv != null) {
            txtNhanVien.setText(nv.getTenNhanVien());
        } else {
            txtNhanVien.setText(Config.ADMIN_NAME);
        }
        MaGiamGia maGiamGia = DAOService.maGiamGia.selectID(hoaDon.getMaGiamGia());
        if (maGiamGia != null) {
            txtMaGiamGia.setText(maGiamGia.getMaGiamGia() + " (" + maGiamGia.getGiaTri() + "%)");
        }
        txtNgayXuat.setText(DateUtil.changeDateUStoVN(hoaDon.getNgayXuatHoaDon()));
    }
    
    private void setTable() {
        String[] column = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Hình ảnh"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        tblSanPham.setModel(model);
        tblSanPham.setRowHeight(100);
        
        hoaDonChiTiet_ThuCung = DAOService.hoaDonChiTiet_ThuCung.selectByIDHoaDon(hoaDon.getIdHoaDon());
        hoaDonChiTiet_SanPham_PhuKien = DAOService.hoaDonChiTiet_SanPham_PhuKien.selectByIDHoaDon(hoaDon.getIdHoaDon());
        fillToTable();
    }
    
    private void fillToTable() {
        for (HoaDonChiTiet_ThuCung hd : hoaDonChiTiet_ThuCung) {
            model.addRow(new Object[]{
                "TC" + hd.getIdThuCung(), DAOService.thuCung.selectID(hd.getIdThuCung()).getTenThuCung(),
                1, hd.getDonGia() + " VNĐ", DAOService.thuCung.selectID(hd.getIdThuCung()).getHinhAnh()
            });
            tblSanPham.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
        }
        for (HoaDonChiTiet_SanPham_PhuKien hd : hoaDonChiTiet_SanPham_PhuKien) {
            model.addRow(new Object[]{
                "SP-PK" + hd.getIdSanPham_PhuKien(), DAOService.sanPham_PhuKien.selectID(hd.getIdSanPham_PhuKien()).getTenSanPham_PhuKien(),
                hd.getSoLuong(),
                hd.getDonGia() + " VNĐ", DAOService.sanPham_PhuKien.selectID(hd.getIdSanPham_PhuKien()).getHinhAnh()
            });
            tblSanPham.getColumnModel().getColumn(4).setCellRenderer(new ImageRender());
        }
    }
    
    public Main getMain() {
        return main;
    }
    
    public Main main;
    private DefaultTableModel model;
    private List<HoaDonChiTiet_ThuCung> hoaDonChiTiet_ThuCung;
    private List<HoaDonChiTiet_SanPham_PhuKien> hoaDonChiTiet_SanPham_PhuKien;
    
    private class ImageRender extends DefaultTableCellRenderer {
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            String photoName = value.toString();
            ImageIcon icon = new ImageIcon(new ImageIcon(photoName).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            return new JLabel(icon);
        }
    }
}
