package com.example.myapp;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	try (Scanner num = new Scanner(System.in)) {
		System.out.println("enter two numbers");
		int num1=num.nextInt();
		int num2=num.nextInt();
		System.out.println("choose one option number\n 1 for +\n 2 for -\n 3 for *\n 4 for /");
		int choice=num.nextInt();
		int result=0;
		if (choice==1) {
			result=num1+num2;
			System.out.println("sum of the two numbers= "+result);
		}
		else if(choice==2){
			result=num1-num2;
			System.out.println("diffrence of the two numbers= "+result);
		}
		else if(choice==3) {
			result=num1*num2;
			System.out.println("multyplication of the two numbers= "+result);
			
		}
		else if(choice==4) {
			result=num1/num2;
			System.out.println("division of two numbers= "+result);
		} else {
			System.out.println("Your choice was wrong");
		}
	}
	System.out.println("thank you for visiting");
}
}
