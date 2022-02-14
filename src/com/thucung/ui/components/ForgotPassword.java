package com.thucung.ui.components;

import com.thucung.dao.DAOService;
import com.thucung.main.Start;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.util.CharUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.EmailUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ForgotPassword extends javax.swing.JPanel {

    private Start start;

    public ForgotPassword(Start start) {
        this.start = start;
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new com.girlkun.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnXacNhan = new com.girlkun.button.Button();
        btnQuayLai = new com.girlkun.button.Button();
        btnGuiMa = new com.girlkun.button.Button();
        txtMaXacNhan = new com.girlkun.textfield.TextField();

        setBackground(new java.awt.Color(65, 65, 65));

        txtEmail.setBackground(new java.awt.Color(65, 65, 65));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtEmail.setLabelText("Email");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quên mật khẩu");

        btnXacNhan.setBackground(new java.awt.Color(100, 100, 100));
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnQuayLai.setBackground(new java.awt.Color(100, 100, 100));
        btnQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setText("Quay lại đăng nhập");
        btnQuayLai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnGuiMa.setBackground(new java.awt.Color(100, 100, 100));
        btnGuiMa.setForeground(new java.awt.Color(255, 255, 255));
        btnGuiMa.setText("Gửi mã");
        btnGuiMa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txtMaXacNhan.setBackground(new java.awt.Color(65, 65, 65));
        txtMaXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        txtMaXacNhan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMaXacNhan.setLabelText("Mã xác nhận");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(txtMaXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.Button btnGuiMa;
    private com.girlkun.button.Button btnQuayLai;
    private com.girlkun.button.Button btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private com.girlkun.textfield.TextField txtEmail;
    private com.girlkun.textfield.TextField txtMaXacNhan;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        setupButton();
    }

    private void setupButton() {
        btnGuiMa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sendCode();
            }
        });
        btnXacNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accept();
            }
        });
        btnQuayLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.getSlide().slideTo(Start.LOGIN);
            }
        });
    }

    private void sendCode() {
        if (checkAllInput()) {
            new Thread(() -> {
                email = txtEmail.getText();
                code = CharUtil.getRandomStr(6);
                EmailUtil.guiMaKhoiPhucMatKhau(email, code);
                DialogUtil.showSuccessfully("Đã gửi mã xác nhận!\nVui lòng kiểm tra email!", start);
                sent = true;
            }).start();
        }
    }
    
    private boolean checkAllInput(){
        if (txtEmail.getText().trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập email khôi phục!", start);
            return false;
        }
        if (!txtEmail.getText().trim().matches("\\w+@\\w+(\\.\\w+){1,2}")) {
            DialogUtil.showAlert("Vui lòng nhập đúng email!", start);
            return false;
        }
        return true;
    }

    private void accept() {
        if (sent) {
            if (txtMaXacNhan.getText().equals(code)) {
                NhanVien nhanVien = DAOService.nhanVien.selectByEmail(email);
                TaiKhoan taiKhoan = DAOService.taiKhoan.selectByIDNhanVien(nhanVien.getIdNhanVien());
                start.getChangePassword().setTaiKhoan(taiKhoan);
                start.getSlide().slideTo(Start.ChANGEPASSWORD);
                clear();
            } else {
                DialogUtil.showAlert("Mã xác nhận không chính xác!", start);
            }
        }
    }
    
    private void clear(){
        code = null;
        sent = false;
        email = null;
        txtEmail.setText("");
        txtMaXacNhan.setText("");
    }

    private String code;
    private boolean sent = false;
    private String email;
}
