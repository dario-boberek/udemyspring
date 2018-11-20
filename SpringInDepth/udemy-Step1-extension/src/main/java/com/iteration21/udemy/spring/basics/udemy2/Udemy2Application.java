package com.iteration21.udemy.spring.basics.udemy2;

import com.iteration21.udemy.spring.NotAccesibleForAutowiring2;
import com.iteration21.udemy.spring.basics.udemy2.inner.InInnerPackage;
import not.com.NotAccessibleForAutowiring1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Udemy2Application {

	public static void main(String[] args) {

		//i21c run zwraca nam handler do kontekstu i dzięki temu mogę wykonywac operacje na springowym srodowisku
		/*
		| bean 1                 |
		|        bean 2          |-----> context.getBean("bean 1")
 		|_bean 3________|

		 */
		ConfigurableApplicationContext context = SpringApplication.run(Udemy2Application.class, args);
		InInnerPackage inInnerPackage = context.getBean(InInnerPackage.class);
		System.out.println(inInnerPackage.message);

		Udemy2Application application = context.getBean(Udemy2Application.class);
		System.out.println(application.inInnerPackage.message);
	}

	//i21c OFF COURSE - dodalem kod ponizej zeby sprawdzic jaki jest zasięg autowire-owania jesli pakiety są różne.



	//mozemy autowire-owac inne komponenty
	@Autowired
	InSameClass inSameClass;

	@Autowired
	InSamePackage inSamePackage;

	@Autowired
	InInnerPackage inInnerPackage;

	//mozemy tworzyc komponennty ktore maja ten sam kontets (nie uzywalem conponennt scannowania ani XML ani przez adnotacje
	@Component
	class InSameClass {
		public final static String messge = "yes Sir it is";
	}

	//could not autowire
	//@Autowired
	NotAccessibleForAutowiring1 notAccessibleForAutowiring1;

	//could not autowire
	//@Autowired
	NotAccesibleForAutowiring2 notAccesibleForAutowiring2;


}

