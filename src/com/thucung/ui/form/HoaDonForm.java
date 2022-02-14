package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.thucung.dao.DAOService;
import com.thucung.models.HoaDon;
import com.thucung.other.Config;
import com.thucung.other.Scene;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.ExportHoaDon;
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
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class HoaDonForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;
    private JFrame parent;

    public HoaDonForm(JFrame parent) {
        this.parent = parent;
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

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelList = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        panelControl = new com.girlkun.panel.RoundPanel();
        panelFilter = new com.girlkun.panel.RoundPanel();
        cboFilter = new com.girlkun.combobox.Combobox();
        txtTimTheoNhanVien = new com.girlkun.textfield.TextField();
        txtTimTheoKhachHang = new com.girlkun.textfield.TextField();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelFilter.setBackground(new java.awt.Color(65, 65, 65));

        cboFilter.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cboFilter.setLabeText("Lọc");
        cboFilter.setLineChooseColor(new java.awt.Color(100, 100, 100));

        txtTimTheoNhanVien.setBackground(new java.awt.Color(65, 65, 65));
        txtTimTheoNhanVien.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTimTheoNhanVien.setLabelText("Tìm hóa đơn theo nhân viên");

        txtTimTheoKhachHang.setBackground(new java.awt.Color(65, 65, 65));
        txtTimTheoKhachHang.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTimTheoKhachHang.setLabelText("Tìm hóa đơn theo khách hàng");

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtTimTheoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtTimTheoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(cboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimTheoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimTheoKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        }
    }//GEN-LAST:event_tblListMouseClicked
    private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case SHOW:
                        showDetail();
                        break;
                    case TOP:
                        showTop10();
                        break;
                    case MY:
                        myReceipt();
                        break;
                    case EXPORT:
                        export();
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Xem chi tiết", ImageUtil.getInstance().getIcon("detail"), IEventControI.Chose.SHOW);
        addButton("10 hóa đơn đắt nhất", ImageUtil.getInstance().getIcon("top"), IEventControI.Chose.TOP);
        addButton("", ImageUtil.getInstance().getIcon(""), IEventControI.Chose.UPDATE);
        addButton("Hóa đơn của tôi", ImageUtil.getInstance().getIcon("bill"), IEventControI.Chose.MY);
        addButton("Xuât hóa đơn", ImageUtil.getInstance().getIcon("export"), IEventControI.Chose.EXPORT);
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
        panelControl.add(button, "height 0:0:200");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.combobox.Combobox cboFilter;
    private javax.swing.JScrollPane jScrollPane1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelList;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JTable tblList;
    private com.girlkun.textfield.TextField txtTimTheoKhachHang;
    private com.girlkun.textfield.TextField txtTimTheoNhanVien;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setEventFilter();
        setTable();
    }

    private void showDetail() {
        if (index != -1) {
            parent.setEnabled(false);
            new ThongTinHoaDon(this, listHoaDon.get(index)).setVisible(true);
        } else {
            DialogUtil.showAlert("Vui lòng chọn hóa đơn cần xem!", this);
        }
    }

    private void setEventFilter() {
        txtTimTheoNhanVien.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                listHoaDon = DAOService.hoaDon.selectByTenNhanVien(txtTimTheoNhanVien.getText());
                fillToTable();
            }
        });
        txtTimTheoKhachHang.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                listHoaDon = DAOService.hoaDon.selectByTenKhachHang(txtTimTheoKhachHang.getText());
                fillToTable();
            }
        });
        cboFilter.addItem("Tất cả hóa đơn");
        cboFilter.addItem("Hóa đơn tháng này");
        cboFilter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int indexCbo = cboFilter.getSelectedIndex();
                switch (indexCbo) {
                    case 0:
                        listHoaDon = DAOService.hoaDon.selectAll();
                        break;
                    case 1:
                        listHoaDon = DAOService.hoaDon.hoaDonThangHienTai();
                        break;
                }
                fillToTable();
            }
        });
    }

    private void export() {
        if (index != -1) {
            ExportHoaDon.createPDF(listHoaDon.get(index));
        } else {
            DialogUtil.showAlert("Vui lòng chọn hóa đơn cần xuất!", this);
        }
    }

    private void myReceipt() {
        listHoaDon = DAOService.hoaDon.hoaDonAdmin();
        fillToTable();
    }

    private void setTable() {
        String[] column = {"ID", "Khách hàng", "Thu ngân", "Mã giảm giá", "Ngày xuất đơn", "Tổng thu"};
        model = new DefaultTableModel(column, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        tblList.setModel(model);
        tblList.setRowHeight(30);

        listHoaDon = DAOService.hoaDon.selectAll();
        fillToTable();
    }

    private void showTop10() {
        listHoaDon = DAOService.hoaDon.top10hd();
        fillToTable();
    }

    private void fillToTable() {
        model.setRowCount(0);
        for (HoaDon hoaDon : listHoaDon) {
            model.addRow(new Object[]{
                "HD" + hoaDon.getIdHoaDon(), DAOService.khachHang.selectID(hoaDon.getKhachHang()).getTenKhachHang(),
                hoaDon.getNhanVien() == 0 ? Config.ADMIN_NAME : DAOService.nhanVien.selectID(hoaDon.getNhanVien()).getTenNhanVien(),
                hoaDon.getMaGiamGia() == 0 ? "" : DAOService.maGiamGia.selectID(hoaDon.getMaGiamGia()).getMaGiamGia()
                + " ( -" + DAOService.maGiamGia.selectID(hoaDon.getMaGiamGia()).getGiaTri() + "%)",
                DateUtil.changeTimeUStoVN(hoaDon.getNgayXuatHoaDon()), DAOService.hoaDon.tongTienHoaDon(hoaDon.getIdHoaDon()) + " VNĐ"
            });
        }
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 500 10 10 10", "[fill]", "[fill]10[fill]10[fill]10[fill]"));
    }

    public JFrame getMain() {
        return parent;
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            listHoaDon = DAOService.hoaDon.selectAll();
            fillToTable();
        });
        setup.start();
    }

    @Override
    public void destroy() {
        if (setup != null && setup.isAlive()) {

        }
    }

    private Thread setup;
    private DefaultTableModel model;
    private List<HoaDon> listHoaDon;
    private int index = -1;
}
