package com.shital.hashmap;

import java.util.HashMap;

public class KeyValueAddition 
{
	
//	HashMap<Integer,String> hmKii = new HashMap<Integer,String>();
	
	
	
	int getKeys(HashMap<Integer,String> hmKii)
	{
		int keySum=0;
		for (HashMap.Entry<Integer, String> entry : hmKii.entrySet()) 
		{
			
			 keySum =keySum +entry.getKey();
			//valSum =entry.getValue()+valSum;
		}
		return keySum;
	}
	
	String getValues(HashMap<Integer,String> hmVal)
	{
		String valSum="";
		for (HashMap.Entry<Integer, String> entry : hmVal.entrySet()) 
		{
			valSum =valSum + entry.getValue();
		}
		return valSum;
	
	}
	MyResult CombineResult(HashMap<Integer,String> hmKeyVal)
	{
		int keySum=0;
		for (HashMap.Entry<Integer, String> entry : hmKeyVal.entrySet()) 
		{
			
			 keySum =keySum +entry.getKey();
			//valSum =entry.getValue()+valSum;
		}

		String valSum="";
		for (HashMap.Entry<Integer, String> entry : hmKeyVal.entrySet()) 
		{
			valSum =valSum + entry.getValue();
		}
		//
		return new MyResult(keySum, valSum);
	}
}

class MyResult
{
	int key;
	String value;
	public MyResult(int key,String value) {
		this.key=key;
		this.value=value;
	}
	
	int getAddition()
	{
		return key;
	}
	
	String getConcat()
	{
		return value;
	}
	
}