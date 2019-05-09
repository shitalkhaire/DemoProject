package com.shital.exercise;

import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String args[])
	{
		StringReverse object = new StringReverse();
		
		String string1 = "Shital";
		char[] stringToCharArray = string1.toCharArray();
		
		object.reverseString(string1, stringToCharArray);
		
		
	}
	
	String reverseString(String strInput, char[] stringToCharArray)
	{
	/*	
		for(int i=0;i< stringToCharArray.length;i++)
		{
			System.out.println(" "+stringToCharArray[i]);
			
		}
		*/
		for(int i= stringToCharArray.length-1;i>= 0;i--)
		{
	//		System.out.println(""+i);
			System.out.println(" "+stringToCharArray[i]);
		}
		
		return strInput;
		
	}
}

