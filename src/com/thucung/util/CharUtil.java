package com.thucung.util;

import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Pattern;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class CharUtil {

    private static final Random random = new Random();
    private static final String character = "0123456789abcdefghijklmnopqrstuvxwyzABCDEFGHIJKLMNOPQRSTUVXWYZ";

    public static String getEndCoding(String str) {
        return BCrypt.hashpw(str, BCrypt.gensalt(7));
    }

    public static boolean compare(String originalStr, String endCodingStr) {
        return BCrypt.checkpw(originalStr, endCodingStr);
    }

    public static String getRandomStr(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            int start = random.nextInt(character.length());
            int end = start + 1;
            str += character.substring(start, end);
        }
        return str;
    }

    public static String getAccountFromNameAndID(String name, int id) {
        String account = "";
        name = convertToString(name).toLowerCase();
        String[] splits = name.split(" ");
        account += splits[splits.length - 1];
        if (splits.length > 1) {
            for (int i = 0; i < splits.length - 1; i++) {
                account += splits[i].substring(0, 1);
            }
        }
        account += ("gk" + id);
        return account;
    }

    private static String convertToString(String str) {
        str = str.replaceAll("[đ,Đ]", "d");
        try {
            String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            return pattern.matcher(temp).replaceAll("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String unicodeToLatinh(String str) {
        return convertToString(str).toLowerCase();
    }

    public static String removeChar(String str, String... charRemoves) {
        for (int i = 0; i < charRemoves.length; i++) {
            str = str.replaceAll(charRemoves[i], "");
        }
        return str;
    }
}
