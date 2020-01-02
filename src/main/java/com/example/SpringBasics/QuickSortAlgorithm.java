package com.example.SpringBasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbersToSort) {
        return numbersToSort;
    }
}
