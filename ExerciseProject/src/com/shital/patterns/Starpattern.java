package com.shital.patterns;

import java.util.Arrays;

public class Starpattern {

	void pattern1()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=i;j<4;j++)
			{
			
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	void pattern2()
	{
		for(int i=5;i>= 0;i--)
		{
			for(int j=i;j<4;j++)
			{
			
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	void pattern3()
	{
		for(int i=0;i<=5;i++)
		{
			
			for(int j=i-1;j<=i;j++)
			{
			   
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args)
	{
	/*
	Starpattern obj= new Starpattern();
	obj.pattern1();
	obj.pattern2();
	obj.pattern3();
		*/
	new Starpattern().patternTriangle();
	System.out.println("+++++++++++++++++++++++");
	new Starpattern().patternTriangle2();

	}
	void patternTriangle()
	{
		int size =11;
		for (int i = 1; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if(i>j || j>size-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	void patternTriangle2()
	{
		int size =10;
		for (int i = 1; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if(i<j || j<size-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
