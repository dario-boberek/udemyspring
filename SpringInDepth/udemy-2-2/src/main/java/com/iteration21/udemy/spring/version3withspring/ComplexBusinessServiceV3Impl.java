package com.iteration21.udemy.spring.version3withspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComplexBusinessServiceV3Impl implements ComplexBusinessServiceV3 {

    @Autowired
    private BubbleSortAlghoritmV3 sortingAlgorithm;

    @Override
    public void executeCommand(List<String> list) {
        sortingAlgorithm.sort(list);
    }
}
