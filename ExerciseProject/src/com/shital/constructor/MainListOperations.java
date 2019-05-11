package com.shital.constructor;

import java.util.ArrayList;

import com.shital.m5.ArrayListUpdateNumber;

public class MainListOperations {

	public static void main(String[] args) 
	{
		ArrayList<Integer> intList= new ArrayList<Integer>();
	 	intList.add(10);
	 	intList.add(20);
	 	intList.add(30);
	 	int num= 2;
		ListOperations obj =new ListOperations(intList);
	//	obj.operations(num);
		
		System.out.println("Original List := "+intList);
		
	 	ArrayList<Integer> arrList = obj.operations(num);
	 	System.out.println("Updated List is:= "+arrList);
	 	
	// 	obj.operations();	 	
	 	int sumList = obj.operations();
		System.out.println("Sum of Elements is :="+sumList);
	 	
	}

}
