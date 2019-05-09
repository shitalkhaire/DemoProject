package com.shital.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class FindNumOfStringInList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("raj");
		strList.add("sai");
		strList.add("jay");
		strList.add("ram");
		
		int count = strList.size();
		System.out.println("Count of String's=>"+count);
		
		Collections.sort(strList);
		System.out.println("Sorted Strings in List "+strList);
	}

}
