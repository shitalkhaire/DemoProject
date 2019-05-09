package com.shital.exercise;

public class MultipleMethods {

	public static void main(String[] args) {
		MultipleMethods obj1= new MultipleMethods();
		int num =10;
		
		int methodVal= obj1.methodForInt(num);
		System.out.println(" "+methodVal);	
	
		double fnum =10.5; 
		double returnmethod= obj1.methodForFloat(num,fnum);
		System.out.println(" "+returnmethod);
        
		String Strval = "Shital"; 
		String lastval = "Khaire";
		
		String returnString = obj1.methodForString(Strval, lastval);
		System.out.println(" "+returnString);
		
		String returnStringLength =obj1.methodForCalculateStringLength(returnString);
		System.out.println(" "+returnStringLength);
	}
	
//Method 1
	int methodForInt(int inNum)
	{
		//System.out.println(" "+inNum);	
		return inNum;
	}
//Method 2	
	double methodForFloat(int inNum, double fnum)
	{
		double floatAdd = inNum + fnum ;
	//	System.out.println(" "+floatAdd);

		return floatAdd;
	}
//Method 3
	String methodForString(String name, String lastname)
	{
		String modifyString= name + lastname;
		
		return modifyString;
		
	}
//Method 4
	String methodForCalculateStringLength(String strForLength)
	{
	int strLength = strForLength.length();
	return Integer.toString(strLength);
	}
}

