package com.example.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {1, 2, 3}, 0);
		System.out.println(result);

		//SpringApplication.run(SpringBasicsApplication.class, args);
	}
}
