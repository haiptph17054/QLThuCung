package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.combobox.Combobox;
import com.thucung.other.Scene;
import com.thucung.ui.components.ThongKePanel;
import com.thucung.util.DateUtil;
import com.thucung.util.ImageUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ThongKeFormX extends javax.swing.JPanel implements Scene {

    private IEventControI event;

    public ThongKeFormX() {
        initComponents();
        initEvent();
        setOther();
        initToControl();
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
        lblTitle = new javax.swing.JLabel();
        panelControl = new com.girlkun.panel.RoundPanel();
        body = new com.girlkun.panel.RoundPanel();

        roundPanel1.setBackground(new java.awt.Color(20, 20, 20));

        roundPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thống kê bán hàng");

        panelControl.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void initToControl() {
        addCombobox(MONTH);
        addCombobox(YEAR);
        addButton("", ImageUtil.getInstance().getIcon("accept"), IEventControI.Chose.ACCEPT);
    }

    private void initEvent() {
        event = new IEventControI() {
            @Override
            public void selected(IEventControI.Chose chose) {
                switch (chose) {
                    case ACCEPT:
                        changeThongKe();
                        break;
                }
            }
        };
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
        panelControl.add(button, "height 50");
    }

    private static final int MONTH = 7;
    private static final int YEAR = 5;

    private void addCombobox(int type) {
        Font font = new Font("SansSerif", Font.BOLD, 12);
        Combobox combobox = new Combobox();
        combobox.setFont(font);
        combobox.setForeground(Color.white);
        combobox.setLineChooseColor(new Color(0, 0, 0));
        combobox.setBackground(new Color(0, 0, 0));
        switch (type) {
            case MONTH:
                combobox.setLabeText("Tháng");
                for (int i = 1; i <= 12; i++) {
                    combobox.addItem(i);
                }
                combobox.setSelectedItem(DateUtil.getMonthNow());
                break;
            case YEAR:
                combobox.setLabeText("Năm");
                for (int i = 2000; i <= DateUtil.getYearNow(); i++) {
                    combobox.addItem(i);
                }
                combobox.setSelectedItem(DateUtil.getYearNow());
                break;
        }
        panelControl.add(combobox);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.panel.RoundPanel body;
    private javax.swing.JLabel lblTitle;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private com.girlkun.panel.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        body.setLayout(new BorderLayout());
        setTitle(DateUtil.getMonthNow(), DateUtil.getYearNow());
        addBody(DateUtil.getMonthNow(), DateUtil.getYearNow());
    }

    private void addBody(int thang, int nam) {
        body.removeAll();
        ThongKePanel thongKePanel = new ThongKePanel(thang, nam);
        body.add(thongKePanel);
        body.repaint();
        body.revalidate();
    }

    private void changeThongKe() {
        int thang = Integer.parseInt(String.valueOf(((Combobox) panelControl.getComponent(0)).getSelectedItem()));
        int nam = Integer.parseInt(String.valueOf(((Combobox) panelControl.getComponent(1)).getSelectedItem()));
        addBody(thang, nam);
        setTitle(thang, nam);
    }

    private void setTitle(int thang, int nam) {
        lblTitle.setText("Thống kê bán hàng tháng " + thang + " năm " + nam);
    }

    private void setOther() {
        panelControl.setLayout(new MigLayout("fill,inset 5", "[fill][fill][fill]"));
    }

    @Override
    public void reload() {
        
    }

    @Override
    public void destroy() {
        if (setup != null && setup.isAlive()) {
            setup.stop();
        }
    }

    private Thread setup;
}
