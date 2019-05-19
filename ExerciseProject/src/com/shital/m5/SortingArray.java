package com.shital.m5;

public class SortingArray 
{

	static int	[]array = {5,1,4,3,2}; 
	public static void main(String[] args) 
	{

		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j>0;j--)
			{ 
			if(array[j]<=array[j-1])
			{
				
				int temp = array[j];
			    array[j] = array[j - 1];
			    array[j - 1] = temp;
				
			}
			}
		}
		System.out.println("Ascending Ordered:=");
		for (int i = 0; i < array.length; i++) 
		{
		     System.out.print("\t"+array[i]);
		}
		
		for(int k=0;k < array.length; k++)
		{
			for(int j=k;j< 0;j++)
			{ 
			if(array[j]>=array[j-1])
			{
				
				int temp = array[j];
			    array[j] = array[j + 1];
			    array[j + 1] = temp;
				
			}
			}
		}
		System.out.println("\nReverse Array:=");
		for (int i = array.length-1; i>=0; i--) 
		{
		     System.out.print("\t"+array[i]);
		}
		
	}
		

}
