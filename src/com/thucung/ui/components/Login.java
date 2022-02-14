package com.thucung.ui.components;

import com.thucung.dao.DAOService;
import com.thucung.main.Main;
import com.thucung.main.Start;
import com.thucung.models.TaiKhoan;
import com.thucung.util.CharUtil;
import com.thucung.util.DialogUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class Login extends javax.swing.JPanel {

    private Start start;

    public Login(Start start) {
        this.start = start;
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTaiKhoan = new com.girlkun.textfield.TextField();
        txtMatKhau = new com.girlkun.textfield.PasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnDangNhap = new com.girlkun.button.Button();
        btnQuenMatKhau = new com.girlkun.button.Button();

        setBackground(new java.awt.Color(65, 65, 65));

        txtTaiKhoan.setBackground(new java.awt.Color(65, 65, 65));
        txtTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTaiKhoan.setLabelText("Tài khoản");

        txtMatKhau.setBackground(new java.awt.Color(65, 65, 65));
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMatKhau.setLabelText("Mật khẩu");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");

        btnDangNhap.setBackground(new java.awt.Color(100, 100, 100));
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnQuenMatKhau.setBackground(new java.awt.Color(100, 100, 100));
        btnQuenMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnQuenMatKhau.setText("Quên mật khẩu");
        btnQuenMatKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuenMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnQuenMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.Button btnDangNhap;
    private com.girlkun.button.Button btnQuenMatKhau;
    private javax.swing.JLabel jLabel1;
    private com.girlkun.textfield.PasswordField txtMatKhau;
    private com.girlkun.textfield.TextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        setupButton();

        txtTaiKhoan.setText("admin");
        txtMatKhau.setText("123");
    }

    private void setupButton() {
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(() -> {
                    login();
                }).start();
            }
        });
        btnQuenMatKhau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.getSlide().slideTo(Start.FORGOTPASSWORD);
            }
        });
    }

    private void login() {
        boolean check = true;
        if (txtTaiKhoan.getText().trim().equals("") || String.valueOf(txtMatKhau.getPassword()).trim().equals("")) {
            check = false;
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", start);
        }
        if (check) {
            TaiKhoan taiKhoan = DAOService.taiKhoan.selectID(txtTaiKhoan.getText());
            if (taiKhoan != null) {
                if (CharUtil.compare(String.valueOf(txtMatKhau.getPassword()), taiKhoan.getMatKhau())
                        && taiKhoan.getTrangThai() == 1) {
                    new Main(taiKhoan).setVisible(true);
                    start.dispose();
                } else {
                    DialogUtil.showAlert("Sai thông tin tài khoản hoặc mật khẩu", start);
                }
            } else {
                DialogUtil.showAlert("Sai thông tin tài khoản hoặc mật khẩu", start);
            }
        }
    }
}
