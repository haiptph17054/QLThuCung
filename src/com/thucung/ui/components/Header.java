package com.thucung.ui.components;

import com.thucung.jdbc.JDBC;
import com.thucung.main.Main;
import com.thucung.main.Start;
import com.thucung.ui.form.GioHangForm;
import com.thucung.ui.form.ThanhToanForm;
import com.thucung.ui.form.ThongTinHoaDon;
import com.thucung.util.ImageUtil;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        exit = new com.girlkun.button.ButtonBadges();
        minus = new com.girlkun.button.ButtonBadges();
        lblTime = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        lblTime.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(81, 81, 81)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.ButtonBadges exit;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTime;
    private com.girlkun.button.ButtonBadges minus;
    private com.girlkun.panel.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables

    public void setButton(JFrame parent) {
        this.parent = parent;
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (parent instanceof Main || parent instanceof Start) {
                    JDBC.closeConnection();
                    System.exit(0);
                } else {
                    if (parent instanceof GioHangForm) {
                        ((GioHangForm) parent).main.setEnabled(true);
                    }
                    if (parent instanceof ThanhToanForm) {
                        ((ThanhToanForm) parent).parent.setEnabled(true);
                    }
                    if (parent instanceof ThongTinHoaDon) {
                        ((ThongTinHoaDon) parent).getMain().setEnabled(true);
                    }
                    parent.dispose();
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setState(Frame.ICONIFIED);
            }
        });
    }

    private void addEventDrag() {
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                pX = me.getX();
                pY = me.getY();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {

                parent.setLocation(parent.getLocation().x + me.getX() - pX,
                        parent.getLocation().y + me.getY() - pY);
            }
        });
    }

    public void setup() {
        this.setOpaque(false);
        exit.setIcon(ImageUtil.getInstance().getIcon("close"));
        minus.setIcon(ImageUtil.getInstance().getIcon("minus"));
        addEventDrag();
        lblIcon.setIcon(new ImageIcon(ImageUtil.getInstance().getIcon("icon").
                getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH)));
    }

    public void showTime() {
        new Thread(() -> {
            SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aa");
            Date date;
            while (true) {
                date = new Date();
                lblTime.setText(fm.format(date));
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private int pX;
    private int pY;
    private JFrame parent;
}
