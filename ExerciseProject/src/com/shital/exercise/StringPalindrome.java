package com.shital.exercise;

public class StringPalindrome
{
	public static String checkPalindrome(String s) 
	  { 
	    // reverse the given String 
	    String reverse = new StringBuffer(s).reverse().toString(); 
	  
	    // check whether the string is palindrome or not 
	    if (s.equals(reverse)) 
	    {
	      System.out.println("String1 = "+s); 
	    }
	    else
	    {
	      System.out.println("String2 = "+s);
	    }
	    
		return reverse;
	  } 
	  
	  public static void main (String[] args)throws java.lang.Exception 
	  { 
		  checkPalindrome("malam"); 
		  checkPalindrome("Did"); 
	  } 

}
