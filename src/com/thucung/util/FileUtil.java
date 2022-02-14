package com.thucung.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class FileUtil {

    public static final String ACCOUNT = "data/filedata/account.txt";

    public static void printData(String filePath, String data, boolean append) {
        FileWriter fw = null;
        try {
            if (filePath.lastIndexOf("/") != -1) {
                File file = new File(filePath.substring(0, filePath.lastIndexOf("/")));
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (filePath.lastIndexOf("\\") != -1) {
                File file = new File(filePath.substring(0, filePath.lastIndexOf("\\")));
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            fw = new FileWriter(new File(filePath), append);
            fw.write("\n" + data);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
