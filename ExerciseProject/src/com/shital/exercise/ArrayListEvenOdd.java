package com.shital.exercise;

import java.util.ArrayList;

public class ArrayListEvenOdd {

	
	
	public static void main(String args[])
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(40);
		
		ArrayListEvenOdd obj1= new ArrayListEvenOdd();
		
		ArrayList<Integer> listMethodCall = obj1.MethodForEven(list);
		System.out.println(" "+listMethodCall);
	}
	//return type of method should same as return value.
	//Here we used raw type such as without any (data type) type of ArrayList it means we can 
	//use this arraylist with any another type,but for that we should required type conversion like line no31
	ArrayList<Integer> MethodForEven(ArrayList list)
	{
		ArrayList <Integer> EvenList = new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			//Type casting object(list) into int
			 int even=(int)list.get(i); 
			 
			if(even %2 == 0)
			{
				// add those element we really want to into list,Remind always:
				//After adding the element into list only 
				//we can get the elements of list
				EvenList.add(even);
				
	//			EvenList.addAll(list);
			}
			
		}
//		System.out.println("Even Numbers list "+list);
		return EvenList;
		
	}
	 
}
