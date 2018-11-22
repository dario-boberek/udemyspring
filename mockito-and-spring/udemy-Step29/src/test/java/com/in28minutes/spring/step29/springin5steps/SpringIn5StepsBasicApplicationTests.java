 package com.in28minutes.spring.step29.springin5steps;

 import org.junit.Test;
 import org.junit.runner.RunWith;
 import org.springframework.test.context.ContextConfiguration;
 import org.springframework.test.context.junit4.SpringRunner;

 @RunWith(SpringRunner.class)
//@SpringBootTest
 //i21e "Neither GenericXmlContextLoader nor AnnotationConfigContextLoader was able to load an ApplicationContext from"
 //i21c: solution: dodac  @ContextConfiguration(locations = {"classpath*:**/testContext.xml"})
 //s: https://stackoverflow.com/questions/17623694/spring-not-autowiring-in-unit-tests-with-junit
 @ContextConfiguration(locations = {"classpath*:**/testContext.xml"})

 //i21c: z step 27, innym sposobem było by wskazanie klasy z kontekstem @Configuration: patrz: com.in28minutes.spring.step29.springin5steps.basic.BinarySearchTest
 public class SpringIn5StepsBasicApplicationTests {

	 @Test
	 public void contextLoads() {
	 }

 }
