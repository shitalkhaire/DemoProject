package com.shital.constructor;

import com.shital.constructor.NumberOperations;

public class MainNumberOperations {

	public static void main(String[] args)
	{
		int num1= 4;
		int num2= 2;
		int num3= 3;
		NumberOperations obj =new NumberOperations(num1, num2, num3);
		System.out.println("\tGiven Numbers Are:="+num1+","+num2+","+num3);
		
		System.out.println("\n\t--Result Of 1st Method--");
		int operation1 = obj.operations();
		System.out.println("\n\tAddition Of :"+num1+"+"+num1+"="+operation1);
		
		System.out.println("\n\t--Result Of 2nd Method--");
		int operation2 =obj.operations(operation1, num2);
		System.out.println("\n\tSubstract from->previous Addiotion:"+operation1+"-"+num2+"="+operation2);
		
		System.out.println("\n\t--Result Of 3rd Method--");
		int operation3 = obj.operations(num3);
		System.out.println("\n\tMultiplication of :"+num3+"*"+num3+"="+operation3);

	}

}
