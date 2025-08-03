package com.example.myapp;

public class OOPScocepts {
 public static void main(String[] args) {
	  
	 Car c1=new Car();//object of Car class
	 c1.brand="toyota";// calling variables in class car
	 c1.year=2005;
	 c1.displayinfo();// calling method from class car
	 
 }
}
class Car{
	 String brand;
	 int year;
	 void displayinfo() {
		 System.out.println("brand= "+brand+"  year= "+year);
	 }
}

