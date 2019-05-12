package com.shital.constructor;

import java.util.ArrayList;

public class DifferentMethodsAndParameters
{
	int addition(int no1,int no2)
	{
		return  no1+ no2;
	}
	
	int addition(int no1,int no2,int no3)
	{
		return no1+no2+no3;
	}
	int addition(ArrayList<String> strList)
	{    int add=0;
		for(int i=0;i<strList.size();i++) 
		{
			add = add + Integer.parseInt(strList.get(i));
		}
		return add;
		
	}
}
