/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
import controller.*;
import java.sql.*;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author sanug
 */
public class SendEmail {

    public void sendEmail(String to, String subject, String messageBody) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);

 //       Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {

          
          //  protected PasswordAuthentication getPasswordAuthentication() {

             //   return new PasswordAuthentication("kusalperera1199@gmail.com", "mvvwalpxponjjvgw");
            }

        }
        );

        //mipfcwqhdlsprgjf  sanugalakdinu11@gmail.com        / qzvqievheqahjizg
        try {

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress("kusalperera1199@gmail.com"));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject(subject);

            message.setText(messageBody);

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Email has been sent.\n");

        } catch (MessagingException mex) {
            JOptionPane.showMessageDialog(null, mex.getMessage(), "Database Error!", JOptionPane.ERROR_MESSAGE);

}
    }
}
 