package com.shital.m5;

import java.util.ArrayList;

public class ArrayListUpdateNumber {

	public static void main(String[] args) {
	 	ArrayList<Integer> intList= new ArrayList<Integer>();
	 	intList.add(10);
	 	intList.add(20);
	 	intList.add(30);
	 	int num= 2;
	 	System.out.println("Original List := "+intList);
	 	ArrayListUpdateNumber obj = new ArrayListUpdateNumber();
	 	ArrayList<Integer> arrList = obj.UpdateNumber(intList,num);
	 	System.out.println("Updated List is:= "+arrList);
	}


	 ArrayList<Integer> UpdateNumber(ArrayList<Integer> inputList,int n)
	 {
		 ArrayList<Integer> updateList = new ArrayList<Integer>();
		for(int i=0;i<inputList.size();i++)
		{
			int addUpdate = inputList.get(i) + n;
			updateList.add(addUpdate);
			
		}
		//return inputList;
		return updateList;
	}

}
