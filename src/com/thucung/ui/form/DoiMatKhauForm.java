package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.thucung.dao.DAOService;
import com.thucung.main.Main;
import com.thucung.models.NhanVien;
import com.thucung.models.TaiKhoan;
import com.thucung.other.Scene;
import com.thucung.util.CharUtil;
import com.thucung.util.DateUtil;
import com.thucung.util.DialogUtil;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DoiMatKhauForm extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public DoiMatKhauForm(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
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
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        panelControl = new com.girlkun.panel.RoundPanel();
        txtMatKhau = new com.girlkun.textfield.PasswordField();
        txtMatKhauMoi = new com.girlkun.textfield.PasswordField();
        txtMatKhauNhapLai = new com.girlkun.textfield.PasswordField();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        roundPanel2.setBackground(new java.awt.Color(65, 65, 65));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi mật khẩu");

        panelControl.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        txtMatKhau.setBackground(new java.awt.Color(65, 65, 65));
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMatKhau.setLabelText("Mật khẩu cũ");

        txtMatKhauMoi.setBackground(new java.awt.Color(65, 65, 65));
        txtMatKhauMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauMoi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMatKhauMoi.setLabelText("Mật khẩu mới");

        txtMatKhauNhapLai.setBackground(new java.awt.Color(65, 65, 65));
        txtMatKhauNhapLai.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauNhapLai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtMatKhauNhapLai.setLabelText("Nhập lại mật khẩu");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatKhauNhapLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtMatKhauNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(376, 376, 376))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    case ACCEPT:
                        accept();
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Xác nhận", ImageUtil.getInstance().getIcon("accept"), IEventControI.Chose.ACCEPT);
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
        panelControl.add(button, "height 0:0:200");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private com.girlkun.textfield.PasswordField txtMatKhau;
    private com.girlkun.textfield.PasswordField txtMatKhauMoi;
    private com.girlkun.textfield.PasswordField txtMatKhauNhapLai;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill, inset 40 150 40 150", "[fill]", "[fill]"));
    }

    private void accept() {
        if (checkAllInput()) {
            taiKhoan.setMatKhau(String.valueOf(txtMatKhauMoi.getPassword()));
            DAOService.taiKhoan.update(taiKhoan);
            DialogUtil.showSuccessfully("Đổi mật khẩu thành công!", this);
        }
    }

    private boolean checkAllInput() {
        if (String.valueOf(txtMatKhau.getPassword()).trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập mật khẩu cũ!", this);
            txtMatKhau.requestFocus();
            return false;
        } else if (String.valueOf(txtMatKhauMoi.getPassword()).trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập mật khẩu mới!", this);
            txtMatKhauMoi.requestFocus();
            return false;
        } else if (String.valueOf(txtMatKhauNhapLai.getPassword()).trim().equals("")) {
            DialogUtil.showAlert("Vui lòng nhập mật khẩu xác nhận!", this);
            txtMatKhauNhapLai.requestFocus();
            return false;
        } else {
            if (!CharUtil.compare(String.valueOf(txtMatKhau.getPassword()).trim(), taiKhoan.getMatKhau())) {
                DialogUtil.showAlert("Vui lòng nhập đúng mật khẩu cũ!", this);
                txtMatKhau.requestFocus();
                return false;
            } else if (String.valueOf(txtMatKhauMoi.getPassword()).trim().length() < 6) {
                DialogUtil.showAlert("Vui lòng nhập mật khẩu ít nhất 6 ký tự!", this);
                txtMatKhauMoi.requestFocus();
                return false;
            } else if (!String.valueOf(txtMatKhauMoi.getPassword()).equals(String.valueOf(txtMatKhauNhapLai.getPassword()))) {
                DialogUtil.showAlert("Vui lòng xác nhận đúng mật khẩu!", this);
                txtMatKhauNhapLai.requestFocus();
                return false;
            } else {
                return true;
            }
        }
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
    private TaiKhoan taiKhoan;
}
