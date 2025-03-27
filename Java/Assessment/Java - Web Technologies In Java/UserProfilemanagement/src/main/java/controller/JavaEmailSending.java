package controller;

import java.util.Properties;
import java.util.Random;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class JavaEmailSending {

	public static String EmailOtp(String email) {

		String otp = otpGenrate();

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("kets1727@gmail.com", "wics znwq vbkx zscj");
			}

		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("Your OTP Code");
			message.setText("Your OTP code is: " + otp);
			Transport.send(message);
			System.out.println("OTP sent to " + email);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return otp;

	}

	public static String otpGenrate() {
		StringBuilder otp = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			otp.append(random.nextInt(10));
		}
		return otp.toString();

	}

}
