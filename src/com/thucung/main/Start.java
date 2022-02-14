package com.thucung.main;

import com.thucung.ui.components.ChangePassword;
import com.thucung.ui.components.Login;
import com.thucung.ui.components.ForgotPassword;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;
import com.girlkun.slideshow.SlideshowNonAuto;
import com.thucung.dao.DAOService;
import com.thucung.jdbc.JDBC;
import com.thucung.ui.components.Welcome;
import com.thucung.util.ImageUtil;
import java.awt.Color;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class Start extends javax.swing.JFrame {

    public static final int WELCOME = 0;
    public static final int LOGIN = 1;
    public static final int ChANGEPASSWORD = 2;
    public static final int FORGOTPASSWORD = 3;

    public Start() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.girlkun.panel.RoundPanel();
        header1 = new com.thucung.ui.components.Header();
        roundPanel2 = new com.girlkun.panel.RoundPanel();
        slideshow = new com.girlkun.slideshow.SlideshowNonAuto();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(100, 100, 100));

        roundPanel2.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slideshow, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideshow, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.thucung.ui.components.Header header1;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    private com.girlkun.slideshow.SlideshowNonAuto slideshow;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        this.setIconImage(ImageUtil.getInstance().getIcon("icon").getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(new Color(0, 0, 0, 0));
        header1.setButton(this);
        initForm();
    }

    private void initForm() {
        welcome = new Welcome(this);
        login = new Login(this);
        changePassword = new ChangePassword(this);
        forgotPassword = new ForgotPassword(this);
        slideshow.initSlideshow(welcome,login, changePassword, forgotPassword);
    }

    public SlideshowNonAuto getSlide() {
        return slideshow;
    }

    public static void main(String args[]) {
        FlatMaterialDarkerContrastIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Thread(() -> {
//                    JDBC.open();
//                    DAOService.open();
//                    ImageUtil.init();
//                }).start();
                new Start().setVisible(true);
            }
        });
    }

    public ChangePassword getChangePassword() {
        return changePassword;
    }

    private Welcome welcome;
    private Login login;
    private ChangePassword changePassword;
    private ForgotPassword forgotPassword;
}
