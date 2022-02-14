package com.thucung.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class DateUtil {

    private static final SimpleDateFormat fmDateVN = new SimpleDateFormat("dd-MM-yyyy");
    private static final SimpleDateFormat fmDateUS = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat fmTimeVN = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    private static final SimpleDateFormat fmTimeUS = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    private static final SimpleDateFormat day = new SimpleDateFormat("dd");
    private static final SimpleDateFormat month = new SimpleDateFormat("MM");
    private static final SimpleDateFormat year = new SimpleDateFormat("yyyy");

    public static int getDayNow() {
        return Integer.parseInt(day.format(new Date()));
    }

    public static int getMonthNow() {
        return Integer.parseInt(month.format(new Date()));
    }

    public static int getYearNow() {
        return Integer.parseInt(year.format(new Date()));
    }

    public static String changeDateVNtoUS(String date) {
        try {
            Date d = fmDateVN.parse(date);
            date = fmDateUS.format(d);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String changeDateUStoVN(String date) {
        try {
            Date d = fmDateUS.parse(date);
            date = fmDateVN.format(d);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String changeTimeVNtoUS(String date) {
        try {
            Date d = fmTimeVN.parse(date);
            date = fmTimeUS.format(d);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String changeTimeUStoVN(String date) {
        try {
            Date d = fmTimeUS.parse(date);
            date = fmTimeVN.format(d);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String getTimeNowVN() {
        Date date = new Date();
        return fmTimeVN.format(date);
    }

    public static String getTimeNowUS() {
        Date date = new Date();
        return fmTimeUS.format(date);
    }

    public static String getDateNowVN() {
        Date date = new Date();
        return fmDateVN.format(date);
    }

    public static String getDateNowUS() {
        Date date = new Date();
        return fmDateUS.format(date);
    }
}
