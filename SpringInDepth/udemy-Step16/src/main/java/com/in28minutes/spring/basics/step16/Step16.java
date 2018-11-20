package com.in28minutes.spring.basics.step16;

import com.in28minutes.spring.basics.i21.raz.SomeOtherDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;



@SpringBootApplication
@ComponentScan(
		{
				"com.in28minutes.spring.basics.componentscan",
				"com.in28minutes.spring.basics.i21.raz", //i21c: dodałem wymagane sciezki gdzie spring ma szukac komponentu
				"com.in28minutes.spring.basics.i21.dwa",
				"com.in28minutes.spring.basics.i21.trzy"
		})
//i21c:  wywolalismy błąd jak nie było zdefiniowanego poprawnie component scanna
// No qualifying bean of type 'com.in28minutes.spring.basics.i21raz.SomeOtherDAO' available
public class Step16 {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(Step16.class);
	
	public static void main(String[] args) {

		new Step16().doIt(args);
		
	}


	public void doIt(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(Step16.class, args);

		ComponentDAO componentDAO =
				applicationContext.getBean(ComponentDAO.class);

		//i21c: dodajemy component scann na rózn lokalizacje(powyzej definicja @ComponentScan)
		SomeOtherDAO raz = applicationContext.getBean(SomeOtherDAO.class);
		com.in28minutes.spring.basics.i21.dwa.SomeOtherDAO dwa = applicationContext.getBean(com.in28minutes.spring.basics.i21.dwa.SomeOtherDAO.class);
		com.in28minutes.spring.basics.i21.trzy.SomeOtherDAO trzy = applicationContext.getBean(com.in28minutes.spring.basics.i21.trzy.SomeOtherDAO.class);

		LOGGER.info("{}", componentDAO);

	}
}