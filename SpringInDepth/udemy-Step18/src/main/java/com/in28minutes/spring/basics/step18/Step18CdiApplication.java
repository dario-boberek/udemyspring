package com.in28minutes.spring.basics.step18;

		import com.in28minutes.spring.basics.step18.cdi.PaymentProcessor;
		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.ApplicationContext;

		import com.in28minutes.spring.basics.step18.cdi.SomeCdiBusiness;

@SpringBootApplication
public class Step18CdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Step18CdiApplication.class);

	public static void main(String[] args) {
		new Step18CdiApplication().doIt(args);
	}

	public void doIt(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Step18CdiApplication.class, args);

		//i21c: testujemy czy uzywajac ustandaryzowanych adnotacji z java zadziała DEPENDANCY INJECTION.
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());

		//i21c: moje takie tam..
		PaymentProcessor paymentProcessor = applicationContext.getBean(PaymentProcessor.class);
		paymentProcessor.addMoney("1000000", "GBP");

	}
}