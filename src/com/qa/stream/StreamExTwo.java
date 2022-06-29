package com.qa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExTwo {

	public static void main(String[] args) {

		List<Integer> myIntList = new ArrayList<>();

		myIntList.add(3);
		myIntList.add(4);
		myIntList.add(7);
		myIntList.add(8);
		myIntList.add(12);

		Stream<Integer> myIntStream = myIntList.stream();

//		int product = myIntStream.reduce((num1, num2) -> num1 * num2).get();
//
//		System.out.println(product);

//		int max = myIntStream.max((num1, num2) -> Integer.compare(num1, num2)).get();
//
//		System.out.println(max);

		int min = myIntStream.min((num1, num2) -> Integer.compare(num1, num2)).get();

		System.out.println(min);

	}

}
