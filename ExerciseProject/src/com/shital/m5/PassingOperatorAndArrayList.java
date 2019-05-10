package com.shital.m5;

import java.util.ArrayList;

public class PassingOperatorAndArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> prepareList = new ArrayList<Integer>();
		prepareList.add(10);
		prepareList.add(20);
		prepareList.add(30);
		prepareList.add(40);
		char operator='+';
		
		PassingOperatorAndArrayList object =new PassingOperatorAndArrayList();
		int result = object.OperationOnArrList(prepareList,operator);
		System.out.println("Given Result==> "+result);
		
		
	}
	
	int OperationOnArrList(ArrayList<Integer> aList, char op)
	{
		int add =0;
		int sub =0;
		int mul =0;
		for(int i=0;i<aList.size();i++)
		{ 
			
			if(op=='+')
			{
				add = aList.get(i) + add;
			}
			
		/*		
				if(op=='-')
				{
					sub = aList.get(i) - sub;	
				}
				return sub;
			*/	
		}
	//	return  null;
		return add;
		
	}

}
