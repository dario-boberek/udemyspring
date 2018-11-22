package com.in28minutes.spring.step29.springin5steps.basic;

import com.in28minutes.spring.step29.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//i21c:  przykład na uzycie springa w testach..


//Load the context
@RunWith(SpringRunner.class)

//i21c: poniewaz uzywmy adnotacji to wciaz musimy wskazac klase konfiguracyjną która ma w sobie adnotacje @Configuration
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	@Test
	public void ifThisIsWorkingItMeansContextLoadsFine() {
		//i21c: pierwszy krok: napiac pusty tets zeby sie upewnić ze contetx wstał.
	}

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {

		// call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[]{}, 5);

		// check if the value is correct
		assertEquals(3, actualResult);

	}

}
