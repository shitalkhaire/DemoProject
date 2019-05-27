package com.shital.hashmap;

import java.util.HashMap;

public class SearchValueMain 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(10,"Austria");
		map.put(11,"Itali");
		map.put(12,"Paris");
		map.put(13,"Germany");
		int id= 10;
		
		SearchValueUsingHashMapKey obj = new SearchValueUsingHashMapKey();
		System.out.println("Output:=="+obj.searchHMapValue(map,id));
	}

}
