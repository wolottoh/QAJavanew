package com.qa.exercise.hashset;

import java.util.HashSet;

public class IntermediateJava {

	public static void main(String[] args) {

		HashSet<String> myHashSet = new HashSet<>();
		
		myHashSet.add("Orange");
		myHashSet.add("Garpes");
		myHashSet.add("Melon");
		myHashSet.add("Aples");
		
		myHashSet.forEach(System.out::println);
		
		
	}

}
