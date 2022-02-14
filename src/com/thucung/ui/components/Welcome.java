package com.thucung.ui.components;

import com.thucung.dao.DAOService;
import com.thucung.jdbc.JDBC;
import com.thucung.main.Start;
import com.thucung.util.ImageUtil;
import java.util.Random;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class Welcome extends javax.swing.JPanel {

    private Start start;
    private int[] timeStart;

    public Welcome(Start start) {
        this.start = start;
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new com.girlkun.liquidprogress.LiquidProgress();
        lblProgress = new javax.swing.JLabel();

        setBackground(new java.awt.Color(65, 65, 65));

        progress.setBackground(new java.awt.Color(65, 65, 65));
        progress.setForeground(new java.awt.Color(255, 0, 0));
        progress.setAnimateColor(new java.awt.Color(255, 255, 255));
        progress.setBorderColor(new java.awt.Color(255, 255, 255));
        progress.setBorderSize(2);
        progress.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        lblProgress.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblProgress;
    private com.girlkun.liquidprogress.LiquidProgress progress;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        Random rd = new Random();
        timeStart = new int[3];
        timeStart[0] = rd.nextInt(35);
        timeStart[1] = rd.nextInt(35) + 35;
        timeStart[2] = rd.nextInt(30) + 50;
        start();
    }

    private void start() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                lblProgress.setText("Chuẩn bị tài nguyên hệ thống.....");
                progress.setValue(i);
                if (i == timeStart[0]) {
                    lblProgress.setText("Bắt đầu kết nối database......");
                    JDBC.open();
                    lblProgress.setText("Kết nối database thành công......");
                }
                if (i == timeStart[1]) {
                    lblProgress.setText("Chuẩn bị service......");
                    DAOService.open();
                    lblProgress.setText("Chuẩn bị service xong......");
                }
                if (i == timeStart[2]) {
                    lblProgress.setText("Khởi tạo dữ liệu hình ảnh.....");
                    ImageUtil.initBanner();
                    lblProgress.setText("Khởi tạo thành công......");
                }
                lblProgress.setText("Chuẩn bị mở form đăng nhập.....");
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            start.getSlide().slideTo(Start.LOGIN);
        }).start();
    }
}
