/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax. activation.DataHandler;
import javax.activation.DataSource;

/**
 *
 * @author CongThanh
 */
public class Email {

    final String from = "thanhtcde170537@fpt.edu.vn";
//    final String password = "drnm rlnh sbzp dffq";
    final String password = "fkqb gshd lmto airv";

    public boolean sendEmail(String to, String content, String subject) {

        //Properties : khai bao cac thuoc tinh
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587 SSL 465

        props.put("mail.smtp.auth", true); // dang nhap vao de sent
        props.put("mail.smtp.starttls.enable", true); //

        //create Authenticator dang nhap vap gm
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };

        // Phien lam viec
        Session session = Session.getInstance(props, auth);

        // Tao tn   
        MimeMessage msg = new MimeMessage(session);

        try {
            // Kieu noi dung
            msg.addHeader("Content-type", "text/HTML; charset = UTF-8");

            // Nguoi gui
            msg.setFrom(from);
            // Nguoi nhan
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));

            // Tieu de email
            msg.setSubject(subject);
            //Quy dinh ngay gui
            msg.setSentDate(new Date());

            // Quy định email nhận phản hồi
            // msg.setReplyTo(InternetAddress.parse(from, false))
            //Noi dung
//            msg.setText("Day la phan noi dung", "UTF-8");
            msg.setContent(content, "text/HTML; charset = UTF-8");
            // Gui email
            Transport.send(msg);
            System.out.println("Send success!");
            return true;
        } catch (MessagingException e) {
            System.out.println(e);
            System.out.println("Send fail!");
            return false;
        }
    }

    public static void main(String[] args) {
        Email email = new Email();
        email.sendEmail("thnguyen1928@gmail.com", "co cai db ?", "Nguyen co dep chai k?");
    }
}
