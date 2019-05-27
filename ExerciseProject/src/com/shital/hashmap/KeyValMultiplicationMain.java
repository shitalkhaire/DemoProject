package com.shital.hashmap;

import java.util.HashMap;

public class KeyValMultiplicationMain
{

	public static void main(String[] args) 
	{

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(10, "Welcome");
		hm.put(20,"In");
		hm.put(30,"Austria.!!");
		
		
		KeyValueMultiplication ob = new KeyValueMultiplication();
		
		System.out.println("Multiplication of Keys:"+ob.keysMultiplication(hm));
		System.out.println("String Value of HashMap:="+ob.valuesConcat(hm));
		
		System.out.println("---------Combine Result-------");
		MyHashMap m=ob.CombineResult(hm);
		System.out.println(" multiplication:= "+m.getMultiplication());
		System.out.println(" concat:= "+m.getConcat());
		
		MySample o= new MySample(1,"goa");
		System.out.println(" "+o);
	}

}
