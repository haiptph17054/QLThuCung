package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.dao.DAOService;
import com.thucung.models.GioHang;
import com.thucung.models.LoaiSanPham_PhuKien;
import com.thucung.models.NhaCungCap;
import com.thucung.models.SanPham_PhuKien;
import com.thucung.other.Scene;
import com.thucung.util.DialogUtil;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class SanPham_PhuKienForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public SanPham_PhuKienForm() {
        initComponents();
        initEvent();
        setOther();
        initButton();
        setup = new Thread(() -> {
            setup();
        });
        setup.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        image = new com.girlkun.panel.PictureBox();
        txtTenSanPham_PhuKien = new com.girlkun.textfield.TextField();
        cboLoaiSanPham_PhuKien = new com.girlkun.combobox.Combobox();
        cboNhaCungCap = new com.girlkun.combobox.Combobox();
        txtDonGia = new com.girlkun.textfield.TextField();
        scrollThongTinChiTiet = new javax.swing.JScrollPane();
        txtThongTinChiTiet = new javax.swing.JTextArea();
        txtSoLuong = new com.girlkun.textfield.TextField();
        txtDonViTinh = new com.girlkun.textfield.TextField();
        scrollHuongDanSuDung = new javax.swing.JScrollPane();
        txtHuongDanSuDung = new javax.swing.JTextArea();
        panelFilter = new com.girlkun.panel.RoundPanel();
        txtTimTheoTen = new com.girlkun.textfield.TextField();
        cboLoaiSanPham_PhuKienLoc = new com.girlkun.combobox.Combobox();
        txtGiaTu = new com.girlkun.textfield.TextField();
        txtGiaToi = new com.girlkun.textfield.TextField();
        btnFilter = new com.girlkun.button.Button();
        panelList = new com.girlkun.panel.RoundPanel();
        scrollList = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(65, 65, 65));

        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });

        txtTenSanPham_PhuKien.setBackground(new java.awt.Color(65, 65, 65));
        txtTenSanPham_PhuKien.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenSanPham_PhuKien.setLabelText("Tên sản phẩm - phụ kiên");

        cboLoaiSanPham_PhuKien.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboLoaiSanPham_PhuKien.setLabeText("Loại sản phẩm - phụ kiện");
        cboLoaiSanPham_PhuKien.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboNhaCungCap.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboNhaCungCap.setLabeText("Nhà cung cấp");
        cboNhaCungCap.setLineChooseColor(new java.awt.Color(100, 100, 100));

        txtDonGia.setBackground(new java.awt.Color(65, 65, 65));
        txtDonGia.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDonGia.setLabelText("Đơn giá");

        scrollThongTinChiTiet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtThongTinChiTiet.setBackground(new java.awt.Color(65, 65, 65));
        txtThongTinChiTiet.setColumns(20);
        txtThongTinChiTiet.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtThongTinChiTiet.setLineWrap(true);
        txtThongTinChiTiet.setRows(5);
        txtThongTinChiTiet.setText("(Thông tin chi tiết...)");
        txtThongTinChiTiet.setWrapStyleWord(true);
        txtThongTinChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        scrollThongTinChiTiet.setViewportView(txtThongTinChiTiet);

        txtSoLuong.setBackground(new java.awt.Color(65, 65, 65));
        txtSoLuong.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtSoLuong.setLabelText("Số lượng");

        txtDonViTinh.setBackground(new java.awt.Color(65, 65, 65));
        txtDonViTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDonViTinh.setLabelText("Đơn vị tính");

        scrollHuongDanSuDung.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtHuongDanSuDung.setBackground(new java.awt.Color(65, 65, 65));
        txtHuongDanSuDung.setColumns(20);
        txtHuongDanSuDung.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtHuongDanSuDung.setLineWrap(true);
        txtHuongDanSuDung.setRows(5);
        txtHuongDanSuDung.setText("(Hướng dẫn sử dụng...)");
        txtHuongDanSuDung.setWrapStyleWord(true);
        txtHuongDanSuDung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        scrollHuongDanSuDung.setViewportView(txtHuongDanSuDung);

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTenSanPham_PhuKien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboLoaiSanPham_PhuKien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoLayout.createSequentialGroup()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(scrollHuongDanSuDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTenSanPham_PhuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboLoaiSanPham_PhuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollHuongDanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        scrollInfo.setViewportView(info);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrollInfo)
                .addGap(5, 5, 5))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrollInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        txtTimTheoTen.setBackground(new java.awt.Color(65, 65, 65));
        txtTimTheoTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTimTheoTen.setLabelText("Tìm theo tên");

        cboLoaiSanPham_PhuKienLoc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboLoaiSanPham_PhuKienLoc.setLabeText("Loại sản phẩm - phụ kiện");
        cboLoaiSanPham_PhuKienLoc.setLineChooseColor(new java.awt.Color(100, 100, 100));

        txtGiaTu.setBackground(new java.awt.Color(65, 65, 65));
        txtGiaTu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtGiaTu.setLabelText("Giá từ");

        txtGiaToi.setBackground(new java.awt.Color(65, 65, 65));
        txtGiaToi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtGiaToi.setLabelText("tới");

        btnFilter.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cboLoaiSanPham_PhuKienLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtGiaToi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGiaToi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cboLoaiSanPham_PhuKienLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimTheoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        panelList.setBackground(new java.awt.Color(65, 65, 65));

        tblList.setBackground(new java.awt.Color(20, 20, 20));
        tblList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        tblList.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        scrollList.setViewportView(tblList);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollList)
                .addGap(0, 0, 0))
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollList, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        if (evt.getClickCount() == 2) {
            index = tblList.getSelectedRow();
            showInfo();
        }
    }//GEN-LAST:event_tblListMouseClicked

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            imagePath = fileChooser.getSelectedFile().getAbsolutePath();
            image.setImage(ImageUtil.getImage(imagePath, ImageUtil.SANPHAM_PHUKIEN));
            image.repaint();
        }
    }//GEN-LAST:event_imageMouseClicked

    private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case ADD:
                        add();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case DELETE:
                        delete();
                        break;
                    case FILTER:
                        filterPrice();
                        break;
                    case ADDTOSHOPPINGCART:
                        addToCart();
                        break;
                    case CLEAR:
                        clear();
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Làm mới", ImageUtil.getInstance().getIcon("eraser"), IEventControI.Chose.CLEAR);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Cập nhật", ImageUtil.getInstance().getIcon("updating"), IEventControI.Chose.UPDATE);
        addButton("Xoá", ImageUtil.getInstance().getIcon("delete-button"), IEventControI.Chose.DELETE);

        addButton("Thêm vào giỏ", ImageUtil.getInstance().getIcon("add-to-cart"), IEventControI.Chose.ADDTOSHOPPINGCART);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.NULL);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.NULL);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.NULL);

    }

    private void addButton(String text, ImageIcon icon, IEventControI.Chose chose) {
        Font font = new Font("SansSerif", Font.BOLD, 12);
        Button button = new Button();
        button.setText(text);
        button.setBackground(new Color(100, 100, 100));
        button.setForeground(Color.WHITE);
        button.setIcon(icon);
        button.setFont(font);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.selected(chose);
            }
        });
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                button.setBackground(new Color(175, 100, 100));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                button.setBackground(new Color(100, 100, 100));
            }
        });
        panelControl.add(button, "width 0:0:300");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.Button btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.girlkun.combobox.Combobox cboLoaiSanPham_PhuKien;
    private com.girlkun.combobox.Combobox cboLoaiSanPham_PhuKienLoc;
    private com.girlkun.combobox.Combobox cboNhaCungCap;
    private com.girlkun.panel.PictureBox image;
    private javax.swing.JPanel info;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollHuongDanSuDung;
    private javax.swing.JScrollPane scrollInfo;
    private javax.swing.JScrollPane scrollList;
    private javax.swing.JScrollPane scrollThongTinChiTiet;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtDonGia;
    private com.girlkun.textfield.TextField txtDonViTinh;
    private com.girlkun.textfield.TextField txtGiaToi;
    private com.girlkun.textfield.TextField txtGiaTu;
    private javax.swing.JTextArea txtHuongDanSuDung;
    private com.girlkun.textfield.TextField txtSoLuong;
    private com.girlkun.textfield.TextField txtTenSanPham_PhuKien;
    private javax.swing.JTextArea txtThongTinChiTiet;
    private com.girlkun.textfield.TextField txtTimTheoTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setScrollBar();
        setEventBtnfilter();
        setupCombobox();
        setupTable();
        setupFileChooser();
        setEventTxtTimTheoTen();
        setEventLocLoaiSanPham_PhuKien();
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        image.setImage(ImageUtil.getInstance().getIcon("defaultproduct"));
        btnFilter.setIcon(ImageUtil.getInstance().getIcon("selective"));
    }

    private void setScrollBar() {
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(new Color(153, 153, 0));
        scrollInfo.setVerticalScrollBar(sbc);
        ScrollBarCustom sbc1 = new ScrollBarCustom();
        sbc1.setForeground(new Color(153, 153, 0));
        scrollThongTinChiTiet.setVerticalScrollBar(sbc1);
        ScrollBarCustom sbc2 = new ScrollBarCustom();
        sbc2.setForeground(new Color(153, 153, 0));
        scrollHuongDanSuDung.setVerticalScrollBar(sbc2);
    }

    private void clear() {
        index = -1;
        txtTenSanPham_PhuKien.setText("");
        cboLoaiSanPham_PhuKien.setSelectedIndex(-1);
        cboNhaCungCap.setSelectedIndex(-1);
        txtSoLuong.setText("");
        txtDonViTinh.setText("");
        txtDonGia.setText("");
        txtThongTinChiTiet.setText("(Thông tin chi tiết...)");
        txtHuongDanSuDung.setText("(Hướng dẫn sử dụng...)");
        image.setImage(ImageUtil.getInstance().getIcon("defaultproduct"));
        image.repaint();
        imagePath = "";
    }

    private void setEventLocLoaiSanPham_PhuKien() {
        cboLoaiSanPham_PhuKienLoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listSanPham_PhuKien = DAOService.sanPham_PhuKien.findLoaiSanPham_PhuKien(
                        listLoaiSanPham_PhuKien.get(cboLoaiSanPham_PhuKienLoc.
                                getSelectedIndex()).getIdLoaiSanPham_PhuKien());
                fillToTable();
            }
        });
    }

    private void setEventTxtTimTheoTen() {
        txtTimTheoTen.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                listSanPham_PhuKien = DAOService.sanPham_PhuKien.find(txtTimTheoTen.getText());
                fillToTable();
            }
        });
    }

    private void setEventBtnfilter() {
        btnFilter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.selected(IEventControI.Chose.FILTER);
            }
        });
    }

    private void filterPrice() {
        if (checkFilter()) {
            double giaTu = Double.parseDouble(txtGiaTu.getText());
            double giaToi = Double.parseDouble(txtGiaToi.getText());
            listSanPham_PhuKien = DAOService.sanPham_PhuKien.findPrice(giaTu, giaToi);
        } else {
            listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
        }
        fillToTable();
    }

    private boolean checkFilter() {
        try {
            Double.parseDouble(txtGiaTu.getText());
            Double.parseDouble(txtGiaToi.getText());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void delete() {
        if (index != -1) {
            if (DAOService.hoaDonChiTiet_SanPham_PhuKien.selectByIDSanPham_PhuKien(
                    listSanPham_PhuKien.get(index).getIdSanPham_PhuKien()).size() > 0) {
                DialogUtil.showSuccessfully("Không thể xóa vật phẩm này!", this);
            } else {
                DAOService.sanPham_PhuKien.delete(listSanPham_PhuKien.get(index).getIdSanPham_PhuKien());
                listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
                fillToTable();
                DialogUtil.showSuccessfully("Xóa thành công!", this);
            }
        }
    }

    private void setupCombobox() {
        listLoaiSanPham_PhuKien = DAOService.loaiSanPham_PhuKien.selectAll();
        for (LoaiSanPham_PhuKien loaiSanPham_PhuKien : listLoaiSanPham_PhuKien) {
            cboLoaiSanPham_PhuKien.addItem(loaiSanPham_PhuKien.getTenLoaiSanPham_PhuKien());
            cboLoaiSanPham_PhuKienLoc.addItem(loaiSanPham_PhuKien.getTenLoaiSanPham_PhuKien());
        }

        listNhaCungCap = DAOService.nhaCungCap.selectAvailable();
        for (NhaCungCap nhaCungCap : listNhaCungCap) {
            cboNhaCungCap.addItem(nhaCungCap.getTenNhaCungCap());
        }
        cboLoaiSanPham_PhuKien.setSelectedIndex(-1);
        cboLoaiSanPham_PhuKienLoc.setSelectedIndex(-1);
        cboNhaCungCap.setSelectedIndex(-1);
    }

    private void setupFileChooser() {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Chọn hình ảnh", "png", "jpg", "jpeg"));
    }

    private void setupTable() {
        String[] column = {"ID", "Tên sản phẩm - phụ kiện", "Loại", "Đơn vị tính", "Số lượng còn", "Đơn giá"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
        fillToTable();
    }

    private void showInfo() {
        if (index != -1) {
            SanPham_PhuKien sanPham_PhuKien = listSanPham_PhuKien.get(index);
            txtTenSanPham_PhuKien.setText(sanPham_PhuKien.getTenSanPham_PhuKien());
            txtDonGia.setText(String.valueOf(sanPham_PhuKien.getDonGia()));
            txtDonViTinh.setText(sanPham_PhuKien.getDonViTinh());
            txtHuongDanSuDung.setText(sanPham_PhuKien.getHuongDanSuDung());
            txtThongTinChiTiet.setText(sanPham_PhuKien.getChiTietSanPham());
            txtSoLuong.setText(String.valueOf(sanPham_PhuKien.getSoLuong()));
            image.setImage(ImageUtil.getImage(sanPham_PhuKien.getHinhAnh(), ImageUtil.SANPHAM_PHUKIEN));
            image.repaint();
            cboLoaiSanPham_PhuKien.setSelectedItem(DAOService.loaiSanPham_PhuKien.selectID(sanPham_PhuKien.getLoaiSanPham_PhuKien()).getTenLoaiSanPham_PhuKien());
            cboNhaCungCap.setSelectedItem(DAOService.nhaCungCap.selectID(sanPham_PhuKien.getNhaCungCap()).getTenNhaCungCap());
            imagePath = sanPham_PhuKien.getHinhAnh();
        }
    }

    private void addToCart() {
        if (index != -1) {
            int quantity = 0;
            try {
                quantity = Integer.parseInt(DialogUtil.showInput("Nhập số lượng", this));
            } catch (Exception ex) {
                DialogUtil.showSuccessfully("Vui lòng nhập số lượng hợp lệ!", this);
                return;
            }
            if (quantity > 0 && quantity <= listSanPham_PhuKien.get(tblList.getSelectedRow()).getSoLuong()) {
                GioHang.getInstance().addSanPhamPhuKien(listSanPham_PhuKien.get(tblList.getSelectedRow()), quantity);
                DialogUtil.showSuccessfully("Đã thêm vào giỏ hàng!", this);
            } else {
                DialogUtil.showSuccessfully("Vui lòng nhập số lượng hợp lệ!", this);
            }
        }
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (SanPham_PhuKien sanPham_PhuKien : listSanPham_PhuKien) {
            model.addRow(new Object[]{
                "SP-PK" + sanPham_PhuKien.getIdSanPham_PhuKien(),
                sanPham_PhuKien.getTenSanPham_PhuKien(),
                DAOService.loaiSanPham_PhuKien.selectID(sanPham_PhuKien.getLoaiSanPham_PhuKien()).getTenLoaiSanPham_PhuKien(),
                sanPham_PhuKien.getDonViTinh(),
                sanPham_PhuKien.getSoLuong(),
                sanPham_PhuKien.getDonGia() + " VNĐ"
            });
        }

        clear();
    }

    private void add() {
        if (checkAllInput()) {
            if (!imagePath.trim().equals("")) {
                imagePath = ImageUtil.copyImage(imagePath, txtTenSanPham_PhuKien.getText(), ImageUtil.SANPHAM_PHUKIEN);
            }
            SanPham_PhuKien sanPham_PhuKien = new SanPham_PhuKien(0, listLoaiSanPham_PhuKien.get(cboLoaiSanPham_PhuKien.getSelectedIndex()).getIdLoaiSanPham_PhuKien(),
                    txtTenSanPham_PhuKien.getText(), listNhaCungCap.get(cboNhaCungCap.getSelectedIndex()).getIdNhaCungCap(), Integer.parseInt(txtSoLuong.getText()),
                    txtDonViTinh.getText(), Double.parseDouble(txtDonGia.getText()), txtThongTinChiTiet.getText(), txtHuongDanSuDung.getText(), imagePath);
            DAOService.sanPham_PhuKien.insert(sanPham_PhuKien);
            listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
            fillToTable();
            DialogUtil.showSuccessfully("Thêm thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtTenSanPham_PhuKien.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập tên sản phẩm - phụ kiện!", this);
            txtTenSanPham_PhuKien.requestFocus();
            return false;
        } else if (txtSoLuong.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập số lượng!", this);
            txtSoLuong.requestFocus();
            return false;
        } else if (txtDonViTinh.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đơn vị tính!", this);
            txtDonViTinh.requestFocus();
            return false;
        } else if (txtDonGia.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đơn giá!", this);
            txtDonGia.requestFocus();
            return false;
        } else if (txtDonGia.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đơn giá!", this);
            txtDonGia.requestFocus();
            return false;
        } else if (cboLoaiSanPham_PhuKien.getSelectedIndex() == -1) {
            DialogUtil.showAlert("Vui lòng chọn loại sản phẩm - phụ kiện!", this);
            return false;
        } else if (cboNhaCungCap.getSelectedIndex() == -1) {
            DialogUtil.showAlert("Vui lòng chọn nhà cung cấp!", this);
            return false;
        } else {
            try {
                int soLuong = Integer.parseInt(txtSoLuong.getText());
                if (soLuong <= 0) {
                    DialogUtil.showAlert("Vui lòng nhập số lượng lớn hơn 0!", this);
                    txtSoLuong.requestFocus();
                    return false;
                }
            } catch (Exception e) {
                DialogUtil.showAlert("Vui lòng nhập đúng số lượng!", this);
                txtSoLuong.requestFocus();
                return false;
            }
            try {
                double donGia = Double.parseDouble(txtDonGia.getText());
                if (donGia <= 0) {
                    DialogUtil.showAlert("Vui lòng nhập đơn lớn hơn 0!", this);
                    txtDonGia.requestFocus();
                    return false;
                }
            } catch (Exception e) {
                DialogUtil.showAlert("Vui lòng nhập đúng đơn giá!", this);
                txtDonGia.requestFocus();
                return false;
            }
            return true;
        }
    }

    private void update() {
        if (index != -1) {
            if (checkAllInput()) {
                if (!imagePath.trim().equals("")) {
                    imagePath = ImageUtil.copyImage(imagePath, txtTenSanPham_PhuKien.getText(), ImageUtil.SANPHAM_PHUKIEN);
                }
                SanPham_PhuKien sanPham_PhuKien = new SanPham_PhuKien(listSanPham_PhuKien.get(index).getIdSanPham_PhuKien(),
                        listSanPham_PhuKien.get(cboLoaiSanPham_PhuKien.getSelectedIndex()).getLoaiSanPham_PhuKien(),
                        txtTenSanPham_PhuKien.getText(), listNhaCungCap.get(cboNhaCungCap.getSelectedIndex()).getIdNhaCungCap(), Integer.parseInt(txtSoLuong.getText()),
                        txtDonViTinh.getText(), Double.parseDouble(txtDonGia.getText()), txtThongTinChiTiet.getText(), txtHuongDanSuDung.getText(), imagePath);
                DAOService.sanPham_PhuKien.update(sanPham_PhuKien);
                listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
                fillToTable();
                DialogUtil.showSuccessfully("Cập nhật thành công!", this);
            }
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listSanPham_PhuKien = DAOService.sanPham_PhuKien.selectAvailable();
            fillToTable();
        });
        setup.start();
    }

    @Override
    public void destroy() {
        if (setup != null && setup.isAlive()) {
            setup.stop();
        }
    }

    private DefaultTableModel model;
    private List<SanPham_PhuKien> listSanPham_PhuKien;
    private List<LoaiSanPham_PhuKien> listLoaiSanPham_PhuKien;
    private List<NhaCungCap> listNhaCungCap;
    private int index = -1;
    private JFileChooser fileChooser;
    private String imagePath = "";
    private Thread setup;
}
