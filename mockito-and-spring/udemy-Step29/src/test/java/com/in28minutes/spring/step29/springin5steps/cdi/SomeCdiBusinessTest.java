package com.in28minutes.spring.step29.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import com.in28minutes.spring.step29.springin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.step29.springin5steps.cdi.SomeCdiDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //i21c: potrzebujemy taki runner
public class SomeCdiBusinessTest {

	// Inject Mock
	@InjectMocks  //i21c: wstrzykujemy mocka w taki obiekt
	SomeCdiBusiness business;

	// Create Mock
	@Mock   //i21c: dzięki tej adnotacji mozemy zdefiniowac co będzie naszym mockiem
	SomeCdiDao daoMock;

	//i21c: try testy gdzie mockujemy odpowiedz z tego samego daoMocka
	//i21c: dzieki mockioto nie jestesmy juz zalezni od tego co getData() zwraca w prawdziwej aplikacji to my definiujemu co będzie zwracane.
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 }); //i21c:  definiujemy zachowanie mocka.
		assertEquals(4, business.findGreatest());
	}

	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2,2});
		assertEquals(2, business.findGreatest());
	}

}
