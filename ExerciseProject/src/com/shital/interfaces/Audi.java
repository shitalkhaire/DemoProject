package com.shital.interfaces;

public class Audi implements Car 
{

	@Override
	public String carBrand()
	{
		
		return "Audi";
	}

	@Override
	public String engineType()
	{
		
		return "bcc4";
	}

	@Override
	public void printCost(float fCost) 
	{
		System.out.println("cost of Audi:"+fCost);
	}
	
	public String aboutAudi()
	{
		return "It is a very good car.";
	}
}
