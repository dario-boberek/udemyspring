package com.i21.mockito123.fintech;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FirstLevelMockingTests {

	@Test
	public void test1() {

		//arrange
		//i21c: definiuje mocka
		BlockchaninDataService bdsMock = mock(BlockchaninDataService.class);

		//i21c: wgrywamy zachowanie mocka
		Mockito
				.when(
						bdsMock.getAvailableID()
				)
				.thenReturn(
						new int[]{1}
				);

		TransactionServiceImpl ts = new TransactionServiceImpl(bdsMock);

		//act
		String id = ts.getId();

		//assert
		Assert.assertEquals("[1]", id);

	}

	//i21c: to samo tylko ze statycznymi importami +skondensowany when-thenReturn
	@Test
	public void test2() {

		//Arrange
		BlockchaninDataService bdsMock = mock(BlockchaninDataService.class);
		when(bdsMock.getAvailableID()).thenReturn(new int[]{1,2});
		TransactionServiceImpl ts = new TransactionServiceImpl(bdsMock);

		//act
		String id = ts.getId();

		//assert
		assertEquals("[1][2]", id);
	}
}
