package com.in28minutes.spring.basics.step17;

import com.in28minutes.spring.basics.step17.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Step17 {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {
		new Step17().doIt(args);

	}

	//i21c:  go to BinarySearchImpl
	public void doIt(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(Step17.class, args);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result =
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}