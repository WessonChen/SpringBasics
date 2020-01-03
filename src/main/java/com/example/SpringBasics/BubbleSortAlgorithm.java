package com.example.SpringBasics;

import org.springframework.stereotype.Component;

@Component(value = "bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbersToSort) {
        return numbersToSort;
    }
}
