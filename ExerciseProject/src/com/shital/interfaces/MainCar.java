package com.shital.interfaces;

public class MainCar {

	public static void main(String[] args) 
	{
		Car carobj = new Audi(); 
		System.out.println(""+carobj.carBrand());
		System.out.println(""+carobj.engineType());
		carobj.printCost(500000);
		
	}

}
