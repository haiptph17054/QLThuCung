package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.thucung.dao.DAOService;
import com.thucung.models.KhachHang;
import com.thucung.models.MaGiamGia;
import com.thucung.other.Scene;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.EmailUtil;
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
public class MaGiamGiaForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public MaGiamGiaForm() {
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

        dateChooser1 = new cambodia.raven.DateChooser();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        txtMaGiamGia = new com.girlkun.textfield.TextField();
        txtGiaTri = new com.girlkun.textfield.TextField();
        txtSoLuong = new com.girlkun.textfield.TextField();
        txtNgayBatDau = new com.girlkun.textfield.TextField();
        txtNgayKetThuc = new com.girlkun.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnNgayKetThuc = new com.girlkun.button.Button();
        panelFilter = new com.girlkun.panel.RoundPanel();
        cboLoc = new com.girlkun.combobox.Combobox();
        roundPanel4 = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();

        dateChooser1.setButton(btnNgayKetThuc);
        dateChooser1.setTextRefernce(txtNgayKetThuc);

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        txtMaGiamGia.setBackground(new java.awt.Color(65, 65, 65));
        txtMaGiamGia.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaGiamGia.setLabelText("Mã giảm giá");

        txtGiaTri.setBackground(new java.awt.Color(65, 65, 65));
        txtGiaTri.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtGiaTri.setLabelText("Giá trị");

        txtSoLuong.setBackground(new java.awt.Color(65, 65, 65));
        txtSoLuong.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtSoLuong.setLabelText("Số lượng");

        txtNgayBatDau.setEditable(false);
        txtNgayBatDau.setBackground(new java.awt.Color(65, 65, 65));
        txtNgayBatDau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNgayBatDau.setLabelText("Ngày bắt đầu");

        txtNgayKetThuc.setBackground(new java.awt.Color(65, 65, 65));
        txtNgayKetThuc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNgayKetThuc.setLabelText("Ngày kết thúc");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mã giảm giá");

        btnNgayKetThuc.setBackground(new java.awt.Color(100, 100, 100));
        btnNgayKetThuc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNgayKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        cboLoc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboLoc.setLabeText("Lọc");
        cboLoc.setLineChooseColor(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cboLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        roundPanel4.setBackground(new java.awt.Color(65, 65, 65));

        tblList.setBackground(new java.awt.Color(20, 20, 20));
        tblList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        tblList.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addGap(1, 1, 1))
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
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    case CLEAR:
                        clear();
                        break;
                    case ADD:
                        add();
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Làm mới", ImageUtil.getInstance().getIcon("eraser"), IEventControI.Chose.CLEAR);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.UPDATE);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.DELETE);

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
    private com.girlkun.button.Button btnNgayKetThuc;
    private com.girlkun.combobox.Combobox cboLoc;
    private cambodia.raven.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel4;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtGiaTri;
    private com.girlkun.textfield.TextField txtMaGiamGia;
    private com.girlkun.textfield.TextField txtNgayBatDau;
    private com.girlkun.textfield.TextField txtNgayKetThuc;
    private com.girlkun.textfield.TextField txtSoLuong;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setEventFilter();

        setTable();
    }

    private void setEventFilter() {
        cboLoc.addItem("Tất cả mã giảm giá");
        cboLoc.addItem("Mã giảm giá còn giá trị");
        cboLoc.setSelectedIndex(1);

        cboLoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int indexCbo = cboLoc.getSelectedIndex();
                switch (indexCbo) {
                    case 0:
                        listMaGiamGia = DAOService.maGiamGia.selectAll();
                        break;
                    case 1:
                        listMaGiamGia = DAOService.maGiamGia.selectAvailable();
                        break;
                }
                fillToTable();
            }
        });
    }

    private void setTable() {
        String[] column = {"ID", "Mã giảm giá", "Giá trị", "Số lượng", "Ngày bắt đầu", "Ngày kết thúc"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(40);

        listMaGiamGia = DAOService.maGiamGia.selectAvailable();
        fillToTable();
    }

    private void showInfo() {
        if (index != -1) {
            MaGiamGia maGiamGia = listMaGiamGia.get(index);
            txtMaGiamGia.setText(maGiamGia.getMaGiamGia());
            txtGiaTri.setText(String.valueOf(maGiamGia.getGiaTri()));
            txtSoLuong.setText(String.valueOf(maGiamGia.getSoLuong()));
            txtNgayBatDau.setText(DateUtil.changeDateUStoVN(maGiamGia.getNgayBatDau()));
            txtNgayKetThuc.setText(DateUtil.changeDateUStoVN(maGiamGia.getNgayKetThuc()));
        }
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (MaGiamGia maGiamGia : listMaGiamGia) {
            model.addRow(new Object[]{
                "MGG" + maGiamGia.getIdMaGiamGia(), maGiamGia.getMaGiamGia(),
                maGiamGia.getGiaTri() + "%", maGiamGia.getSoLuong(), DateUtil.changeDateUStoVN(maGiamGia.getNgayBatDau()),
                DateUtil.changeDateUStoVN(maGiamGia.getNgayKetThuc())
            });
        }
        clear();
    }

    private void clear() {
        index = -1;
        txtGiaTri.setText("");
        txtMaGiamGia.setText("");
        txtNgayBatDau.setText(DateUtil.getDateNowVN());
        txtNgayKetThuc.setText(DateUtil.getDateNowVN());
        txtSoLuong.setText("");
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        txtNgayBatDau.setText(DateUtil.getDateNowVN());
        btnNgayKetThuc.setIcon(ImageUtil.getInstance().getIcon("date"));
    }

    private void add() {
        if (checkAllInput()) {
            MaGiamGia maGiamGia = new MaGiamGia(0, txtMaGiamGia.getText(),
                    Integer.parseInt(txtGiaTri.getText()), Integer.parseInt(txtSoLuong.getText()),
                    DateUtil.changeDateVNtoUS(txtNgayBatDau.getText()), DateUtil.changeDateVNtoUS(txtNgayKetThuc.getText()));
            DAOService.maGiamGia.insert(maGiamGia);
            listMaGiamGia = DAOService.maGiamGia.selectAvailable();
            fillToTable();
            new Thread(() -> {
                List<KhachHang> listKhachHang = DAOService.khachHang.selectAll();
                if (listKhachHang.isEmpty()) {
                    return;
                }
                String kh = "";
                for (KhachHang khachHang : listKhachHang) {
                    kh += ("," + khachHang.getEmail());
                }
                EmailUtil.guiMaGiamGia(kh, maGiamGia);
            }).start();
            DialogUtil.showSuccessfully("Thêm thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtMaGiamGia.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập mã giảm giá!", this);
            txtMaGiamGia.requestFocus();
            return false;
        } else if (txtGiaTri.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập giá trị mã giảm giá!", this);
            txtGiaTri.requestFocus();
            return false;
        } else if (txtSoLuong.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập số lượng mã giảm giá!", this);
            txtSoLuong.requestFocus();
            return false;
        } else {
            MaGiamGia maGiamGia = DAOService.maGiamGia.selectMa(txtMaGiamGia.getText());
            if (maGiamGia != null) {
                DialogUtil.showAlert("Mã giảm giá đã tồn tại!", this);
                txtMaGiamGia.requestFocus();
                return false;
            }
            try {
                int giaTri = Integer.parseInt(txtGiaTri.getText());
                if (giaTri < 0 && giaTri > 100) {
                    DialogUtil.showAlert("Vui lòng nhập giá trị trong khoảng 0 - 100!", this);
                    txtGiaTri.requestFocus();
                    return false;
                }
            } catch (Exception e) {
                DialogUtil.showAlert("Vui lòng nhập đúng giá trị!", this);
                txtGiaTri.requestFocus();
                return false;
            }
            try {
                int soLuong = Integer.parseInt(txtSoLuong.getText());
                if (soLuong < 1) {
                    DialogUtil.showAlert("Vui lòng nhập số lượng lớn hơn 0!", this);
                    txtGiaTri.requestFocus();
                    return false;
                }
            } catch (Exception e) {
                DialogUtil.showAlert("Vui lòng nhập đúng số lượng", this);
                txtSoLuong.requestFocus();
                return false;
            }
            return true;
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listMaGiamGia = DAOService.maGiamGia.selectAvailable();
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
    private List<MaGiamGia> listMaGiamGia;
    private int index = -1;

}
