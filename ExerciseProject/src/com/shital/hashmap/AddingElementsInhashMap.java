package com.shital.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AddingElementsInhashMap
{

	public static void main(String[] args) 
	{
		Map<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(10,"raj");
		map1.put(20,"jay");
		map1.put(30,"john");
		map1.put(40,"Tim");
		
		Iterator<Entry<Integer, String>> it = map1.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<Integer, String> records = (Map.Entry<Integer, String>) it.next();
			System.out.println(records.getKey() + " = " + records.getValue());
		}
		
	}

}
