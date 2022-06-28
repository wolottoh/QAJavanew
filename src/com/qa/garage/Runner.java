package com.qa.garage;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car("BMW", "Black", 4, true, 5);
		Van van = new Van("Mercedes", "Grey", 4, 500);
		Motorcycle mc = new Motorcycle("Ducati", "Blue", 2, 35);

		System.out.println(car);
		System.out.println(van);
		System.out.println(mc);

		Garage garage = new Garage();
		
		// Add all three vehicles to the garage

		garage.add(car);
		garage.add(van);
		garage.add(mc);
		
		// Printing my vehicles

		garage.printList();
		
		// Calculate Bills

//		garage.calculateBills();

		garage.removeByType("car");
		
		garage.printList();

	}

}
