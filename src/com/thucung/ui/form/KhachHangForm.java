package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.thucung.dao.DAOService;
import com.thucung.models.Huyen;
import com.thucung.models.KhachHang;
import com.thucung.models.ThanhPho;
import com.thucung.models.Xa_Phuong;
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
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class KhachHangForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public KhachHangForm() {
        initComponents();
        setOther();
        initEvent();
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
        panelFilter = new com.girlkun.panel.RoundPanel();
        txtTimTheoTen = new com.girlkun.textfield.TextField();
        cboLoaiKhachHang = new com.girlkun.combobox.Combobox();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        txtTenKhachHang = new com.girlkun.textfield.TextField();
        jPanel1 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtSoDienThoai = new com.girlkun.textfield.TextField();
        txtEmail = new com.girlkun.textfield.TextField();
        txtDiaChi = new com.girlkun.textfield.TextField();
        cboThanhPho = new com.girlkun.combobox.Combobox();
        cboHuyen = new com.girlkun.combobox.Combobox();
        cboXaPhuong = new com.girlkun.combobox.Combobox();
        panelControl = new com.girlkun.panel.RoundPanel();
        jLabel1 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        txtTimTheoTen.setBackground(new java.awt.Color(65, 65, 65));
        txtTimTheoTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTimTheoTen.setLabelText("Tìm kiếm theo tên");

        cboLoaiKhachHang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboLoaiKhachHang.setLabeText("Loại khách hàng");
        cboLoaiKhachHang.setLineChooseColor(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328)
                .addComponent(cboLoaiKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboLoaiKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtTimTheoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        roundPanel1.add(panelFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 0, 840, -1));

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
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1)
                .addGap(1, 1, 1))
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        roundPanel1.add(panelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 70, 840, -1));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(65, 65, 65));

        txtTenKhachHang.setBackground(new java.awt.Color(65, 65, 65));
        txtTenKhachHang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenKhachHang.setLabelText("Tên khách hàng");

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(rdoNam)
                .addGap(77, 77, 77)
                .addComponent(rdoNu)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtSoDienThoai.setBackground(new java.awt.Color(65, 65, 65));
        txtSoDienThoai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtSoDienThoai.setLabelText("Số điện thoại");

        txtEmail.setBackground(new java.awt.Color(65, 65, 65));
        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtEmail.setLabelText("Email");

        txtDiaChi.setBackground(new java.awt.Color(65, 65, 65));
        txtDiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDiaChi.setLabelText("Địa chỉ");

        cboThanhPho.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboThanhPho.setLabeText("Thành phố");
        cboThanhPho.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboHuyen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboHuyen.setLabeText("Quận - Huyện");
        cboHuyen.setLineChooseColor(new java.awt.Color(100, 100, 100));

        cboXaPhuong.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboXaPhuong.setLabeText("Xã - Phường");
        cboXaPhuong.setLineChooseColor(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboThanhPho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboHuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboXaPhuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboHuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cboXaPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

        roundPanel1.add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 703));

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        roundPanel1.add(panelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 711, 840, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin khách hàng");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 366, 48));

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
                    case CLEAR:
                        clear();
                        break;
                    case ADD:
                        add();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case DELETE:
                        delete();
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
    private javax.swing.ButtonGroup buttonGroup1;
    private com.girlkun.combobox.Combobox cboHuyen;
    private com.girlkun.combobox.Combobox cboLoaiKhachHang;
    private com.girlkun.combobox.Combobox cboThanhPho;
    private com.girlkun.combobox.Combobox cboXaPhuong;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollInfo;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtDiaChi;
    private com.girlkun.textfield.TextField txtEmail;
    private com.girlkun.textfield.TextField txtSoDienThoai;
    private com.girlkun.textfield.TextField txtTenKhachHang;
    private com.girlkun.textfield.TextField txtTimTheoTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setupCombobox();
        setEventCombobox();
        setEventFilter();
        setupTable();
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]"));
    }

    private void setEventFilter() {
        txtTimTheoTen.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                listKhachHang = DAOService.khachHang.find(txtTimTheoTen.getText());
                fillToTable();
            }
        });
    }

    private void setupCombobox() {
        cboLoaiKhachHang.addItem("Tất cả");
        cboLoaiKhachHang.addItem("Khách hàng thân thiết");
        cboLoaiKhachHang.addItem("Khách hàng bình thường");

        listThanhPho = DAOService.thanhPho.selectAll();
        for (ThanhPho thanhPho : listThanhPho) {
            cboThanhPho.addItem(thanhPho.getTenThanhPho());
        }
    }

    private void setEventCombobox() {
        cboThanhPho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboThanhPho.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                listHuyen = DAOService.huyen.selectByThanhPho(listThanhPho.get(index).getIdThanhPho());
                cboHuyen.removeAllItems();
                for (Huyen huyen : listHuyen) {
                    cboHuyen.addItem(huyen.getTenHuyen());
                }
                cboHuyen.setSelectedIndex(-1);
                txtDiaChi.setText(listThanhPho.get(index).getTenThanhPho());
            }
        });
        cboHuyen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboHuyen.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                listXa_Phuong = DAOService.xa_Phuong.
                        selectByHuyenThanhPho(listHuyen.get(index).getIdHuyen(), listHuyen.get(index).getIdThanhPho());
                cboXaPhuong.removeAllItems();
                for (Xa_Phuong xa_Phuong : listXa_Phuong) {
                    cboXaPhuong.addItem(xa_Phuong.getTenXa_Phuong());
                }
                cboXaPhuong.setSelectedIndex(-1);
                txtDiaChi.setText(listHuyen.get(index).getTenHuyen() + " - "
                        + listThanhPho.get(cboThanhPho.getSelectedIndex()).getTenThanhPho());
            }
        });
        cboXaPhuong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cboXaPhuong.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                txtDiaChi.setText(listXa_Phuong.get(index).getTenXa_Phuong() + " - "
                        + listHuyen.get(cboHuyen.getSelectedIndex()).getTenHuyen() + " - "
                        + listThanhPho.get(cboThanhPho.getSelectedIndex()).getTenThanhPho());
            }
        });
        cboLoaiKhachHang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cboLoaiKhachHang.getSelectedIndex()) {
                    case 0:
                        listKhachHang = DAOService.khachHang.selectAll();
                        break;
                    case 1:
                        listKhachHang = DAOService.khachHang.selectKhachHangThanThiet();
                        break;
                    case 2:
                        listKhachHang = DAOService.khachHang.selectKhachHangBinhThuong();
                        break;
                }
                fillToTable();
            }
        });
    }

    private void showInfo() {
        if (index != -1) {
            KhachHang khachHang = listKhachHang.get(index);
            txtDiaChi.setText(khachHang.getDiaChi());
            txtEmail.setText(khachHang.getEmail());
            txtSoDienThoai.setText(khachHang.getSoDienThoai());
            txtTenKhachHang.setText(khachHang.getTenKhachHang());
        }
    }

    private void setupTable() {
        String[] column = {"ID", "Tên khách hàng", "Giới tính", "Loại khách hàng"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listKhachHang = DAOService.khachHang.selectAll();
        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (KhachHang khachHang : listKhachHang) {
            model.addRow(new Object[]{
                "KH" + khachHang.getIdKhachHang(), khachHang.getTenKhachHang(),
                khachHang.getGioiTinh() == 0 ? "Nam" : "Nữ",
                getLoaiKhachHang(khachHang.getIdKhachHang())
            });
        }
        clear();
    }

    private void clear() {
        index = -1;
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtSoDienThoai.setText("");
        txtTenKhachHang.setText("");
        cboXaPhuong.removeAll();
        cboHuyen.removeAll();
        cboThanhPho.setSelectedIndex(-1);
        cboHuyen.setSelectedIndex(-1);
        cboXaPhuong.setSelectedIndex(-1);
    }

    private String getLoaiKhachHang(int khachHang) {
        if (DAOService.hoaDon.selectByKhachHang(khachHang).size() >= KhachHang.KHACHHANGTHANTHIET) {
            return "Thân thiết";
        } else {
            return "Bình thường";
        }
    }

    private void add() {
        if (checkAllInput()) {
            KhachHang kh1 = DAOService.khachHang.selectByEmail(txtEmail.getText());
            KhachHang kh2 = DAOService.khachHang.selectBySoDienThoai(txtSoDienThoai.getText());
            if (kh1 != null) {
                DialogUtil.showAlert("Email đã tồn tại!\nVui lòng nhập email khác!", this);
                return;
            }
            if (kh2 != null) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", this);
                return;
            }
            KhachHang khachHang = new KhachHang(0, txtTenKhachHang.getText(), rdoNam.isSelected() ? 0 : 1,
                    txtDiaChi.getText(), txtSoDienThoai.getText(), txtEmail.getText());
            DAOService.khachHang.insert(khachHang);
            listKhachHang = DAOService.khachHang.selectAll();
            fillToTable();
            DialogUtil.showSuccessfully("Thêm thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtTenKhachHang.getText().trim().equals("") || txtEmail.getText().trim().equals("")
                || txtSoDienThoai.getText().trim().equals("") || txtTenKhachHang.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", this);
            return false;
        } else {
            if (!txtSoDienThoai.getText().trim().matches("0\\d{9,10}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng số điện thoại!", this);
                return false;
            }
            if (!txtEmail.getText().trim().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng số email!", this);
                return false;
            }
            return true;
        }
    }

    private void update() {
        if (index != -1 && checkAllInput()) {
            KhachHang kh1 = DAOService.khachHang.selectByEmail(txtEmail.getText());
            KhachHang kh2 = DAOService.khachHang.selectBySoDienThoai(txtSoDienThoai.getText());
            if (kh1 != null && kh1.getIdKhachHang() != listKhachHang.get(index).getIdKhachHang()) {
                DialogUtil.showAlert("Email đã tồn tại!\nVui lòng nhập email khác!", this);
                return;
            }
            if (kh2 != null && kh2.getIdKhachHang() != listKhachHang.get(index).getIdKhachHang()) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", this);
                return;
            }
            KhachHang khachHang = new KhachHang(listKhachHang.get(index).getIdKhachHang(),
                    txtTenKhachHang.getText(), rdoNam.isSelected() ? 0 : 1,
                    txtDiaChi.getText(), txtSoDienThoai.getText(), txtEmail.getText());
            DAOService.khachHang.update(khachHang);
            listKhachHang = DAOService.khachHang.selectAll();
            fillToTable();
            DialogUtil.showSuccessfully("Cập nhật thành công!", this);
        }
    }

    private void delete() {
        if (index != -1) {
            if (DAOService.hoaDon.selectByKhachHang(listKhachHang.get(index).getIdKhachHang()).size() > 0
                    && !DialogUtil.showConfirm("Khách hàng này hiện có hóa đơn!\nKhi xóa sẽ mất hết dữ liệu.\nBạn có chắc chắn xóa?", this)) {
                return;
            }
            DAOService.khachHang.delete(listKhachHang.get(index).getIdKhachHang());
            listKhachHang = DAOService.khachHang.selectAll();
            fillToTable();
            DialogUtil.showSuccessfully("Xóa thành công!", this);
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listKhachHang = DAOService.khachHang.selectAll();
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
    private int index = -1;
    private DefaultTableModel model;
    private List<KhachHang> listKhachHang;
    private List<ThanhPho> listThanhPho;
    private List<Huyen> listHuyen;
    private List<Xa_Phuong> listXa_Phuong;

}
