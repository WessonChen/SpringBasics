package com.example.SpringBasics;

import org.springframework.stereotype.Component;

@Component(value = "quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbersToSort) {
        return numbersToSort;
    }
}
