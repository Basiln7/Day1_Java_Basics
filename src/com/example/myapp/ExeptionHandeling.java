package com.example.myapp;

import java.util.Scanner;

public class ExeptionHandeling {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the two number to divide");
		int num1=num.nextInt();
		int num2=num.nextInt();
		try {
			int result=num1/num2;
			System.out.println("Result= "+result);
		}
		catch(Exception ex) {
			System.out.println("Exption : usig zero in division is not possible");
		}
		finally {
			System.out.println("Program running is over");
		}
		 System.out.println("Program over");
	}

}
