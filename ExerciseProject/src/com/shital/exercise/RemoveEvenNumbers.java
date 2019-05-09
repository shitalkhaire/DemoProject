package com.shital.exercise;

import java.util.ArrayList;

public class RemoveEvenNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(3);
		aList.add(6);
		aList.add(8);
		aList.add(9);
		aList.add(10);
		System.out.println("Original List is := "+aList);

		RemoveEvenNumbers rObj= new RemoveEvenNumbers();
		ArrayList<Integer> dispList = rObj.findEvenNumbr(aList);
	
		System.out.println("After Removing EvenNumber := "+dispList);
	}
	ArrayList<Integer> findEvenNumbr(ArrayList<Integer> numbrlist)
	{
		for(int i=0; i<=numbrlist.size(); i++)
		{
			if(numbrlist.get(i)%2== 0)
			{
		//		System.out.println(" "+numbrlist.get(i));
				numbrlist.remove(i);
			}
		}
		return numbrlist ;
		
	}

}
