package com.shital.m5;

import java.util.ArrayList;

public class PassingOperatorAndArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> prepareList = new ArrayList<Integer>();
		prepareList.add(1);
		prepareList.add(2);
		prepareList.add(3);
		prepareList.add(4);
		char[] operator= {'+','-','*'};
		
		PassingOperatorAndArrayList object =new PassingOperatorAndArrayList();
		int result = object.OperationOnArrList(prepareList,operator);
		System.out.println("Given Result==> "+result);
		
		
	}
	
	int OperationOnArrList(ArrayList<Integer> aList, char[] op)
	{
		int add=0;
		int sub=0;
		int mul=0;
		//int i = 0;
		for(int j=0;j<aList.size();j++)
		{ 
			int jval= aList.get(j);
			for(char i=0;i<op.length;i++)
			{
			if(op[i]=='+')
			{
				add = jval + add;
				return add;
			}

			if(op[i]=='-')
			{
				sub = jval - sub;	
				return sub;
			}
				
			if(op[i]== '*')
			{
				mul = jval * mul;
				return mul;
			}
			}
		}
		return  0;
	//	return add;
		
		
	}

}
