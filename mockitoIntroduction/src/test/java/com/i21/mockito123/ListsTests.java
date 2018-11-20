package com.i21.mockito123;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class ListsTests {

	@Test
	public void testFakeResponseToGenericParameter() {

		List listMock = Mockito.mock(List.class);

		Mockito
				.when(
						listMock.get(Mockito.anyInt())  //i21c: tutaj jest róznica..
				)
				.thenReturn(
						"[1][2][3][4][5][6][7][8][9]" //i21c: zawsze zwracaj tą samą odpowiedź
				);

		String result1 = (String)listMock.get(0);
		String result2 = (String)listMock.get(SPECIFIC_INDEX);

		Assert.assertEquals("[1][2][3][4][5][6][7][8][9]", result1);
		Assert.assertEquals("[1][2][3][4][5][6][7][8][9]", result2);

	}

	private static final int SPECIFIC_INDEX=666;

	@Test
	public void testFakeResponseToSpecificParameter() {

		List listMock = Mockito.mock(List.class);

		Mockito
				.when(
						listMock.get(SPECIFIC_INDEX)
				)
				.thenReturn(
						"[1][2][3][4][5][6][7][8][9]"
				);

		String result1 = (String)listMock.get(0);
		String result2 = (String)listMock.get(SPECIFIC_INDEX);

		Assert.assertEquals(null, result1);
		Assert.assertEquals("[1][2][3][4][5][6][7][8][9]", result2);
	}

	@Test
	public void testFakeSizes() {

		List listMock = Mockito.mock(List.class);

		Mockito
				.when(
						listMock.size()
				)
				.thenReturn(1)
				.thenReturn(2)
				.thenReturn(3);

		Assert.assertEquals(1, listMock.size());
		Assert.assertEquals(2, listMock.size());
		Assert.assertEquals(3, listMock.size());

	}

	@Test
	public void testFakeSize() {

		List listMock = Mockito.mock(List.class);

		Mockito
				.when(
					listMock.size()
				)
				.thenReturn(
					1
				);

		Assert.assertEquals(1, listMock.size());

	}
}
