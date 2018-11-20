package com.iteration21.udemy.spring.version3withspring;

import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BubbleSortAlghoritmV3 implements SortingAlgorithm<List<String>>{

    @Override
    public void sort(List<String> in) {
        //NEVER TO DO
        //complex algoritm and update by reference.
        in.add("sorted..");
    }
}
