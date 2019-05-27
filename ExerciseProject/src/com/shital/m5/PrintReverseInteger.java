package com.shital.m5;

public class PrintReverseInteger
{

	public static void main(String[] args) 
	{
		int num = 2356;
		int modul=0;
	//	int division=0;
		
		
		int division =num / 10;
		modul= num %10;
		System.out.println("Original Number:="+num);
		System.out.print("Reverse Number:="+modul);
		
		
		while(num !=0)
		{
			modul = division % 10;
			division= division /10;
			System.out.print(modul);
			num=division;
		}
	
	}

}
