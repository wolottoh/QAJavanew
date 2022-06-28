package com.qa.garage;

public class Motorcycle extends Vehicle {
	
	private int handleBarWidth;

	public int getHandleBarWidth() {
		return handleBarWidth;
	}

	public void setHandleBarWidth(int handleBarWidth) {
		this.handleBarWidth = handleBarWidth;
	}

	public Motorcycle(String make, String colour, int numOfWheels, int handleBarWidth) {
		super(make, colour, numOfWheels);
		this.handleBarWidth = handleBarWidth;
	}

	@Override
	public String toString() {
		return "Motorcycle [handleBarWidth=" + handleBarWidth + ", getMake()=" + getMake() + ", getColour()="
				+ getColour() + ", getNumOfWheels()=" + getNumOfWheels() + "]";
	}
	
	
	
	

}
