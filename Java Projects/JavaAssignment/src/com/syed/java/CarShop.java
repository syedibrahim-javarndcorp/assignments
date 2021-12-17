package com.syed.java;

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

	public int carShop(int car) {
		int no_of_car = 1000;
		int totalCar = no_of_car - car;
		return totalCar;

	}

	public void setCarDetails(CarShop car) {

		Scanner sp = new Scanner(System.in);
		System.out.print("Enter the speed : ");
		int cspeed = sp.nextInt();
		System.out.print("Enter the Car Owner : ");
		String cOwner = sp.next();
		System.out.print("Enter the Car Type : ");
		String cType = sp.next();
		CarShop car1 = new CarShop();
		car1.setSpeed(cspeed);
		car1.setCarOwner(cOwner);
		car1.setCarType(cType);
		sp.close();

		System.out.println("\nDisplaying the GEt value\n");

		System.out.println("car speed = " + car1.getSpeed());
		System.out.println("car Owner = " + car1.getCarOwner());
		System.out.println("car Type = " + car1.getCarType());
	}

	/*
	 * public void getCarDetails(CarShop car) { CarShop car1 = new CarShop();
	 * System.out.println("car speed = " +car1.getSpeed());
	 * System.out.println("car speed = " +car1.getCarType());
	 * System.out.println("car speed = " +car1.getCarOwner());
	 * 
	 * 
	 * 
	 * }
	 */

	public static void main(String[] args) {

		CarShop car1 = new CarShop();
		car1.setCarDetails(car1);

		System.out.print("\n Enter The Number of car SOld : \n");

//		Scanner s = new Scanner(System.in);
//		int soldCar = s.nextInt();
//		s.close();
		System.out.println("Car Remaining = " + car1.carShop(500/*soldCar*/));

	}

}
