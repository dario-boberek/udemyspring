package com.in28minutes.spring.step19.springin5steps;

import com.in28minutes.spring.step19.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Step19BasicApplication {

	public static void main(String[] args) {

		//i21c: args not needed wit Pure Spring 5 approach.
		new Step19BasicApplication().doIt();

	}

	public void doIt() {
		//i21c:  ACAC implementuje autocloseable - feature javy SE 7
		// s: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/AnnotationConfigApplicationContext.html
		// dzięki temu nie musimy pisac applicationContext.close()
		// i dzięki temu mozemy zastosować formułe try() {...} co daje nam pewnosc ze nawet jesli będzie exception w "..." to applicationContext.close() i tak zostanie wywołana na końcu

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Step19BasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
			System.out.println(result);

		}
	}
}