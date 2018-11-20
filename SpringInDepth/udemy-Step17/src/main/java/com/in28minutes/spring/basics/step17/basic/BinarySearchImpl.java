package com.in28minutes.spring.basics.step17.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BinarySearchImplStep17")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	@Qualifier("bubbleStep17")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

	//i21c: tutaj dodalismy 2 funckcje zeby pokazac ze framework je automatycznie wykona
	//i21c: homework: podebugowac w trybie debugu (logging.level.org.springframework=debug)
		//sublime > Ctrl+K > Ctrl+S > "BinarySearchImpl" .. analyze
	@PostConstruct
	public void postConstruct() {
		logger.info("i21> postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("i21> preDestroy");
	}

}
