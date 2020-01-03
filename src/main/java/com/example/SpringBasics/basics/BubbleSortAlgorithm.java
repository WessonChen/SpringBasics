package com.example.SpringBasics.basics;

import org.springframework.stereotype.Component;

@Component(value = "bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbersToSort) {
        return numbersToSort;
    }
}
