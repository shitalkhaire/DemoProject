package com.shital.inheritance;

public class StringOperationMain {

	public static void main(String[] args) 
	{
		StringOperations obj = new StringOperationsAdvance();
		System.out.println("Normal "+obj.printString());
		System.out.println("Reverse "+obj.printReverseString());
		System.out.println("UpperCase "+obj.printToUpper());
		
	}

}
