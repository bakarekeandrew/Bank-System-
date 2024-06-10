/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.View;

import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author andre
 */
class send_and_generate {
     // Method to generate OTP
    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    // Method to send OTP via email
    public void sendOtp(String recipientEmail, String otp) {
        // Set up email server properties
        String host = "smtp.gmail.com"; // Replace with your SMTP server
        final String user = "bakarekeandrew@gmail.com"; // Replace with your email
        final String password = "pdfq xfwx bytq oyhh"; // Replace with your email password
        //pdfq xfwx bytq oyhh

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587"); // Replace with your SMTP server port
        props.put("mail.smtp.starttls.enable", "true");

        // Get the session object
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        // Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("Your OTP Code");
            message.setText("Your OTP code is: " + otp);

            // Send message
            Transport.send(message);
            System.out.println("OTP from Bank management system sent successfully ");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Method to send password reset confirmation via email
    public void sendPasswordResetConfirmation(String recipientEmail, String newPassword) {
        // Set up email server properties
        String host = "smtp.gmail.com"; // Replace with your SMTP server
        final String user = "bakarekeandrew@gmail.com"; // Replace with your email
        final String password = "pdfq xfwx bytq oyhh"; // Replace with your email password

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587"); // Replace with your SMTP server port
        props.put("mail.smtp.starttls.enable", "true");

        // Get the session object
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        // Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("Password Reset Confirmation");
            message.setText("Your bakarekeandrew@gmail.com account password has been successfully reset. \n Your new password is: " + newPassword);

            // Send message
            Transport.send(message);
            System.out.println("Password reset confirmation sent successfully");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
