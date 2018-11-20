package com.in28minutes.spring.step23.springin5steps;

import com.in28minutes.spring.step23.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//i21c: zaczelismy od uzywania SpringBoota z adnotcja @SpringBootApplication
//łącznie z takim oto sposobem tworzenia kontekstu:
//		ApplicationContext applicationContext =
//				SpringApplication.run(Step17.class, args);

//i21c:  potem przeszlismy do czystego Springa i zamieniliśmy @SpringBootApplication na @Configuration @ComponentScan
//łącznie z nowym sposobem trzorzenia kontekstu:
// try (AnnotationConfigApplicationContext applicationContext =
//				new AnnotationConfigApplicationContext(
//				SpringIn5StepsBasicApplication.class)) {

//i21c: następnie zdefiniowalismy konfiguracje XMLowa, ZNIKNEŁY adnotacje@Configuration @ComponentScan  (cofamy sie w przeszłosc, old way of definig wireing between beans)
//ale pojawił się następujący kod i nowy plik xml:
//  try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
@Configuration
@ComponentScan
public class XMLContextApplicationStep23 {

	private static Logger LOGGER = LoggerFactory.getLogger(XMLContextApplicationStep23.class);

	public static void main(String[] args) {

		new XMLContextApplicationStep23().doIt();
	}

	public void doIt() {

		//i21e uwaga wziął pierwszy lepszy applicationContext.xml możliwy
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextStep23.xml")) {

			//i21c: dodajemy info o tym jakie klasy zostały załadowane do kontekstu.
			LOGGER.info("i21>   Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

			//i21c: bez component scannowania:
			// [xmlJdbcConnection, xmlPersonDAO]

			//i21c: z component scannowaniem:
			//      [
			//      * ComponentDAOStep23
			//      * scopedTarget.ComponentJdbcConnectionStep23
			//      * ComponentJdbcConnectionStep23
			//      * BinarySearchImplStep23
			//      * BubbleSortAlgorithmStep23
			//      * QuickSortAlgorithmStep23
			//      * SomeCdiBusinessStep23
			//      * SomeCdiDaoStep23
			//      * scopedTarget.JdbcConnectionStep23
			//      * JdbcConnectionStep23
			//      * PersonDAOStep23
					//i21c: dodatkowo pojawiło się kilka beanów któe Spring zam uznał ze potrzebuje:
					//      * org.springframework.context.annotation.internalConfigurationAnnotationProcessor
					//      * org.springframework.context.annotation.internalAutowiredAnnotationProcessor
					//      * org.springframework.context.annotation.internalRequiredAnnotationProcessor
					//      * org.springframework.context.event.internalEventListenerProcessor
					//      * org.springframework.context.event.internalEventListenerFactory
			//      * xmlJdbcConnection
			//      * xmlPersonDAO
			//      ]

			//i21c: bardzo fajnie widac ze IDkiem beana jest nazwa zdefiniowana w adnotacji np: @Component("ComponentDAOStep23")

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		}

	}
}