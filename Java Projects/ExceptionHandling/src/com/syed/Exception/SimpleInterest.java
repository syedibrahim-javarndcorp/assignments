package com.syed.Exception;

import java.util.Scanner;

public class SimpleInterest extends Exception {

	public static void main(String args[]) throws NegativeInterger, NonInt {
		SimpleInterest s = new SimpleInterest();
		Scanner sc = new Scanner(System.in);
		float p, r, t;
		System.out.println("Enter the Principal amount : ");
		p = sc.nextFloat();
		System.out.println("Enter the Rate : ");
		r = sc.nextFloat();
		System.out.println("Enter the time : ");
		t = sc.nextFloat();
		s.logic(p, r, t);
		sc.close();

	}

	public void logic(float p, float r, float t) throws NegativeInterger, NonInt {
		if (p < 0 || r < 0 || t < 0) {
			String msg = "Enter Positive Interger";
			throw new NegativeInterger(msg);
		}
		if (p != ((float) p)) {
			String msg = "Enter valid Number";
			throw new NonInt(msg);

		}
		float si = (p * r * t) / 100;
		System.out.println("Simple Interest is: " + si);
	}

}
