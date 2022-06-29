package com.qa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExercise {

	public static void main(String[] args) {

		List<String> myListOfNames = new ArrayList<>();

		myListOfNames.add("Michael");
		myListOfNames.add("Dean");
		myListOfNames.add("James");
		myListOfNames.add("Chris");

		Stream<String> myStreamOfNames = myListOfNames.stream();

//		myStreamOfNames.filter(name -> !name.contains("J")).forEach(value -> System.out.println("Hello "  + value));
//		myStreamOfNames.filter(name -> !name.equals("James")).forEach(value -> System.out.println("Hello " + value));

		myStreamOfNames.forEach(name -> {

			if (!name.equals("James")) {

				System.out.println("Hello " + name);

			} else {

				System.out.println(name);
			}
		});
	}

}
