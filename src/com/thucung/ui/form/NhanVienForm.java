package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.dao.DAOService;
import com.thucung.models.Huyen;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.models.ThanhPho;
import com.thucung.models.Xa_Phuong;
import com.thucung.other.Scene;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.FileUtil;
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
public class NhanVienForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public NhanVienForm() {
        initComponents();
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
        dateChooser1 = new cambodia.raven.DateChooser();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        image = new com.girlkun.panel.PictureBox();
        txtTenNhanVien = new com.girlkun.textfield.TextField();
        txtNgaySinh = new com.girlkun.textfield.TextField();
        btnDate = new com.girlkun.button.Button();
        jPanel1 = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtSoDienThoai = new com.girlkun.textfield.TextField();
        txtEmail = new com.girlkun.textfield.TextField();
        txtDiaChi = new com.girlkun.textfield.TextField();
        cboThanhPho = new com.girlkun.combobox.Combobox();
        cboHuyen = new com.girlkun.combobox.Combobox();
        cboXaPhuong = new com.girlkun.combobox.Combobox();
        panelFilter = new com.girlkun.panel.RoundPanel();
        txtTimTheoTen = new com.girlkun.textfield.TextField();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();

        dateChooser1.setButton(btnDate);
        dateChooser1.setTextRefernce(txtNgaySinh);

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(100, 100, 100));

        image.setBackground(new java.awt.Color(65, 65, 65));
        image.setOpaque(true);
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });

        txtTenNhanVien.setBackground(new java.awt.Color(65, 65, 65));
        txtTenNhanVien.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenNhanVien.setLabelText("Tên nhân viên");

        txtNgaySinh.setEditable(false);
        txtNgaySinh.setBackground(new java.awt.Color(65, 65, 65));
        txtNgaySinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNgaySinh.setLabelText("Ngày sinh");

        btnDate.setBackground(new java.awt.Color(100, 100, 100));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdoNam)
                .addGap(47, 47, 47)
                .addComponent(rdoNu)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboThanhPho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboHuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboXaPhuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
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
                .addGap(5, 5, 5)
                .addComponent(scrollInfo)
                .addGap(5, 5, 5))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrollInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        txtTimTheoTen.setBackground(new java.awt.Color(65, 65, 65));
        txtTimTheoTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTimTheoTen.setLabelText("Tìm theo tên");

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtTimTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1)
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
            .addGap(0, 120, Short.MAX_VALUE)
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

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            imagePath = fileChooser.getSelectedFile().getAbsolutePath();
            image.setImage(ImageUtil.getImage(imagePath, ImageUtil.NHANVIEN));
            image.repaint();
        }
    }//GEN-LAST:event_imageMouseClicked

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
        addButton("làm mới", ImageUtil.getInstance().getIcon("eraser"), IEventControI.Chose.CLEAR);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Cập nhật", ImageUtil.getInstance().getIcon("updating"), IEventControI.Chose.UPDATE);
        addButton("Xóa", ImageUtil.getInstance().getIcon("delete-button"), IEventControI.Chose.DELETE);
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
        panelControl.add(button);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.Button btnDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.girlkun.combobox.Combobox cboHuyen;
    private com.girlkun.combobox.Combobox cboThanhPho;
    private com.girlkun.combobox.Combobox cboXaPhuong;
    private cambodia.raven.DateChooser dateChooser1;
    private com.girlkun.panel.PictureBox image;
    private javax.swing.JPanel info;
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
    private com.girlkun.textfield.TextField txtNgaySinh;
    private com.girlkun.textfield.TextField txtSoDienThoai;
    private com.girlkun.textfield.TextField txtTenNhanVien;
    private com.girlkun.textfield.TextField txtTimTheoTen;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        this.setOpaque(false);
        setScrollBar();
        initEvent();

        setupCombobox();
        setEventCombobox();
        setupTable();
        setupFileChooser();
        setEventTxtTimTheoTen();
//        setEventLocChungLoai();
    }

    private void setEventTxtTimTheoTen() {
        txtTimTheoTen.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                listNhanVien = DAOService.nhanVien.find(txtTimTheoTen.getText());
                fillToTable();
            }
        });
    }

    private void setupCombobox() {
        listThanhPho = DAOService.thanhPho.selectAll();
        for (ThanhPho thanhPho : listThanhPho) {
            cboThanhPho.addItem(thanhPho.getTenThanhPho());
        }
    }

    private void setupFileChooser() {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Chọn hình ảnh", "png", "jpg", "jpeg"));
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
    }

    private void setScrollBar() {
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(new Color(153, 153, 0));
        scrollInfo.setVerticalScrollBar(sbc);
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        image.setImage(ImageUtil.getInstance().getIcon("defaultpet"));
        btnDate.setIcon(ImageUtil.getInstance().getIcon("date"));
    }

    private void setupTable() {
        String[] column = {"ID", "Tên nhân viên", "Ngày sinh", "Giới tính", "Số điện thoại", "Email"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listNhanVien = DAOService.nhanVien.selectAll();
        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (NhanVien nhanVien : listNhanVien) {
            model.addRow(new Object[]{
                "NV" + nhanVien.getIdNhanVien(), nhanVien.getTenNhanVien(),
                DateUtil.changeDateUStoVN(nhanVien.getNgaySinh()), nhanVien.getGioiTinh() == 0 ? "Nam" : "Nữ",
                nhanVien.getSoDienThoai(), nhanVien.getEmail()
            });
        }
        clear();
    }

    private void clear() {
        index = -1;
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtNgaySinh.setText(DateUtil.getDateNowVN());
        txtSoDienThoai.setText("");
        txtTenNhanVien.setText("");
        image.setImage(ImageUtil.getInstance().getIcon("defaultemployee"));
        image.repaint();
        rdoNam.setSelected(true);
        cboThanhPho.setSelectedIndex(-1);
        cboHuyen.setSelectedIndex(-1);
        cboXaPhuong.setSelectedIndex(-1);
    }

    private void showInfo() {
        if (index != -1) {
            NhanVien nhanVien = listNhanVien.get(index);
            txtDiaChi.setText(nhanVien.getDiaChi());
            txtEmail.setText(nhanVien.getEmail());
            txtNgaySinh.setText(DateUtil.changeDateUStoVN(nhanVien.getNgaySinh()));
            txtSoDienThoai.setText(nhanVien.getSoDienThoai());
            txtTenNhanVien.setText(nhanVien.getTenNhanVien());
            image.setImage(ImageUtil.getImage(nhanVien.getHinhAnh(), ImageUtil.NHANVIEN));
            image.repaint();
            if (nhanVien.getGioiTinh() == 0) {
                rdoNam.setSelected(true);
            } else {
                rdoNu.setSelected(true);
            }
        }
    }

    private void add() {
        if (checkAllInput()) {
            NhanVien nv1 = DAOService.nhanVien.selectByEmail(txtEmail.getText());
            NhanVien nv2 = DAOService.nhanVien.selectBySoDienThoai(txtSoDienThoai.getText());
            if (nv1 != null) {
                DialogUtil.showAlert("Email đã tồn tại!\nVui lòng nhập email khác!", jPanel1);
                return;
            }
            if (nv2 != null) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", jPanel1);
                return;
            }
            if (!imagePath.trim().equals("")) {
                imagePath = ImageUtil.copyImage(imagePath, txtTenNhanVien.getText(), ImageUtil.NHANVIEN);
            }
            NhanVien nhanVien = new NhanVien(0, txtTenNhanVien.getText(), DateUtil.changeDateVNtoUS(txtNgaySinh.getText()),
                    rdoNam.isSelected() ? 0 : 1, txtDiaChi.getText(), txtSoDienThoai.getText(),
                    txtEmail.getText(), imagePath);
            TaiKhoan taiKhoanNhanVien = DAOService.nhanVien.insertOuputAccount(nhanVien);
            listNhanVien = DAOService.nhanVien.selectAll();
            fillToTable();
            FileUtil.printData(FileUtil.ACCOUNT, String.format("%-30s%-20s%-20s", nhanVien.getTenNhanVien(),
                    taiKhoanNhanVien.getTaiKhoan(), taiKhoanNhanVien.getMatKhau()), true);
            DialogUtil.showSuccessfully("Thêm thành công!", this);
        }
    }

    private void update() {
        if (index != -1 && checkAllInput()) {
            NhanVien nv1 = DAOService.nhanVien.selectByEmail(txtEmail.getText());
            NhanVien nv2 = DAOService.nhanVien.selectBySoDienThoai(txtSoDienThoai.getText());
            if (nv1 != null && nv1.getIdNhanVien() != listNhanVien.get(index).getIdNhanVien()) {
                DialogUtil.showAlert("Email đã tồn tại!\nVui lòng nhập email khác!", jPanel1);
                return;
            }
            if (nv2 != null && nv2.getIdNhanVien() != listNhanVien.get(index).getIdNhanVien()) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", jPanel1);
                return;
            }
            if (!imagePath.trim().equals("")) {
                imagePath = ImageUtil.copyImage(imagePath, txtTenNhanVien.getText(), ImageUtil.NHANVIEN);
            }
            NhanVien nhanVien = new NhanVien(listNhanVien.get(index).getIdNhanVien(),
                    txtTenNhanVien.getText(), DateUtil.changeDateVNtoUS(txtNgaySinh.getText()),
                    rdoNam.isSelected() ? 0 : 1, txtDiaChi.getText(), txtSoDienThoai.getText(),
                    txtEmail.getText(), imagePath);
            DAOService.nhanVien.update(nhanVien);
            listNhanVien = DAOService.nhanVien.selectAll();
            fillToTable();
            DialogUtil.showSuccessfully("Cập nhật thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtDiaChi.getText().trim().equals("") || txtEmail.getText().trim().equals("")
                || txtNgaySinh.getText().trim().equals("") || txtSoDienThoai.getText().trim().equals("")
                || txtTenNhanVien.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", this);
            return false;
        } else {
            if (!txtSoDienThoai.getText().trim().matches("0\\d{9,10}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng số điện thoại!", this);
                return false;
            }
            if (!txtEmail.getText().trim().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng email!", this);
                return false;
            }
            return true;
        }
    }

    private void delete() {
        if (index != -1) {
            if (DAOService.hoaDon.selectByNhanVien(listNhanVien.get(index).getIdNhanVien()).size() > 0) {
                DialogUtil.showAlert("Không thể xóa nhân viên này!", this);
            } else {
                DAOService.taiKhoan.deleteByNhanVien(listNhanVien.get(index).getIdNhanVien());
                DAOService.nhanVien.delete(listNhanVien.get(index).getIdNhanVien());
                listNhanVien = DAOService.nhanVien.selectAll();
                fillToTable();
                DialogUtil.showSuccessfully("Xóa thành công!", this);
            }
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listNhanVien = DAOService.nhanVien.selectAll();
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
    private List<NhanVien> listNhanVien;
    private List<ThanhPho> listThanhPho;
    private List<Huyen> listHuyen;
    private List<Xa_Phuong> listXa_Phuong;
    private JFileChooser fileChooser;
    private String imagePath = "";
    private int index = -1;
    private Thread setup;
}
