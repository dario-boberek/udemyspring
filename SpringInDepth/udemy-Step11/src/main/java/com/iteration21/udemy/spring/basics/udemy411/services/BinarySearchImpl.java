package com.iteration21.udemy.spring.basics.udemy411.services;

import com.iteration21.udemy.spring.basics.udemy411.sorting.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//i21c define what is a bean..
@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

    	//v49 gdybysmy nie mieli property sortAlgorithm tylko tworzyli instancje SortAlgorithm tutaj to bysmy mieli
	    // w tej wersji kodu jeszcze nie bylo adnotacji springowych..

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }


}