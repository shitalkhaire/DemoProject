package com.shital.m12;

public class FirstStarpattern {

	public static void main(String[] args)
	{
		/*
		 ******** for printing this pattern
		 ******* 
		 ****** 
		 ***** 
		 **** 
		 *** 
		 ** 
		 * 
		 	*/
		System.out.println("1st pattern");
		for(int i=0;i<=8;i++)
		{
			for(int j=i;j<8;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		*
  		**
		***
		****
		*****
		******
		*******
		********
		 */
		System.out.println("2nd pattern");
		for(int i=8;i>=0;i--)
		{
			for(int j=i;j<8;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/* for printing this pattern
				 *    
				***   
			   *****  
			  ******* 
			 *********		 */
		System.out.print("3rd pattern");
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(i<j || j<8-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		/* for printing 4th pattern 
		 ********* 
		  *******  
		   *****   
		    ***    
		     *    
		  */
		System.out.println("4th pattern\n\n");
		for(int i=8;i>=0;i--)
		{
			for(int j=0;j<=8;j++)
			{
				if(i<j || j<8-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
			
		}
		System.out.println("5th pattern ");
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
