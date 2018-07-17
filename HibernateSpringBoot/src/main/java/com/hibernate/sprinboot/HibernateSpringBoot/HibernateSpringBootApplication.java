package com.hibernate.sprinboot.HibernateSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringBootApplication.class, args);
		System.out.println("Application started....");
	}
}