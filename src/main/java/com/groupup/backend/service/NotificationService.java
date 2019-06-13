package com.groupup.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.groupup.backend.domain.User;


@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	
	
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(User user) throws MailException {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setFrom("groupupteststarter@gmail.com");
		mail.setSubject("This is to check the email service");
		mail.setText("This email service works");
		
		javaMailSender.send(mail);
		
	}
}
