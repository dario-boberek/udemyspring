package com.iteration21.udemy.spring.basics.udemy411;

import com.iteration21.udemy.spring.basics.udemy411.services.BinarySearchImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//i21c springboot will automatically scan this package and sub-packages.
@SpringBootApplication
public class Udemy411Application {

	@Autowired
	BinarySearchImpl binarySearch;

	public static void main(String[] args) {


		//i21c spring will manage beans in its spring application context...
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Udemy411Application.class, args);

		//i21c get bean..
		BinarySearchImpl binarySearch = configurableApplicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);

		System.out.println(result);

	}

}
