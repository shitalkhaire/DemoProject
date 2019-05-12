package com.shital.constructor;

import java.util.ArrayList;

public class MainDifferentMethod {

	public static void main(String[] args) 
	{
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("10");
	list.add("20");
	list.add("30");
	DifferentMethodsAndParameters b = new DifferentMethodsAndParameters();
	
	System.out.println("Result of First Method:="+b.addition(2,4));
	System.out.println("Result of Second Method:="+b.addition(2, 4, 3));
	System.out.println("Result of Third Method:="+b.addition(list));
	}

}
