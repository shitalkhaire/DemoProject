package com.shital;

import com.shital.constructor.NumberOperations;

public class MainNumberOperations {

	public static void main(String[] args)
	{
		int num1= 4;
		int num2= 2;
		int num3= 3;
		NumberOperations obj =new NumberOperations(num1, num2, num3);
		System.out.println("Given Numbers Are:="+num1+","+num2+","+num3);
		
		int operation1 = obj.operations();
		System.out.println("Addition Of :"+num1+"+"+num1+"="+operation1);
		
		int operation2 =obj.operations(operation1, num2);
		System.out.println("Substract from->previous Addiotion:"+operation1+"-"+num2+"="+operation2);
		
		int operation3 = obj.operations(num3);
		System.out.println("Multiplication of :"+num3+"*"+num3+"="+operation3);

	}

}
