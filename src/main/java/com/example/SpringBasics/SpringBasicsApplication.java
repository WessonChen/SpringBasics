package com.example.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicsApplication.class, args);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {1, 2, 3}, 0);
		System.out.println(result);
	}
}
