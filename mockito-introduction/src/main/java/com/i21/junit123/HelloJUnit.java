package com.i21.junit123;

import java.util.Arrays;

public class HelloJUnit {

	public int computeSumFromArray(int[] array)  {
		if(array!=null)
			return Arrays.stream(array).sum();
		else
				throw new RuntimeException("i21> problem");
	}

	//i21c: RELEASE:repackage failed: Unable to find main class
	//solution: add main class!
	public static void main(String[] args) {

	}
}
