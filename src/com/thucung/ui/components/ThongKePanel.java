package com.thucung.ui.components;

import com.girlkun.chart.ModelChart;
import com.girlkun.chart.ModelPolarAreaChart;
import com.thucung.dao.DAOService;
import com.thucung.dao.DAOThongKe;
import com.thucung.models.NhanVien;
import com.thucung.other.Config;
import java.awt.Color;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ThongKePanel extends javax.swing.JPanel {

    private Random rd = new Random();

    public ThongKePanel(int thang, int nam) {
        this.thang = thang;
        this.nam = nam;
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        lblHDBan = new javax.swing.JLabel();
        lblDoanhThu = new javax.swing.JLabel();
        lblTiLeDoanhThu = new javax.swing.JLabel();
        roundPanel3 = new com.girlkun.panel.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        chartTop5 = new com.girlkun.chart.PolarAreaChart();
        roundPanel4 = new com.girlkun.panel.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        chartYear = new com.girlkun.chart.LineChart();
        roundPanel5 = new com.girlkun.panel.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        chartBanHang = new com.girlkun.chart.Chart();

        setBackground(new java.awt.Color(20, 20, 20));
        setOpaque(false);

        roundPanel1.setBackground(new java.awt.Color(20, 20, 20));

        roundPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblHDBan.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblHDBan.setForeground(new java.awt.Color(255, 255, 255));
        lblHDBan.setText("Số đơn đã bán trong tháng: ");

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
                .addGap(5, 5, 5)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHDBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTiLeDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblHDBan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblTiLeDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        roundPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Top 5 sản phẩm bán chạy");

        chartTop5.setFocusable(false);
        chartTop5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartTop5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartTop5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        chartYear.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(chartYear, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(chartYear, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1)
                .addGap(1, 1, 1))
        );

        roundPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Biểu đồ bán hàng tháng");

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chartBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(chartBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.chart.Chart chartBanHang;
    private com.girlkun.chart.PolarAreaChart chartTop5;
    private com.girlkun.chart.LineChart chartYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblHDBan;
    private javax.swing.JLabel lblTiLeDoanhThu;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private com.girlkun.panel.RoundPanel roundPanel3;
    private com.girlkun.panel.RoundPanel roundPanel4;
    private com.girlkun.panel.RoundPanel roundPanel5;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        setLabelThongKe();
        setChartTop5();
        setChartYear();
        setChartBanHang();
        start();
    }
    
    private void start(){
        new Thread(()->{
            chartBanHang.start();
        }).start();
        new Thread(()->{
            chartTop5.start();
        }).start();
        new Thread(()->{
            chartYear.start();
        }).start();
    }

    private void setChartBanHang() {
        chartBanHang.addLegend("Số hóa đơn", new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)),
                new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
        chartBanHang.addLegend("Doanh thu", new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)),
                new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));

        DAOThongKe.ThongKeTheoNhanVien thongKeMe = DAOService.thongKe.getThongKeTheoThangNamAdmin(thang, nam);
        chartBanHang.addData(new ModelChart(Config.ADMIN_NAME, new double[]{thongKeMe.getSoLuongDon(), thongKeMe.getTongTien()}));
        List<NhanVien> listNhanVien = DAOService.nhanVien.selectAll();
        for (NhanVien nhanVien : listNhanVien) {
            DAOThongKe.ThongKeTheoNhanVien thongKe = DAOService.thongKe.getThongKeTheoThangNamNhanVien(
                    nhanVien.getIdNhanVien(), thang, nam);
            chartBanHang.addData(new ModelChart(nhanVien.getTenNhanVien(), new double[]{thongKe.getSoLuongDon(), thongKe.getTongTien()}));
        }
    }

    private void setChartYear() {
        chartYear.addLegend("Doanh thu", new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)),
                new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
        for (int i = 0; i < 12; i++) {
            double[] data = new double[1];
            data[0] = DAOService.thongKe.getThuNhapThang(i + 1, nam);
            chartYear.addData(new ModelChart("Tháng" + (i + 1), data));
        }
    }

    private void setChartTop5() {
        List<DAOThongKe.SanPham_PhuKienThang> list = DAOService.thongKe.top5SanPhamThang(thang, nam);
        for (DAOThongKe.SanPham_PhuKienThang sp : list) {
            chartTop5.addItem(new ModelPolarAreaChart(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)),
                    "SP-PK" + sp.getIdSanPham_PhuKien(),
                    sp.getSoLuong()));
        }
    }

    private void setLabelThongKe() {
        double doanhThuThang = DAOService.thongKe.getThuNhapThang(thang, nam);
        lblHDBan.setText(lblHDBan.getText() + DAOService.thongKe.getSoDonTrongThang(thang, nam) + " đơn");
        lblDoanhThu.setText(lblDoanhThu.getText() + doanhThuThang + " VNĐ");
        int thangTruoc = thang - 1;
        if (thangTruoc < 1) {
            thangTruoc = 12;
            nam--;
        }
        double doanhThuThangTruoc = DAOService.thongKe.getThuNhapThang(thangTruoc, nam);
        if (doanhThuThangTruoc != 0) {
            lblTiLeDoanhThu.setText(lblTiLeDoanhThu.getText()
                    + Config.formatDecimal.format((doanhThuThang / doanhThuThangTruoc * 100)) + "%");
        }
    }

    private int thang;
    private int nam;
}
