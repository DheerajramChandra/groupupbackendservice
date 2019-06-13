package com.groupup.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupup.backend.domain.User;
import com.groupup.backend.service.NotificationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private NotificationService notificationService;

	@RequestMapping("/signup")
	public String signup() {
		return "Please sign up for our service";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "Error";
	}
	@RequestMapping("/signup-success")
	public String signupSuccess() {
		
		User user = new com.groupup.backend.domain.User();
		user.setFirstName("GroupUp");
		user.setLastName("Backend");
		user.setEmailAddress("groupupteststarter@gmail.com");
		
		try {
			notificationService.sendNotification(user);
		}catch(MailException e) {
			// exception
		}
		return "Thank you";
	}
}
