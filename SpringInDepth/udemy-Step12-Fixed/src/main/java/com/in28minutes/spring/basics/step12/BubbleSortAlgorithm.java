package com.in28minutes.spring.basics.step12;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubububle") //i21c nie musze dawac nazwy tutaj ale jak już daje to moge sobie sam wybrać nazwę
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
