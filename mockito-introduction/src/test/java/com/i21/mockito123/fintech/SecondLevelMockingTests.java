package com.i21.mockito123.fintech;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//i21c: uzywamy adnotacji @Mock i @InjectMock :)
// tym razem bez potrzeby uzywania konstruktora ustawiającego field z interfejsem
@RunWith(MockitoJUnitRunner.class)
public class SecondLevelMockingTests {


		@Mock
		BlockchaninDataService bdsMock;
		//i21c:  dzięki temu nie musimy pisac: 	BlockchaninDataService bdsMock = mock(BlockchaninDataService.class);

		@InjectMocks
		TransactionServiceImpl ts;
		//i21c: chcemy być pewni ze mock zostanie wstrzyknięty w TransactionServiceImpl - wystarczy ze uzyjemy @InjectMock a mockito sam poszuka mocka którego moze podstawić


	@Test
	public void niceTest1() {

		//arrange
		Mockito
				.when(
						//i21c: jeśli takie wywołanie będzie...
					bdsMock.getAvailableID()
				)
				.thenReturn(
						//i21c: ... to podrzuc taką odpowiedź zawsze
						new int[]{1}
				);

		//act
		String id = ts.getId();
		//i21c: jak pięknie, nie muszę tez tworzyc instancji ts'a zeby kod zadziałał...

		//assert
		Assert.assertEquals("[1]", id);

	}

	@Test
	public void test2() {

		//arrange
		Mockito.when(bdsMock.getAvailableID()).thenReturn(new int[]{1,2});

		//act
		String id = ts.getId();

		//assert
		Assert.assertEquals("[1][2]", id);
	}

}
