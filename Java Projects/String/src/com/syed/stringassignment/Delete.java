package com.syed.stringassignment;

import java.util.Scanner;

public class Delete {
public static void main(String[] args) {
	Delete d = new Delete();
	System.out.println("This program deletes \'del\' word");
	System.out.println("Enter the word : ");
	Scanner sc = new Scanner(System.in);
	String statement = sc.next();
	d.Deldel(statement);
	sc.close();
	
	
	
}
public void Deldel(String s) {
	if (s.contains("del")){
		s =s.replace("del","");
		System.out.println("result = " +s );
	}
	
	
	
	
}

}
