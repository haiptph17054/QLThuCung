package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.chart.ModelChart;
import com.thucung.dao.DAOService;
import com.thucung.dao.DAOThongKe;
import com.thucung.models.NhanVien;
import com.thucung.other.Config;
import com.thucung.other.Scene;
import com.thucung.util.DateUtil;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ThongKeForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public ThongKeForm() {
        initComponents();
        setOther();
        initEvent();
//        initButton();
        setup = new Thread(() -> {
            setup();
        });
        setup.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHDBan = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblTiLeDoanhThu = new javax.swing.JLabel();
        panelControl = new com.girlkun.panel.RoundPanel();
        roundPanel4 = new com.girlkun.panel.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        lblNV1 = new javax.swing.JLabel();
        lblNV2 = new javax.swing.JLabel();
        lblNV3 = new javax.swing.JLabel();
        roundPanel5 = new com.girlkun.panel.RoundPanel();
        chart = new com.girlkun.chart.Chart();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        roundPanel2.setBackground(new java.awt.Color(65, 65, 65));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doanh thu tháng 11");

        lblHDBan.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblHDBan.setForeground(new java.awt.Color(255, 255, 255));
        lblHDBan.setText("Số đơn đã bán: ");

        lblDoanhThu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        lblDoanhThu.setText("Tổng doanh thu tháng: ");

        lblTiLeDoanhThu.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTiLeDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        lblTiLeDoanhThu.setText("Tỉ lệ doanh thu so với tháng trước: ");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHDBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTiLeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblHDBan, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblTiLeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        roundPanel4.setBackground(new java.awt.Color(65, 65, 65));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Top 3 nhân viên tháng");

        lblNV1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblNV1.setForeground(new java.awt.Color(255, 255, 255));

        lblNV2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblNV2.setForeground(new java.awt.Color(255, 255, 255));

        lblNV3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblNV3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNV2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(lblNV3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblNV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblNV2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblNV3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        roundPanel5.setBackground(new java.awt.Color(65, 65, 65));

        chart.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
 private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case SHOW:
                        break;
                    case TOP:
                        break;
                    case MY:
                        break;
                    case EXPORT:
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("10 hóa đơn đắt nhất", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.TOP);
        addButton("", ImageUtil.getInstance().getIcon("updating"), IEventControI.Chose.UPDATE);
        addButton("Hóa đơn của tôi", ImageUtil.getInstance().getIcon("delete-button"), IEventControI.Chose.MY);
        addButton("Xuât hóa đơn", ImageUtil.getInstance().getIcon("delete-button"), IEventControI.Chose.EXPORT);
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
    private com.girlkun.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblHDBan;
    private javax.swing.JLabel lblNV1;
    private javax.swing.JLabel lblNV2;
    private javax.swing.JLabel lblNV3;
    private javax.swing.JLabel lblTiLeDoanhThu;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private com.girlkun.panel.RoundPanel roundPanel4;
    private com.girlkun.panel.RoundPanel roundPanel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        setText();
        setChart();
    }

    private void setChart() {
        chart.addLegend("Số hóa đơn", Color.red, Color.black);
        chart.addLegend("Doanh thu", Color.yellow, Color.black);

        List<NhanVien> listNhanVien = DAOService.nhanVien.selectAll();
        DAOThongKe.ThongKeTheoNhanVien thongKeMe = DAOService.thongKe.getThongKeTheoThangNamAdmin(DateUtil.getMonthNow(), DateUtil.getYearNow());
        chart.addData(new ModelChart(Config.ADMIN_NAME, new double[]{thongKeMe.getSoLuongDon(), thongKeMe.getTongTien()}));
        for (NhanVien nhanVien : listNhanVien) {
            DAOThongKe.ThongKeTheoNhanVien thongKe = DAOService.thongKe.getThongKeTheoThangNamNhanVien(
                    nhanVien.getIdNhanVien(), DateUtil.getMonthNow(), DateUtil.getYearNow());
            chart.addData(new ModelChart(nhanVien.getTenNhanVien(), new double[]{thongKe.getSoLuongDon(), thongKe.getTongTien()}));
        }
        chart.start();
    }

    private void setText() {
        List<DAOThongKe.ThongKeTheoNhanVien> listThongKe = DAOService.thongKe.getTop3NV();
        try {
            lblNV1.setText(DAOService.nhanVien.selectID(listThongKe.get(0).getNhanVien()).getTenNhanVien() + ": " + listThongKe.get(0).getTongTien() + " VNĐ");
            lblNV2.setText(DAOService.nhanVien.selectID(listThongKe.get(1).getNhanVien()).getTenNhanVien() + ": " + listThongKe.get(1).getTongTien() + " VNĐ");
            lblNV3.setText(DAOService.nhanVien.selectID(listThongKe.get(2).getNhanVien()).getTenNhanVien() + ": " + listThongKe.get(2).getTongTien() + " VNĐ");
        } catch (Exception ex) {

        }

        int monthNow = DateUtil.getMonthNow();
        int yearNow = DateUtil.getYearNow();
        double doanhThuThang = DAOService.thongKe.getThuNhapThang(monthNow, yearNow);

        lblHDBan.setText(lblHDBan.getText() + DAOService.thongKe.getSoDonTrongThang(monthNow, yearNow) + " đơn");
        lblDoanhThu.setText(lblDoanhThu.getText() + doanhThuThang + " VNĐ");

        int monthPrev = monthNow - 1;
        if (monthPrev < 1) {
            monthPrev = 12;
            yearNow--;
        }
        double doanhThuThangTruoc = DAOService.thongKe.getThuNhapThang(monthPrev, yearNow);
        if (doanhThuThangTruoc != 0) {
            lblTiLeDoanhThu.setText(lblTiLeDoanhThu.getText() + (doanhThuThang / doanhThuThangTruoc * 100) + "%");
        }
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, wrap, inset 5 30 5 30", "[fill]", "[fill]10[fill]10[fill]10[fill]"));
    }

    @Override
    public void reload() {
        setup = new Thread(() -> {
            setup();
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
}
