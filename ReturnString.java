package com.syed.stringassignment;

import java.util.Scanner;

public class ReturnString {
	public void trimmer(String s) {
		int i = s.length();
		if (i > 3 && i % 2 != 0) {
			i = Math.round(i / 2);
			//System.out.println(i);
			System.out.println(s.subSequence(i - 1, i + 2));
		}
		else {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		ReturnString rs = new ReturnString();
		System.out.println(" string of odd length, return the string length 3 from its middle");
		System.out.print("Enter the Word : ");
		Scanner sc = new Scanner(System.in);
		String trimed = sc.next();
		rs.trimmer(trimed);
		sc.close();

	}
}
