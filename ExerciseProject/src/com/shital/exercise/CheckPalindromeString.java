package com.shital.exercise;

public class CheckPalindromeString {

	public static void main (String args[]) 
	{
		String s1= "malam";
		char[] CharArr = s1.toCharArray();
		char StrChar=' ';
		for(int i=0;i<s1.length();i++)
		{	
			 StrChar = CharArr[i];
		}
			for(int j=s1.length()-1;j>0;j--)
			{
			
				if(CharArr[j] == StrChar)
				{
					System.out.println(CharArr[j]);
				}
			/*	else
				{
				System.out.println(CharArr[j]);	
				}
			*/
			}
		
		
	}

}
