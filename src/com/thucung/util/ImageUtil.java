package com.thucung.util;

import com.thucung.notification.NodifyBanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class ImageUtil {

    private static ImageUtil instance;
    private Map<String, ImageIcon> icon;
    private Map<String, NodifyBanner[]> banner;

    private boolean loadedIcon = false;
    private boolean loadedBanner = false;

    public static final String NHANVIEN = "nhanvien";
    public static final String THUCUNG = "thucung";
    public static final String SANPHAM_PHUKIEN = "sanpham_phukien";

    private ImageUtil() {
        loadIcon();
    }

    public static ImageUtil getInstance() {
        if (instance == null) {
            instance = new ImageUtil();
        }
        return instance;
    }

    private void loadIcon() {
        if (!loadedIcon) {
            icon = new HashMap<String, ImageIcon>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File("data/icon.txt")));
                String str = br.readLine();
                int count = Integer.parseInt(str.split(" ")[0]);
                String path = str.split(" ")[1];
                for (int i = 0; i < count; i++) {
                    String string = br.readLine();
                    ImageIcon ic = new ImageIcon(ImageIO.read(new File(path + string + ".png")));
                    icon.put(string, ic);
                }
                br.close();
                loadedIcon = true;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void loadBanner() {
        if (!loadedBanner) {
            banner = new HashMap<String, NodifyBanner[]>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File("data/banner.txt")));
                String str = br.readLine();
                String[] quantityEachBanner = str.split(" ");
                NodifyBanner[] banner1 = new NodifyBanner[Integer.parseInt(quantityEachBanner[0])];
                NodifyBanner[] banner2 = new NodifyBanner[Integer.parseInt(quantityEachBanner[1])];
                NodifyBanner[] banner3 = new NodifyBanner[Integer.parseInt(quantityEachBanner[2])];
                NodifyBanner[] banner4 = new NodifyBanner[Integer.parseInt(quantityEachBanner[3])];

                ImageIcon img = null;
                for (int i = 0; i < banner1.length; i++) {
                    img = new ImageIcon(new URL(br.readLine()));
                    banner1[i] = new NodifyBanner(img);
                }
                for (int i = 0; i < banner2.length; i++) {
                    img = new ImageIcon(new URL(br.readLine()));
                    banner2[i] = new NodifyBanner(img);
                }
                for (int i = 0; i < banner3.length; i++) {
                    img = new ImageIcon(new URL(br.readLine()));
                    banner3[i] = new NodifyBanner(img);
                }
                for (int i = 0; i < banner4.length; i++) {
                    img = new ImageIcon(new URL(br.readLine()));
                    banner4[i] = new NodifyBanner(img);
                }
                banner.put("banner1", banner1);
                banner.put("banner2", banner2);
                banner.put("banner3", banner3);
                banner.put("banner4", banner4);
                br.close();
                loadedBanner = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ImageIcon getIcon(String ic) {
        return icon.get(ic);
    }

    public static void init() {
        if (instance == null) {
            instance = new ImageUtil();
        }
    }
    
    public static void initBanner(){
        if (instance != null) {
            instance.loadBanner();
        }
    }

    public static String copyImage(String originalPath, String name, String type) {
        File folder = new File("data/img/" + type);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String newName = CharUtil.removeChar(CharUtil.unicodeToLatinh(name), " ")
                + CharUtil.removeChar(DateUtil.getTimeNowVN(), ":", " ", "-")
                + originalPath.substring(originalPath.lastIndexOf("."));
        File source = new File(originalPath);
        File dest = new File(folder.getAbsolutePath() + "/" + newName);
        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return (folder.toPath() + "\\" + newName);
    }

    public static ImageIcon getImage(String path, String type) {
        if (!path.equals("")) {
            return new ImageIcon(path);
        } else {
            switch (type) {
                case THUCUNG:
                    return instance.getIcon("defaultpet");
                case SANPHAM_PHUKIEN:
                    return instance.getIcon("defaultproduct");
                default:
                    return instance.getIcon("defaultemployee");
            }
        }
    }

    public NodifyBanner[] getBanner(String bannerName) {
        return banner.get(bannerName);
    }

}
