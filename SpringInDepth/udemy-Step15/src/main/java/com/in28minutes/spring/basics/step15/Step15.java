package com.in28minutes.spring.basics.step15;

import com.in28minutes.spring.basics.step15.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Step15 {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(Step15.class);
	//i21c: z org.slf4j wiec mozemy uzywac "{}"
	
	public static void main(String[] args) {

		new Step15().doIt(args);

	}

	public void doIt(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(Step15.class, args);

		PersonDAO personDao =
				applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 =
				applicationContext.getBean(PersonDAO.class);

		LOGGER.info("> {}", personDao);
		LOGGER.info("> {}", personDao.getJdbcConnection());

		//i21c: uwaga kazde wywołanie poworuje ze autowireowane proxy zwraca nową innstancje JdbcConnection
		LOGGER.info("> {}", personDao.getJdbcConnection());  //i21c: inne ID...
		LOGGER.info("> {}", personDao.getJdbcConnection());  //i21c: inne ID...
		LOGGER.info("> {}", personDao.getJdbcConnection());  //i21c: inne ID...

		//i21c: Spring singleton to nie to samo co GOF Singleton - w GOF mamy jedną instancje per JVM. w Spring mamy jedną instancje per applicationContext (mozemy miec kilka AC w 1 JVM)

		LOGGER.info("> {}", personDao2);
		LOGGER.info("> {}", personDao.getJdbcConnection());
	}
}