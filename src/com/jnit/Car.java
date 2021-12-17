package com.jnit;

public class Car implements Vehicle {
	private String fuel;
	private int speed;

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("CAR Started------");
		System.out.println("Fuel type is: " + fuel);
		System.out.println("Speed is: " + speed);

	}

}
