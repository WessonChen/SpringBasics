package com.example.SpringBasics.basics;

import org.springframework.stereotype.Component;

@Component(value = "quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbersToSort) {
        return numbersToSort;
    }
}
