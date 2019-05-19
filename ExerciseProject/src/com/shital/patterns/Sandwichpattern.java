package com.shital.patterns;

public class Sandwichpattern {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i<j || i==j)
				{
					System.out.print(" ");
				}
				else if(j>i || j<10-i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
