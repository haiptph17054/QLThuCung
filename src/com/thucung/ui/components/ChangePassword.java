package com.thucung.ui.components;

import com.thucung.dao.DAOService;
import com.thucung.main.Start;
import com.thucung.models.TaiKhoan;
import com.thucung.util.DialogUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ChangePassword extends javax.swing.JPanel {
    
    private Start start;
    
    public ChangePassword(Start start) {
        this.start = start;
        initComponents();
        setup();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMatKhau = new com.girlkun.textfield.PasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnXacNhan = new com.girlkun.button.Button();
        btnQuayLai = new com.girlkun.button.Button();
        txtNhapLaiMatKhau = new com.girlkun.textfield.PasswordField();

        setBackground(new java.awt.Color(65, 65, 65));

        txtMatKhau.setBackground(new java.awt.Color(65, 65, 65));
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMatKhau.setLabelText("Mật khẩu mới");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi mật khẩu");

        btnXacNhan.setBackground(new java.awt.Color(100, 100, 100));
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnQuayLai.setBackground(new java.awt.Color(100, 100, 100));
        btnQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setText("Quay lại đăng nhập");
        btnQuayLai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txtNhapLaiMatKhau.setBackground(new java.awt.Color(65, 65, 65));
        txtNhapLaiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLaiMatKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNhapLaiMatKhau.setLabelText("Nhập lại mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNhapLaiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtNhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.button.Button btnQuayLai;
    private com.girlkun.button.Button btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private com.girlkun.textfield.PasswordField txtMatKhau;
    private com.girlkun.textfield.PasswordField txtNhapLaiMatKhau;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        setupButton();
    }
    
    private void setupButton() {
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
                clear();
            }
        });
    }
    
    private void accept() {
        if (String.valueOf(txtMatKhau.getPassword()).trim().equals("")
                || String.valueOf(txtNhapLaiMatKhau.getPassword()).trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập đầy đủ thông tin!", start);
        } else {
            if (String.valueOf(txtMatKhau.getPassword()).trim().length() < 6) {
                DialogUtil.showAlert("Vui lòng nhập mật khẩu ít nhất 6 ký tự!", start);
            } else if (!String.valueOf(
                    txtMatKhau.getPassword()).trim().equals(String.valueOf(txtNhapLaiMatKhau.getPassword()).trim())) {
                DialogUtil.showAlert("Vui lòng nhập đúng mật khẩu xác nhận!", start);
            } else {
                taiKhoan.setMatKhau(String.valueOf(txtMatKhau.getPassword()));
                DAOService.taiKhoan.update(taiKhoan);
                DialogUtil.showSuccessfully("Đổi mật khẩu thành công!", start);
            }
        }
    }
    
    private void clear(){
        txtMatKhau.setText("");
        txtNhapLaiMatKhau.setText("");
        taiKhoan = null;
    }
    
    private TaiKhoan taiKhoan;
}
