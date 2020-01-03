package com.example.SpringBasics.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearchImpl(@Qualifier("bubble") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortedNumbers);
        return numbersToSearchFor;
    }
}
