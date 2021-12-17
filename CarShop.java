package com.syed.assignment;

import java.util.Scanner;

public class CarShop {

	private int speed;
	private String carOwner;
	private String carType;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int carShop(String args[]) {
		Scanner sc = new Scanner(System.in);
		int carSold = sc.nextInt();
		int no_of_car = 1000;
		int totalCar = no_of_car - carSold;
		sc.close();
		return totalCar;

	}

	public void setCarDetails(CarShop car) {
		
		Scanner sp = new Scanner(System.in);
		int cspeed = sp.nextInt();
		String cOwner = sp.next();
		String cType = sp.next();
		CarShop car1 = new CarShop();
		car1.setSpeed(cspeed);
		car1.setCarOwner(cOwner);
		car1.setCarOwner(cType);
		sp.close();
	}

	public void getCarDetails(CarShop car) {
		CarShop car1 = new CarShop();
		car1.getSpeed();
		car1.getCarType();
		car1.getCarOwner();

	}

	public static void main(String[] args) {
		CarShop car1 = new CarShop();
		car1.setCarDetails(car1);
		car1.getCarDetails(car1);
		
		
	}

}
