package com.thucung.ui.form;

import com.girlkun.button.Button;
import com.girlkun.scrollbar.ScrollBarCustom;
import com.thucung.util.ImageUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import com.thucung.event.IEventControI;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class FF extends javax.swing.JPanel {

    private IEventControI event;

    public FF() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        roundPanel1 = new com.girlkun.panel.RoundPanel();
        panelInfo = new com.girlkun.panel.RoundPanel();
        scrollInfo = new javax.swing.JScrollPane();
        info = new javax.swing.JPanel();
        image = new com.girlkun.panel.PictureBox();
        panelFilter = new com.girlkun.panel.RoundPanel();
        panelList = new com.girlkun.panel.RoundPanel();
        panelControl = new com.girlkun.panel.RoundPanel();

        roundPanel1.setBackground(new java.awt.Color(65, 65, 65));

        panelInfo.setBackground(new java.awt.Color(65, 65, 65));

        scrollInfo.setBackground(new java.awt.Color(65, 65, 65));
        scrollInfo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 531, Short.MAX_VALUE))
        );

        scrollInfo.setViewportView(info);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrollInfo)
                .addGap(5, 5, 5))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scrollInfo)
                .addGap(5, 5, 5))
        );

        panelFilter.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout panelFilterLayout = new javax.swing.GroupLayout(panelFilter);
        panelFilter.setLayout(panelFilterLayout);
        panelFilterLayout.setHorizontalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        panelFilterLayout.setVerticalGroup(
            panelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelList.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        panelControl.setBackground(new java.awt.Color(255, 51, 204));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(panelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    case ADD:
                        
                        break;
                }
            }
        };
    }

    private void initButton() {
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
        addButton("Thêm", ImageUtil.getInstance().getIcon("instagram-post"), IEventControI.Chose.ADD);
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
        panelControl.add(button);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.girlkun.panel.PictureBox image;
    private javax.swing.JPanel info;
    private com.girlkun.panel.RoundPanel panelControl;
    private com.girlkun.panel.RoundPanel panelFilter;
    private com.girlkun.panel.RoundPanel panelInfo;
    private com.girlkun.panel.RoundPanel panelList;
    private com.girlkun.panel.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollInfo;
    // End of variables declaration//GEN-END:variables

    public void setup() {
        this.setOpaque(false);
        ScrollBarCustom sbc = new ScrollBarCustom();
        sbc.setForeground(Color.BLACK);
        scrollInfo.setVerticalScrollBar(sbc);
        panelControl.setLayout(new MigLayout("fill, wrap, inset 10", "[fill]10[fill]10[fill]10[fill]", "[fill]10[fill]"));
        image.setImage(ImageUtil.getInstance().getIcon("defaultpet"));
        initEvent();
        initButton();
    }
}
