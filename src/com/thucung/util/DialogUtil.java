package com.thucung.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DialogUtil {

    private static final String TITLE = "Thông báo từ hệ thống";

    public static void showAlert(String text, Component parent) {
        JOptionPane.showMessageDialog(parent, text, TITLE, JOptionPane.YES_OPTION, ImageUtil.getInstance().getIcon("warning"));
    }

    public static void showSuccessfully(String text, Component parent) {
        JOptionPane.showMessageDialog(parent, text, TITLE, JOptionPane.YES_OPTION, ImageUtil.getInstance().getIcon("checked"));
    }

    public static boolean showConfirm(String text, Component parent) {
        return JOptionPane.showConfirmDialog(parent, text, TITLE, JOptionPane.YES_NO_OPTION, 0, ImageUtil.getInstance().getIcon("customer")) == 0;
    }

    public static String showInput(String text, Component parent) {
        return JOptionPane.showInputDialog(parent, text, TITLE, JOptionPane.PLAIN_MESSAGE);
    }
}
