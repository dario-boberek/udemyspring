package com.iteration21.udemy.spring.basics.udemy411;

import com.iteration21.udemy.spring.basics.udemy411.services.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Udemy411ApplicationTests {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void runAppTest() {
		int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
		assertThat(result, is(3));

	}

	@Test
	public void contextLoads() {

		//i21c schemat aplikacji C:\Users\Darius\Dropbox\Screenshots\2018-10-15 19_26_27-Window.png

		//i21c przyklad na TIGHT COUPLING
		//w pierwszej wersji nie bylo pola w klasie z interfejsem tylko bylo bezposrednio odwolanie do BubbleSortAlgoritm
		//BinarySearchImpl.binarySearch(

	}

}
