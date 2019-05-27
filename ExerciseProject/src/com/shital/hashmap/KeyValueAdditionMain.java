
package com.shital.hashmap;

import java.util.HashMap;
import java.util.Map;

public class KeyValueAdditionMain 
{
	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "hello");
		hm.put(2,"java");
		hm.put(3,"programing.!!");
		
		KeyValueAddition ob = new KeyValueAddition();
		int keys=0;
		String values="";
		System.out.println("Addition of Keys:");
		System.out.println(""+ob.getKeys(hm));
		System.out.println("String Value of HashMap:=");
		System.out.println(""+ob.getValues(hm));
		
		MyResult m=ob.CombineResult(hm);
		System.out.println(" sum "+m.getAddition());
		System.out.println(" concat "+m.getConcat());
}

}
