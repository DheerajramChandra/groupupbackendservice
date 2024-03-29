package com.groupup.backend.groupupbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SendingEmailVerification {

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailVerification.class, args);
	}
}
