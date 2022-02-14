package com.thucung.ui.form;

import com.thucung.other.Scene;
import com.thucung.util.ImageUtil;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class TrangChuForm extends javax.swing.JPanel implements Scene {

    public TrangChuForm() {
        initComponents();
        setup = new Thread(() -> {
            setup();
        });
        setup.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slideshow1 = new com.girlkun.slideshow.Slideshow();
        slideshow4 = new com.girlkun.slideshow.Slideshow();
        slideshow2 = new com.girlkun.slideshow.Slideshow();
        slideshow3 = new com.girlkun.slideshow.Slideshow();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slideshow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideshow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slideshow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slideshow3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(slideshow4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addComponent(slideshow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.girlkun.slideshow.Slideshow slideshow1;
    private com.girlkun.slideshow.Slideshow slideshow2;
    private com.girlkun.slideshow.Slideshow slideshow3;
    private com.girlkun.slideshow.Slideshow slideshow4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setup() {
        this.setOpaque(false);
        initImage();
    }

    private void initImage() {
        try {
            slideshow1.initSlideshow(ImageUtil.getInstance().getBanner("banner1"));
            slideshow2.initSlideshow(ImageUtil.getInstance().getBanner("banner2"));
            slideshow3.initSlideshow(ImageUtil.getInstance().getBanner("banner3"));
            slideshow4.initSlideshow(ImageUtil.getInstance().getBanner("banner4"));
        } catch (Exception e) {
            System.out.println("xxx");
        }
    }
    
    public void stop(){
        slideshow1.stop();
        slideshow2.stop();
        slideshow3.stop();
        slideshow4.stop();
    }
    
    public void start(){
//        slideshow1.start();
//        slideshow2.start();
//        slideshow3.start();
//        slideshow4.start();
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
}
