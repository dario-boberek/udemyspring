package com.iteration21.udemy.spring.basics.udemy2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * spring boot example in this generated module (udemy2)
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Udemy2ApplicationTests {

	@Autowired
	Udemy2Application udemy2Application;

	@Test
	public void contextLoads() {
	}

	//i21c extension:
	@Test
	public void isMyBeanSetup() {
		assertThat(udemy2Application, is(not(nullValue())));
		assertThat(udemy2Application.inSameClass.messge, equalTo( "yes Sir it is"));
		assertThat(udemy2Application.inSamePackage, is(not(nullValue())));
		assertThat(udemy2Application.inInnerPackage.message, equalTo( "clearly"));
	}
}
