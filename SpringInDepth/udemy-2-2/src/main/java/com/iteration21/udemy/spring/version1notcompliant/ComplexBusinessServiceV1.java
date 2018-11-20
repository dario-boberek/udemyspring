package com.iteration21.udemy.spring.version1notcompliant;

public class ComplexBusinessServiceV1 {

    //i21c direct instantiations, error: what if we like to use another sorting alhhoritm? -> new dirct instantiation -> TIHGT coupling
    //i21c good code considered have loose coupling
    SortingAlgorithmV1 sortingAlgorithm = new BubbleSortAlghoritmV1();
}
