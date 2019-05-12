package com.shital.constructor;

public class StringOperations 
{
	
	String str1,str2;
	public	StringOperations(String s1,String s2)
	{
		this.str1=s1;
		this.str2=s2;
		
	}
	
	String concateString()
	
	{
		return str1+" " + str2;
	/*	String concate2= str1+" " + str2;
		return concate2;
		*/
	}

	String concateString(String s3)
	{
		return str1+" "+str2+" "+s3;
	}
}
