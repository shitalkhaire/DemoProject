package com.shital.constructor;

import java.util.ArrayList;

public class ListOperations {
	ArrayList<Integer> aList ;
	public	ListOperations(ArrayList<Integer> aList)
	{
		this.aList=aList;
	}
	int operations() 
	{
		
		int storeSum =0;
		//	System.out.println("position \tSum");		
		for(int i=0;i<aList.size();i++)
		{
		//	calList.add(i);
		storeSum = aList.get(i) + storeSum;
		//System.out.println(" "+i+"\t\t"+storeSum);
		}
		
		return storeSum;
	}

	ArrayList<Integer> operations(int n)
	{
		 ArrayList<Integer> updateList = new ArrayList<Integer>();
		 for(int i=0;i<aList.size();i++)
		 {
				int addUpdate = aList.get(i) + n;
				updateList.add(addUpdate);
		 }
		 //return inputList;
		 return updateList;
	}
}