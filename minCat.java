package com.syed.stringassignment;

import java.util.Scanner;

public class minCat {
	public static void main(String[] args) {
		minCat mc = new minCat();
		System.out.println("This Program concatinates minimum string\'s length");
		System.out.print("Enter First String : ");
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		System.out.print("Enter Second String : ");
		String second = sc.next();
		mc.logic(first,second);
		sc.close();
				

	}
	public void logic(String s,String t) {
		int fl = s.length();
		int sl = t.length();
		if (fl < sl) {
			int tr = sl-fl;
			System.out.println(s+t.substring(tr));
			
		}
		else if(fl > sl) {
			int tr = fl - sl;
			System.out.println(s.substring(tr)+t);
			
		}
		else {
			System.out.println(s+t);
		}
	}
}
