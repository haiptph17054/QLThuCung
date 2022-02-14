package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.dao.DAOService;
import com.thucung.models.ChungLoai;
import com.thucung.models.GioHang;
import com.thucung.models.NhaCungCap;
import com.thucung.models.ThuCung;
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
public class ThuCungForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public ThuCungForm() {
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
        txtTenThuCung = new com.girlkun.textfield.TextField();
        cboChungLoai = new com.girlkun.combobox.Combobox();
        cboNhaCungCap = new com.girlkun.combobox.Combobox();
        jPanel1 = new javax.swing.JPanel();
        rdoDuc = new javax.swing.JRadioButton();
        rdoCai = new javax.swing.JRadioButton();
        txtMauSac = new com.girlkun.textfield.TextField();
        txtThangTuoi = new com.girlkun.textfield.TextField();
        txtDonGia = new com.girlkun.textfield.TextField();
        scrollThongTinChiTiet = new javax.swing.JScrollPane();
        txtThongTinChiTiet = new javax.swing.JTextArea();
        panelFilter = new com.girlkun.panel.RoundPanel();
        txtTimTheoTen = new com.girlkun.textfield.TextField();
        cboChungLoaiLoc = new com.girlkun.combobox.Combobox();
        txtGiaTu = new com.girlkun.textfield.TextField();
        txtGiaToi = new com.girlkun.textfield.TextField();
        btnFilter = new com.girlkun.button.Button();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        txtTenThuCung.setBackground(new java.awt.Color(65, 65, 65));
        txtTenThuCung.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenThuCung.setLabelText("Tên thú cưng");

        cboChungLoai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboChungLoai.setLabeText("Chủng loại");
        cboChungLoai.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboNhaCungCap.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboNhaCungCap.setLabeText("Nhà cung cấp");
        cboNhaCungCap.setLineChooseColor(new java.awt.Color(100, 100, 100));

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        buttonGroup1.add(rdoDuc);
        rdoDuc.setSelected(true);
        rdoDuc.setText("Đực");

        buttonGroup1.add(rdoCai);
        rdoCai.setText("Cái");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(rdoDuc)
                .addGap(51, 51, 51)
                .addComponent(rdoCai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDuc)
                    .addComponent(rdoCai))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtMauSac.setBackground(new java.awt.Color(65, 65, 65));
        txtMauSac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtMauSac.setLabelText("Màu sắc");

        txtThangTuoi.setBackground(new java.awt.Color(65, 65, 65));
        txtThangTuoi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtThangTuoi.setLabelText("Tháng tuổi");

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

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTenThuCung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboChungLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtThangTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(scrollThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTenThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboChungLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtThangTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollThongTinChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
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

        cboChungLoaiLoc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboChungLoaiLoc.setLabeText("Lọc theo chủng loại");
        cboChungLoaiLoc.setLineChooseColor(new java.awt.Color(100, 100, 100));

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
                .addComponent(cboChungLoaiLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(cboChungLoaiLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
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
            image.setImage(ImageUtil.getImage(imagePath, ImageUtil.THUCUNG));
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
                    case ADDTOSHOPPINGCART:
                        addToCart();
                        break;
                    case FILTER:
                        filterPrice();
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
    private com.girlkun.combobox.Combobox cboChungLoai;
    private com.girlkun.combobox.Combobox cboChungLoaiLoc;
    private com.girlkun.combobox.Combobox cboNhaCungCap;
    private com.girlkun.panel.PictureBox image;
    private javax.swing.JPanel info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private javax.swing.JRadioButton rdoCai;
    private javax.swing.JRadioButton rdoDuc;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollInfo;
    private javax.swing.JScrollPane scrollThongTinChiTiet;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtDonGia;
    private com.girlkun.textfield.TextField txtGiaToi;
    private com.girlkun.textfield.TextField txtGiaTu;
    private com.girlkun.textfield.TextField txtMauSac;
    private com.girlkun.textfield.TextField txtTenThuCung;
    private com.girlkun.textfield.TextField txtThangTuoi;
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
        setEventLocChungLoai();
    }

    private void setScrollBar() {
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(new Color(153, 153, 0));
        scrollInfo.setVerticalScrollBar(sbc);
        ScrollBarCustom sbc1 = new ScrollBarCustom();
        sbc1.setForeground(new Color(153, 153, 0));
        scrollThongTinChiTiet.setVerticalScrollBar(sbc1);
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        image.setImage(ImageUtil.getInstance().getIcon("defaultpet"));
        btnFilter.setIcon(ImageUtil.getInstance().getIcon("selective"));
    }

    private void setEventLocChungLoai() {
        cboChungLoaiLoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listThuCung = DAOService.thuCung.findChungLoai(listChungLoai.get(cboChungLoaiLoc.getSelectedIndex()).getIdChungLoai());
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
                listThuCung = DAOService.thuCung.find(txtTimTheoTen.getText());
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

    private void setupFileChooser() {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Chọn hình ảnh", "png", "jpg", "jpeg"));
    }

    private void setupCombobox() {
        listChungLoai = DAOService.chungLoai.selectAll();
        for (ChungLoai chungLoai : listChungLoai) {
            cboChungLoai.addItem(chungLoai.getTenChungLoai());
            cboChungLoaiLoc.addItem(chungLoai.getTenChungLoai());
        }
        listNhaCungCap = DAOService.nhaCungCap.selectAvailable();
        for (NhaCungCap nhaCungCap : listNhaCungCap) {
            cboNhaCungCap.addItem(nhaCungCap.getTenNhaCungCap());
        }
        cboChungLoai.setSelectedIndex(-1);
        cboChungLoaiLoc.setSelectedIndex(-1);
        cboNhaCungCap.setSelectedIndex(-1);
    }

    private void setupTable() {
        String[] column = {"ID", "Tên thú cưng", "Chủng loại", "Giới tính", "Tháng tuổi", "Đơn giá"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listThuCung = DAOService.thuCung.selectAvailable();
        fillToTable();
    }

    private void clear() {
        index = -1;
        txtTenThuCung.setText("");
        cboChungLoai.setSelectedIndex(-1);
        cboNhaCungCap.setSelectedIndex(-1);
        rdoDuc.setSelected(true);
        txtMauSac.setText("");
        txtThangTuoi.setText("");
        txtDonGia.setText("");
        txtThongTinChiTiet.setText("(Thông tin chi tiết...)");
        image.setImage(ImageUtil.getInstance().getIcon("defaultpet"));
        image.repaint();
        imagePath = "";
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (ThuCung thuCung : listThuCung) {
            model.addRow(new Object[]{
                "TC" + thuCung.getIdThuCung(), thuCung.getTenThuCung(), DAOService.chungLoai.selectID(thuCung.getChungLoai()).getTenChungLoai(),
                thuCung.getGioiTinh() == 0 ? "Đực" : "Cái", thuCung.getThangTuoi(), thuCung.getDonGia() + " VNĐ"
            });
        }
        clear();
    }

    private void showInfo() {
        if (index != -1) {
            ThuCung thuCung = listThuCung.get(index);
            txtTenThuCung.setText(thuCung.getTenThuCung());
            txtMauSac.setText(thuCung.getMauSac());
            txtDonGia.setText(String.valueOf(thuCung.getDonGia()));
            txtThangTuoi.setText(String.valueOf(thuCung.getThangTuoi()));
            txtThongTinChiTiet.setText(thuCung.getThongTinChiTiet());
            if (thuCung.getGioiTinh() == 0) {
                rdoDuc.setSelected(true);
            } else {
                rdoCai.setSelected(true);
            }
            image.setImage(ImageUtil.getImage(thuCung.getHinhAnh(), ImageUtil.THUCUNG));
            image.repaint();
            cboChungLoai.setSelectedItem(DAOService.chungLoai.selectID(thuCung.getChungLoai()).getTenChungLoai());
            cboNhaCungCap.setSelectedItem(DAOService.nhaCungCap.selectID(thuCung.getNhaCungCap()).getTenNhaCungCap());
            imagePath = thuCung.getHinhAnh();
        }
    }

    private void addToCart() {
        if (index != -1) {
            GioHang.getInstance().addThuCung(listThuCung.get(index));
            DialogUtil.showSuccessfully("Đã thêm vào giỏ hàng!", this);
        }
    }

    private void filterPrice() {
        if (checkFilter()) {
            double giaTu = Double.parseDouble(txtGiaTu.getText());
            double giaToi = Double.parseDouble(txtGiaToi.getText());
            listThuCung = DAOService.thuCung.findPrice(giaTu, giaToi);
        } else {
            listThuCung = DAOService.thuCung.selectAvailable();
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

    private void add() {
        if (checkAllInput()) {
            if (!imagePath.trim().equals("")) {
                imagePath = ImageUtil.copyImage(imagePath, txtTenThuCung.getText(), ImageUtil.THUCUNG);
            }
            ThuCung thuCung = new ThuCung(0, listChungLoai.get(cboChungLoai.getSelectedIndex()).getIdChungLoai(),
                    txtTenThuCung.getText(), listNhaCungCap.get(cboNhaCungCap.getSelectedIndex()).getIdNhaCungCap(),
                    rdoDuc.isSelected() ? 0 : 1, txtMauSac.getText(), Integer.parseInt(txtThangTuoi.getText()), Double.parseDouble(txtDonGia.getText()),
                    txtThongTinChiTiet.getText(), imagePath, 1);
            DAOService.thuCung.insert(thuCung);
            listThuCung = DAOService.thuCung.selectAvailable();
            fillToTable();
            DialogUtil.showSuccessfully("Thêm thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtTenThuCung.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập tên thú cưng!", this);
            txtTenThuCung.requestFocus();
            return false;
        } else if (txtMauSac.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập màu sắc!", this);
            txtMauSac.requestFocus();
            return false;
        } else if (txtThangTuoi.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập tháng tuổi!", this);
            txtThangTuoi.requestFocus();
            return false;
        } else if (txtDonGia.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đơn giá!", this);
            txtDonGia.requestFocus();
            return false;
        } else if (cboChungLoai.getSelectedIndex() == -1) {
            DialogUtil.showAlert("Vui lòng chọn chủng loại!", this);
            return false;
        } else if (cboNhaCungCap.getSelectedIndex() == -1) {
            DialogUtil.showAlert("Vui lòng chọn nhà cung cấp!", this);
            return false;
        } else {
            try {
                int thangTuoi = Integer.parseInt(txtThangTuoi.getText());
                if (thangTuoi <= 0) {
                    DialogUtil.showAlert("Vui lòng nhập tháng tuổi lớn hơn 0!", this);
                    txtThangTuoi.requestFocus();
                    return false;
                }
            } catch (Exception e) {
                DialogUtil.showAlert("Vui lòng nhập đúng tháng tuổi!", this);
                txtThangTuoi.requestFocus();
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
                    imagePath = ImageUtil.copyImage(imagePath, txtTenThuCung.getText(), ImageUtil.THUCUNG);
                }
                ThuCung thuCung = new ThuCung(listThuCung.get(index).getIdThuCung(),
                        listChungLoai.get(cboChungLoai.getSelectedIndex()).getIdChungLoai(),
                        txtTenThuCung.getText(), listNhaCungCap.get(cboNhaCungCap.getSelectedIndex()).getIdNhaCungCap(),
                        rdoDuc.isSelected() ? 0 : 1, txtMauSac.getText(), Integer.parseInt(txtThangTuoi.getText()), Double.parseDouble(txtDonGia.getText()),
                        txtThongTinChiTiet.getText(), imagePath, 1);
                DAOService.thuCung.update(thuCung);
                listThuCung = DAOService.thuCung.selectAvailable();
                fillToTable();
                DialogUtil.showSuccessfully("Cập nhật thành công!", this);
            }
        }
    }

    private void delete() {
        if (index != -1) {
            DAOService.thuCung.delete(listThuCung.get(index).getIdThuCung());
            listThuCung = DAOService.thuCung.selectAvailable();
            fillToTable();
            DialogUtil.showSuccessfully("Xóa thành công!", this);
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listThuCung = DAOService.thuCung.selectAvailable();
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

    private Thread setup;
    private DefaultTableModel model;
    private List<ChungLoai> listChungLoai;
    private List<NhaCungCap> listNhaCungCap;
    private List<ThuCung> listThuCung;
    private int index = -1;
    private JFileChooser fileChooser;
    private String imagePath = "";
}
