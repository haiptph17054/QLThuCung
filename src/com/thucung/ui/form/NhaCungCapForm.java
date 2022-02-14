package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.dao.DAOService;
import com.thucung.models.Huyen;
import com.thucung.models.NhaCungCap;
import com.thucung.models.ThanhPho;
import com.thucung.models.Xa_Phuong;
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
public class NhaCungCapForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public NhaCungCapForm() {
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

        dateChooser = new cambodia.raven.DateChooser();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        txtTenNhaCungCap = new com.girlkun.textfield.TextField();
        txtNgayHopTac = new com.girlkun.textfield.TextField();
        txtSoDienThoai = new com.girlkun.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtDiaChi = new com.girlkun.textfield.TextField();
        cboThanhPho = new com.girlkun.combobox.Combobox();
        cboHuyen = new com.girlkun.combobox.Combobox();
        cboXaPhuong = new com.girlkun.combobox.Combobox();
        btnChooseDate = new com.girlkun.button.Button();
        panelFilter = new com.girlkun.panel.RoundPanel();
        cboTrangThai = new com.girlkun.combobox.Combobox();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();

        dateChooser.setButton(btnChooseDate);
        dateChooser.setTextRefernce(txtNgayHopTac);

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(65, 65, 65));

        txtTenNhaCungCap.setBackground(new java.awt.Color(65, 65, 65));
        txtTenNhaCungCap.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTenNhaCungCap.setLabelText("Tên nhà cung cấp");

        txtNgayHopTac.setBackground(new java.awt.Color(65, 65, 65));
        txtNgayHopTac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtNgayHopTac.setLabelText("Ngày hợp tác");

        txtSoDienThoai.setBackground(new java.awt.Color(65, 65, 65));
        txtSoDienThoai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtSoDienThoai.setLabelText("Điện thoại liên hệ");

        jLabel1.setBackground(new java.awt.Color(65, 65, 65));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin nhà cung cấp");

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

        btnChooseDate.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboThanhPho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboHuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cboXaPhuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(txtNgayHopTac, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnChooseDate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayHopTac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        tblList.setGridColor(new java.awt.Color(255, 0, 0));
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
                    case STOPCOOPERATE:
                        stopCooperate();
                        break;
                    case COOPERATE:
                        cooperate();
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

        addButton("Ngừng hợp tác", ImageUtil.getInstance().getIcon("block"), IEventControI.Chose.STOPCOOPERATE);
        addButton("Hợp tác", ImageUtil.getInstance().getIcon("handshake"), IEventControI.Chose.COOPERATE);
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
    private com.girlkun.button.Button btnChooseDate;
    private com.girlkun.combobox.Combobox cboHuyen;
    private com.girlkun.combobox.Combobox cboThanhPho;
    private com.girlkun.combobox.Combobox cboTrangThai;
    private com.girlkun.combobox.Combobox cboXaPhuong;
    private cambodia.raven.DateChooser dateChooser;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollInfo;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtDiaChi;
    private com.girlkun.textfield.TextField txtNgayHopTac;
    private com.girlkun.textfield.TextField txtSoDienThoai;
    private com.girlkun.textfield.TextField txtTenNhaCungCap;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setScrollBar();
        setupCombobox();
        setEventCombobox();
        setupTable();
        setEventTimTheoTrangThai();
    }

    private void showInfo() {
        if (index != -1) {
            NhaCungCap nhaCungCap = listNhaCungCap.get(index);
            txtTenNhaCungCap.setText(nhaCungCap.getTenNhaCungCap());
            txtNgayHopTac.setText(DateUtil.changeDateUStoVN(nhaCungCap.getNgayHopTac()));
            txtSoDienThoai.setText(nhaCungCap.getSoDienThoai());
            txtDiaChi.setText(nhaCungCap.getDiaChi());
        }
    }

    private void setEventTimTheoTrangThai() {
        cboTrangThai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cboTrangThai.getSelectedIndex()) {
                    case 1:
                        listNhaCungCap = DAOService.nhaCungCap.selectByTrangThai(1);
                        fillToTable();
                        break;
                    case 2:
                        listNhaCungCap = DAOService.nhaCungCap.selectByTrangThai(0);
                        fillToTable();
                        break;
                    default:
                        listNhaCungCap = DAOService.nhaCungCap.selectAll();
                        fillToTable();
                        break;
                }
                fillToTable();
            }
        });
    }

    private void setupCombobox() {
        cboTrangThai.addItem("Tất cả");
        cboTrangThai.addItem("Hợp tác");
        cboTrangThai.addItem("Ngừng hợp tác");
        cboTrangThai.setSelectedIndex(0);

        listThanhPho = DAOService.thanhPho.selectAll();
        for (ThanhPho thanhPho : listThanhPho) {
            cboThanhPho.addItem(thanhPho.getTenThanhPho());
        }
    }

    private void setScrollBar() {
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(new Color(153, 153, 0));
        scrollInfo.setVerticalScrollBar(sbc);
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

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        btnChooseDate.setIcon(ImageUtil.getInstance().getIcon("date"));
        txtNgayHopTac.setText(DateUtil.getDateNowVN());
    }

    private void setupTable() {
        String[] column = {"ID", "Tên nhà cung cấp", "Ngày hợp tác", "Trạng thái"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listNhaCungCap = DAOService.nhaCungCap.selectAll();
        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (NhaCungCap nhaCungCap : listNhaCungCap) {
            model.addRow(new Object[]{
                "NCC" + nhaCungCap.getIdNhaCungCap(), nhaCungCap.getTenNhaCungCap(),
                DateUtil.changeDateUStoVN(nhaCungCap.getNgayHopTac()),
                nhaCungCap.getTrangThai() == 0 ? "Ngừng hợp tác" : "Hợp tác"
            });
        }
        clear();
    }

    private void clear() {
        index = -1;
        txtTenNhaCungCap.setText("");
        txtDiaChi.setText("");
        txtNgayHopTac.setText(DateUtil.getDateNowVN());
        txtSoDienThoai.setText("");
        cboXaPhuong.removeAll();
        cboHuyen.removeAll();
        cboThanhPho.setSelectedIndex(-1);
        cboHuyen.setSelectedIndex(-1);
        cboXaPhuong.setSelectedIndex(-1);
    }

    private void add() {
        if (checkAllInput()) {
            NhaCungCap ncc = DAOService.nhaCungCap.selectBySoDienThoai(txtSoDienThoai.getText());
            if (ncc != null) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", this);
                return;
            }
            NhaCungCap nhaCungCap = new NhaCungCap(0, txtTenNhaCungCap.getText(),
                    DateUtil.changeDateVNtoUS(txtNgayHopTac.getText()), txtDiaChi.getText(), txtSoDienThoai.getText(), 1);
            DAOService.nhaCungCap.insert(nhaCungCap);
            listNhaCungCap = DAOService.nhaCungCap.selectAll();
            fillToTable();
            DialogUtil.showAlert("Thêm thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (txtTenNhaCungCap.getText().trim().equals("") || txtNgayHopTac.getText().trim().equals("")
                || txtSoDienThoai.getText().trim().equals("") || txtDiaChi.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", this);
            return false;
        } else {
            if (!txtSoDienThoai.getText().matches("0\\d{9,10}")) {
                DialogUtil.showAlert("Vui lòng nhập đúng số điện thoại!", this);
                return false;
            }
            return true;
        }
    }

    private void update() {
        if (index != -1 && checkAllInput()) {
            NhaCungCap ncc = DAOService.nhaCungCap.selectBySoDienThoai(txtSoDienThoai.getText());
            if (ncc != null && ncc.getIdNhaCungCap() != listNhaCungCap.get(index).getIdNhaCungCap()) {
                DialogUtil.showAlert("Số điện thoại đã tồn tại!\nVui lòng nhập số điện thoại khác!", this);
                return;
            }
            NhaCungCap nhaCungCap = new NhaCungCap(listNhaCungCap.get(index).getIdNhaCungCap(), txtTenNhaCungCap.getText(),
                    DateUtil.changeDateVNtoUS(txtNgayHopTac.getText()), txtDiaChi.getText(), txtSoDienThoai.getText(),
                    listNhaCungCap.get(index).getTrangThai());
            DAOService.nhaCungCap.update(nhaCungCap);
            listNhaCungCap = DAOService.nhaCungCap.selectAll();
            fillToTable();
            DialogUtil.showAlert("Cập nhật thành công!", this);
        }
    }

    private void delete() {
        if (index != -1) {
            if (DAOService.sanPham_PhuKien.selectByNCC(listNhaCungCap.get(index).getIdNhaCungCap()).size() > 0
                    || DAOService.thuCung.selectByNhaCungCap(listNhaCungCap.get(index).getIdNhaCungCap()).size() > 0) {
                DialogUtil.showAlert("Không thể xóa nhà cung cấp này!", this);
            } else {
                DAOService.nhaCungCap.delete(listNhaCungCap.get(index).getIdNhaCungCap());
                listNhaCungCap = DAOService.nhaCungCap.selectAll();
                fillToTable();
                DialogUtil.showAlert("Xóa thành công!", this);
            }
        }
    }

    private void stopCooperate() {
        if (index != -1) {
            DAOService.nhaCungCap.stopCopperate(listNhaCungCap.get(index));
            listNhaCungCap = DAOService.nhaCungCap.selectAll();
            fillToTable();
        }
    }

    private void cooperate() {
        if (index != -1) {
            DAOService.nhaCungCap.cooperate(listNhaCungCap.get(index));
            listNhaCungCap = DAOService.nhaCungCap.selectAll();
            fillToTable();
        }
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listNhaCungCap = DAOService.nhaCungCap.selectAll();
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
    private List<NhaCungCap> listNhaCungCap;
    private int index = -1;
    private List<ThanhPho> listThanhPho;
    private List<Huyen> listHuyen;
    private List<Xa_Phuong> listXa_Phuong;
    private Thread setup;
}
