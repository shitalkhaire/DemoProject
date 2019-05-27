package com.shital.hashmap;

import java.util.HashMap;

public class KeyValueMultiplication
{
	int keysMultiplication(HashMap<Integer,String> kii)
	{
		int mul=1;
		for(HashMap.Entry<Integer,String>entry : kii.entrySet())
		{
			mul = entry.getKey() * mul;
		}
		return mul;
		
	}
	String valuesConcat(HashMap<Integer,String> val)
	{
		String hshVal =" ";
		for(HashMap.Entry<Integer,String>entry : val.entrySet())
		{
			hshVal =hshVal + entry.getValue();
		}
		return hshVal;
	}
	
	MyHashMap CombineResult(HashMap<Integer,String> hmKeyVal)
	{
		int mul=1;
		for(HashMap.Entry<Integer,String>entry : hmKeyVal.entrySet())
		{
			mul = mul * entry.getKey();
		}
		//return mul;
		

		String hshVal =" ";
		for(HashMap.Entry<Integer,String>entry : hmKeyVal.entrySet())
		{
			hshVal =hshVal + entry.getValue();
		}
		//return hshVal;
		return new MyHashMap(mul, hshVal);
	}
	
}
class MyHashMap
{
	int key;
	String value;
	public MyHashMap(int key,String value) {
		this.key=key;
		this.value=value;
	}
	
	int getMultiplication()
	{
		return key;
	}
	
	String getConcat()
	{
		return value;
	}
	
}

class MySample
{
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	int key;
	String val;
	public MySample(int key, String val)
	{
		super();
		this.key = key;
		this.val = val;
	}
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	/**
	 * @return the val
	 */
	public String getVal() {
		return val;
	}
	/**
	 * @param val the val to set
	 */
	public void setVal(String val) {
		this.val = val;
	}
	public String toString()
	{
		return "MySample [key=" + key + ", val=" + val + "]";
	}
	
}
