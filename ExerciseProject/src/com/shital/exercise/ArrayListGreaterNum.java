package com.shital.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGreaterNum {

	public static void main(String[] args) {
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		list1.add(7);
		list1.add(4);
		
		ArrayListGreaterNum obj = new ArrayListGreaterNum ();
		int largeNum = obj.findGreaterNumber(list1);
		System.out.println("Greater Number="+largeNum);
		
	}
	//row type
	//return type of method and type of methods parameter should not same.
	
 int findGreaterNumber(ArrayList<Integer> inArrList)
 {
//	 for(int i=0;i<inArrList.size();i++)
//	 {
		
	//	  greaterNumbr = (ArrayList<Integer>) Collections.max(inArrList);
	 // Exceed length problem:IndexOutOfBoundException.
	 // Index value of Arraylist is always 0. 
	 int i=0;
			 if(inArrList.get(i) > inArrList.get(i+1))
			 {
				// inArrList.add(i);
			  return inArrList.get(i);
			 }
			 else
			 {
				 return inArrList.get(i+1);
				 
			 }
			
		
//		 }
//	 System.out.println(" "+inArrList);
//	return  -1;
	
	 
 }
	
}
