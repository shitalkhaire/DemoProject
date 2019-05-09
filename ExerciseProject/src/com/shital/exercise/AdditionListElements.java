package com.shital.exercise;

import java.util.ArrayList;

public class AdditionListElements {

	public static void main(String[] args) {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		firstList.add(3);
		firstList.add(2);
		firstList.add(5);
		firstList.add(10);
		System.out.println("Original List is := "+firstList);
		
		AdditionListElements addObj =new AdditionListElements();
		int sumList = addObj.calculateSum(firstList);
	//	System.out.println("Sum of Elements is :="+sumList);
		

	}

	int calculateSum(ArrayList<Integer> calList) {
		
		int storeSum =0;
		System.out.println("position \tSum");		
		for(int i=0;i<calList.size();i++)
		{
		//	calList.add(i);
		storeSum = calList.get(i) + storeSum;
		System.out.println(" "+i+"\t\t"+storeSum);
		}
		
		return storeSum;
	}

}
