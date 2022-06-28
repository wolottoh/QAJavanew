package com.qa.operators.calculator;

public class Runner {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.add(10, 7);

		cal.multiply(8, 4);

		cal.subtract(16, 3);

		cal.divide(15, 6);

		System.out.println(cal);

	}

}
