package com.iteration21.udemy.spring.basics.udemy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Udemy2Application {

	//i21e pomimo ze ja odpalam apke przez tasty maven zeby poprawnie wykonac faze install potrzebuje wiedizec która to jest klasa główna - bo pakuje do jar'a.
	public static void main(String[] args) {
		SpringApplication.run(Udemy2Application.class, args);
	}

}