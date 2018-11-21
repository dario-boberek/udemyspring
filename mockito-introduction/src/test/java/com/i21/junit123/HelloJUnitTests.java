package com.i21.junit123;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class HelloJUnitTests {

	//i21e klasa testowa konczy sie słowem Tests..



	//i21c: junitowe adnotacje na moment wywołania

	private static Logger logger = LoggerFactory.getLogger("OK"); //i21c: need for static logger name

	private static String messageToYoungWoman = "";

	//i21e: java.lang.Exception: Method whateve1() should be static
	//solution: add static here and to logger and to FIELD
	@BeforeClass
	public static void whateve1() { messageToYoungWoman += "You "; }

	@Before
	public void whateve2() { messageToYoungWoman += "have "; }

	@After
	public void whateve3() { messageToYoungWoman += " yyyyYYYyyy "; }

	@AfterClass
	public static void whateve4() { messageToYoungWoman += "nice Pussy! :)";

		logger.info(messageToYoungWoman);
		//out:  01:21:01.381 [main] INFO OK - You have  yyyyYYYyyy have  yyyyYYYyyy have  yyyyYYYyyy have  yyyyYYYyyy nice Pussy! :)
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowError() {

		//arrange
		int[] a3 = null;
		HelloJUnit l = new HelloJUnit();

		//act
		int resultForA3 = l.computeSumFromArray(a3);

		//assert
		//i21c: nie potrzebny, spodziewamy sie błędu.
	}

	public static final long SEED = -1L;

	@Test
	public void computeSumOfArrays() {

		//Arrange
		int[] a1 = new int[]{};
		int[] a2 = new int[0];
		int[] a4 = new int[]{1};
		int[] a5 = new int[]{1,2};
		int[] a6 = new int[1000];
		Arrays.fill(a6, 6);
		HelloJUnit l = new HelloJUnit();

		//Act
		int resultForA1 = l.computeSumFromArray(a1);
		int resultForA2 = l.computeSumFromArray(a2);
		int resultForA4 = l.computeSumFromArray(a4);
		int resultForA5 = l.computeSumFromArray(a5);
		int resultForA6 = l.computeSumFromArray(a6);

		//Assert
		Assert.assertEquals("should be equal", 0, resultForA1);
		Assert.assertEquals("multilineedit.. ", 0, resultForA2);
		Assert.assertEquals("multilineedit.. ", 1, resultForA4);
		Assert.assertEquals("multilineedit.. ", 3, resultForA5);
		Assert.assertEquals("multilineedit.. ", 6000, resultForA6);

	}


	@Test
	public void helloAnnotations() {
		boolean result = getComplexResult();

		//i21c: ALT+Enter podpowie zeby uzyc statycznego importu
		Assert.assertTrue(result);

		Assert.assertEquals("because I do not use HAMCREST it's better to use 3 argument assert and type reason of fail by hand!! ", true, result);
	}

	private boolean getComplexResult() {
		return true;
	}

	//i21c: add maven dependancy
	@Test
	public void testsArePublicVoidMethods() {

	}
}
