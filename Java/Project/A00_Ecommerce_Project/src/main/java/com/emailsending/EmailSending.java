package com.emailsending;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailSending {

	public static void send(String recipient, String subject, String messageText) {
		final String senderEmail = "kets1727@gmail.com"; // Replace with your email
		final String senderPassword = "jsnn szim lzgd knnv"; // Use an App Password if using Gmail

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, senderPassword);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(senderEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(messageText);

			Transport.send(message);
			System.out.println("Email Sent Successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println(" Email Sending Failed: " + e.getMessage());
		}
	}
}
