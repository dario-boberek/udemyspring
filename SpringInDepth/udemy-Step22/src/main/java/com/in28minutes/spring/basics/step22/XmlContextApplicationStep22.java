package com.in28minutes.spring.basics.step22;

import com.in28minutes.spring.basics.step22.i21xml.XmlNsaPayloadDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.step22.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class XmlContextApplicationStep22 {

	public static void main(String[] args) {

		//i21c: args not needed with XML verison
		new XmlContextApplicationStep22().doIt();

	}

	public void doIt() {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(personDao);
			System.out.println(personDao.getXmlJdbcConnection());

			//i21c: moje takie tam..
			XmlNsaPayloadDAO payload = applicationContext.getBean(XmlNsaPayloadDAO.class);
			// celowo odpaliłem bez dodania definicji, błąd:
			// Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.in28minutes.spring.basics.step22.i21xml.XmlNsaPayloadBusiness' availabl

			System.out.println(payload.getConnectionStatus());
			System.out.println(payload.getConnectionStatus());
			System.out.println(payload.getConnectionStatus());
			System.out.println(payload.getConnectionStatus());
		}

	}
}