package com.thucung.util;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
import com.thucung.models.MaGiamGia;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {

    public static void guiMaKhoiPhucMatKhau(String to, String code) {
        String subject = "Mã khôi phục tài khoản";
        String message = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "\n"
                + "<head>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <h2 style=\"color: blue;\">SHOP THU CUNG GIRLKUN</h2>\n"
                + "     <h4 style=\"color: orange;\">Ma khoi phuc tai khoan:  " + code + "</h4>\n"
                + "    <h4 style=\"color: orange;\">Vui long khong chia se ma nay cho bat ki ai!</h4>\n"
                + "    <h3 style=\"color: blue;\">Cam on!</h3>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>";
        send(to, subject, message);
    }
    
    public static void guiMaGiamGia(String to, MaGiamGia maGiamGia) {
        String subject = "Chương trình giảm giá";
        String message = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "\n"
                + "<head>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <h2 style=\"color: blue;\">SHOP THU CUNG GIRLKUN</h2>\n"
                + "     <h4 style=\"color: orange;\">Chung toi vua co ma giam gia moi cho khach hang khi mua san pham tai "
                + "shop thu cung GIRLKUN!</h4>"
                + "<h4 style=\"color: orange;\">Ma giam gia la: " + maGiamGia.getMaGiamGia()+
                " voi gia tri "+maGiamGia.getGiaTri()+"%</h4>"
                + "<h4 style=\"color: orange;\">Ma giam gia co gioi han so luong! Nhanh chan toi va mua hang cua chung toi!</h4>"
                + "    <h3 style=\"color: blue;\">Cam on!</h3>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>";
        send(to, subject, message);
    }

    private static void send(String to, String sub, String msg) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", MailConfig.HOST_NAME);
        props.put("mail.smtp.socketFactory.port", MailConfig.SSL_PORT);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.port", MailConfig.SSL_PORT);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailConfig.APP_EMAIL, MailConfig.APP_PASSWORD);
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setContent(msg, "text/html");
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
