package com.shital.constructor;

public class MainStringOperation {

	public static void main(String[] args) 
	{
		String str1="Shital";
		String str2="Nilesh";
		String str3="Khaire";
		
		StringOperations ob = new StringOperations(str1,str2);
		
		//String firstConcate = ob.concateString();
		System.out.println("First Two Strings Are:="+ ob.concateString());
		
	//	String secndConcate =ob.concateString(str3);
		System.out.println("After Concating 3rd String:="+ob.concateString(str3));
		
	}

}
