package com.shital.m5;

public class PrintFactorialOfNumber 
{

	public static void main(String[] args)
	{
		int num=5;
		int i=1;
		int factorial=1; 
		while(i<= num)
		{
			
			 factorial = factorial *i;
			 i++;
			
		}
	System.out.println("factorial of "+num+" is=>"+factorial);

		
	}

}
