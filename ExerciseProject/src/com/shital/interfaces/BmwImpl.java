package com.shital.interfaces;

public class BmwImpl implements Car
{
	public String carBrand()
	{
		return "BMW";	
	}
	public String engineType()
	{
		return "Bs1";
	}
	public void printCost(float fCost)
	{
		System.out.println(" Cost"+fCost);
	}
	public String aboutBMW()
	{
		return "It is a very good car.";
	}
}
