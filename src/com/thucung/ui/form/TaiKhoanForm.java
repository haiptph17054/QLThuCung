package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.dao.DAOService;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.other.Config;
import com.thucung.other.Scene;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class TaiKhoanForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public TaiKhoanForm() {
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

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        image = new com.girlkun.panel.PictureBox();
        txtTenNguoiDung = new com.girlkun.textfield.TextField();
        txtNgaySinh = new com.girlkun.textfield.TextField();
        txtGioiTinh = new com.girlkun.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new com.girlkun.textfield.TextField();
        lblVaiTro = new javax.swing.JLabel();
        panelFilter = new com.girlkun.panel.RoundPanel();
        cboTrangThai = new com.girlkun.combobox.Combobox();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(65, 65, 65));

        txtTenNguoiDung.setEditable(false);
        txtTenNguoiDung.setBackground(new java.awt.Color(65, 65, 65));
        txtTenNguoiDung.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenNguoiDung.setLabelText("Tên người dùng");

        txtNgaySinh.setEditable(false);
        txtNgaySinh.setBackground(new java.awt.Color(65, 65, 65));
        txtNgaySinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNgaySinh.setLabelText("Ngày sinh");

        txtGioiTinh.setEditable(false);
        txtGioiTinh.setBackground(new java.awt.Color(65, 65, 65));
        txtGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtGioiTinh.setLabelText("Giới tính");

        jLabel1.setBackground(new java.awt.Color(65, 65, 65));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin người dùng");

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(65, 65, 65));
        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtEmail.setLabelText("Email");

        lblVaiTro.setBackground(new java.awt.Color(65, 65, 65));
        lblVaiTro.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(255, 255, 255));
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblVaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scrollInfo.setViewportView(info);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(scrollInfo)
                .addGap(1, 1, 1))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(scrollInfo)
                .addGap(1, 1, 1))
        );

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        cboTrangThai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboTrangThai.setLabeText("Trạng thái");
        cboTrangThai.setLineChooseColor(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
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
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
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
    private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case BAN:
                        ban();
                        break;
                    case ACTIVE:
                        active();
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Khóa tài khoản", ImageUtil.getInstance().getIcon("block"), IEventControI.Chose.BAN);
        addButton("Mở khóa tài khoản", ImageUtil.getInstance().getIcon("unlock"), IEventControI.Chose.ACTIVE);
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
        panelControl.add(button, "width 50:150:350");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.combobox.Combobox cboTrangThai;
    private com.girlkun.panel.PictureBox image;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVaiTro;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollInfo;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtEmail;
    private com.girlkun.textfield.TextField txtGioiTinh;
    private com.girlkun.textfield.TextField txtNgaySinh;
    private com.girlkun.textfield.TextField txtTenNguoiDung;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setScrollBar();
        setupCombobox();
        setupTable();
        setEventTimTheoTrangThai();
    }

    private void showInfo() {
        if (index != -1) {
            if (listTaiKhoan.get(index).getVaiTro() != 0) {
                NhanVien nhanVien = DAOService.nhanVien.selectID(listTaiKhoan.get(index).getNhanVien());
                txtTenNguoiDung.setText(nhanVien.getTenNhanVien());
                txtNgaySinh.setText(DateUtil.changeDateUStoVN(nhanVien.getNgaySinh()));
                txtGioiTinh.setText(nhanVien.getGioiTinh() == 0 ? "Nam" : "Nữ");
                txtEmail.setText(nhanVien.getEmail());
                lblVaiTro.setText("Nhân viên");
                String imagePath = nhanVien.getHinhAnh();
                if (!imagePath.equals("")) {
                    image.setImage(ImageUtil.getImage(imagePath, ImageUtil.NHANVIEN));
                } else {
                    image.setImage(ImageUtil.getInstance().getIcon("star"));
                }
                image.repaint();
            } else {
                txtTenNguoiDung.setText(Config.ADMIN_NAME);
                txtNgaySinh.setText(Config.ADMIN_DOB);
                txtGioiTinh.setText(Config.ADMIN_GENDER);
                txtEmail.setText(Config.ADMIN_EMAIL);
                lblVaiTro.setText(Config.ADMIN);
                image.setImage(ImageUtil.getInstance().getIcon(Config.ADMIN_IMAGE));
                image.repaint();
            }
        }
    }

    private void setEventTimTheoTrangThai() {
        cboTrangThai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cboTrangThai.getSelectedIndex()) {
                    case 1:
                        listTaiKhoan = DAOService.taiKhoan.selectByTrangThai(1);
                        break;
                    case 2:
                        listTaiKhoan = DAOService.taiKhoan.selectByTrangThai(0);
                        break;
                    default:
                        listTaiKhoan = DAOService.taiKhoan.selectAll();
                        break;
                }
                fillToTable();
            }
        });
    }

    private void setupCombobox() {
        cboTrangThai.addItem("Tất cả");
        cboTrangThai.addItem("Hoạt động");
        cboTrangThai.addItem("Vô hiệu hóa");
        cboTrangThai.setSelectedIndex(0);
    }

    private void setScrollBar() {
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(new Color(153, 153, 0));
        scrollInfo.setVerticalScrollBar(sbc);
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 20 100 20 100", "[fill]100[fill]", "[fill]"));
        image.setImage(ImageUtil.getInstance().getIcon("star"));
    }

    private void setupTable() {
        String[] column = {"Tài khoản", "Người dùng", "Vai trò", "Trạng thái"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);
        listTaiKhoan = DAOService.taiKhoan.selectAll();
        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (TaiKhoan taiKhoan : listTaiKhoan) {
            model.addRow(new Object[]{
                taiKhoan.getTaiKhoan(),
                taiKhoan.getVaiTro() == 0 ? Config.ADMIN_NAME : DAOService.nhanVien.selectID(taiKhoan.getNhanVien()).getTenNhanVien(),
                taiKhoan.getVaiTro() == 0 ? "Admin" : "Nhân viên",
                taiKhoan.getTrangThai() == 0 ? "Vô hiệu hóa" : "Hoạt động"
            });
        }
        clear();
    }

    private void ban() {
        if (index != -1 && listTaiKhoan.get(index).getVaiTro() != 0) {
            DAOService.taiKhoan.ban(listTaiKhoan.get(index));
            listTaiKhoan = DAOService.taiKhoan.selectAll();
            fillToTable();
        } else {
            DialogUtil.showAlert("Không thể thực hiện trên tài khoản hiện tại!", this);
        }
    }

    private void active() {
        if (index != -1 && listTaiKhoan.get(index).getVaiTro() != 0) {
            DAOService.taiKhoan.active(listTaiKhoan.get(index));
            listTaiKhoan = DAOService.taiKhoan.selectAll();
            fillToTable();
        } else {
            DialogUtil.showAlert("Không thể thực hiện trên tài khoản hiện tại!", this);
        }
    }

    private void clear() {
        index = -1;
        txtTenNguoiDung.setText("");
        txtNgaySinh.setText("");
        txtGioiTinh.setText("");
        txtEmail.setText("");
        lblVaiTro.setText("");
        image.setImage(ImageUtil.getInstance().getIcon("star"));
        image.repaint();
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listTaiKhoan = DAOService.taiKhoan.selectAll();
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
    private List<TaiKhoan> listTaiKhoan;
    private int index = -1;
    private Thread setup;
}
