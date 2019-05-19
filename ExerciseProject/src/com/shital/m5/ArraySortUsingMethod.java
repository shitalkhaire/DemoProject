package com.shital.m5;

import java.util.Arrays;

public class ArraySortUsingMethod {

	public static void main(String[] args) 
	{

		int	[]array = {15,13,14,11,12}; 
		ArraySortUsingMethod obj = new ArraySortUsingMethod();
		System.out.println("Sorted Array:="+Arrays.toString(obj.arrayAsending(array)));
	//Arrays.toString()- used for converting int to String value.by using this 	

	}
	
	int[] arrayAsending(int[] a)
	{
		int i;
		for( i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{ 
				if(a[j]<=a[j-1])
				{
				
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				
					}
			
				}
		}
		
		return a;
	}
	
}
