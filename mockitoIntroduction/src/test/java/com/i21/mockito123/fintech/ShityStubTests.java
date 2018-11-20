package com.i21.mockito123.fintech;

import org.junit.Assert;
import org.junit.Test;

//i21e: jak NIE pisać testów, nie uzywamy stóbów bo mozna sie pociąć.
//i21e liczba instanic stubów rośnie w potwornym tempie
public class ShityStubTests {

	@Test
	public void check1digitId() {

		//arrange
		BlockchaninDataService bdsImpl1 = 	new BlockchainDataServiceStub1();
		TransactionServiceImpl ts = new TransactionServiceImpl(bdsImpl1);

		//act
		String id = ts.getId();

		//assert
		Assert.assertEquals("[1]", id);

	}


	@Test
	public void check2digitsId() {

		//arrange
		BlockchaninDataService bdsImpl2 = 	new BlockchainDataServiceStub2();
		TransactionServiceImpl ts = new TransactionServiceImpl(bdsImpl2);

		//act
		String id = ts.getId();

		//assert
		Assert.assertEquals("[1][2]", id);
	}


	@Test
	public void check3digitsId() {

		//arrange
		BlockchaninDataService bdsImpl3 = 	new BlockchainDataServiceStub3();
		TransactionServiceImpl ts = new TransactionServiceImpl(bdsImpl3);

		//act
		String id = ts.getId();

		//assert
		Assert.assertEquals("[1][2][3]", id);
	}


}
