package com.shital.constructor;

import java.util.ArrayList;

public class NumberOperations 
{

	int num1;
	int num2=2;
	int num3=1;

	public NumberOperations(int num1,int num2,int num3)
	{
		this.num1= num1;
		this.num2= num2;
		this.num3= num3;
	}
	

	public int operations()
	{
		 int add= num1+num1;
		 return add;
	}
	public int operations(int add,int num2)
	{
		int sub= add-num2;
		return sub;

	}
	public int operations(int num3)
	{
		int mul= num3*num3;
		return mul;
	}
	
	int operation()
	{
		int add =num1+num2;
		return add;
		
	}
	
}
