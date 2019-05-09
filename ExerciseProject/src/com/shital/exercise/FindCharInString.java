package com.shital.exercise;

public class FindCharInString {

	public static void main(String[] args) {
	
		FindCharInString object = new FindCharInString();
		
		String firstStr ="Hallo";
		int temp = 1;
		char[] CharArr = firstStr.toCharArray();
		
		object.findCharacter( temp,CharArr);
	}

	void findCharacter(int num,char[]CharArr)
	{
		
		System.out.println(" "+CharArr[num]);

	
}
}

