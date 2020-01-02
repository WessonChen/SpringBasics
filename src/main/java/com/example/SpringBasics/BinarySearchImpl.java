package com.example.SpringBasics;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        for (int number : sortedNumbers){
            System.out.println(number);
        }
        return numbersToSearchFor;
    }
}
