package com.shital.inheritance; 

public class MainMergePhone 
{
	public static void main(String[] args)
	{
		SmartPhone mob = new SmartPhone();
		System.out.println("phone method 1"+mob.makeCall());
		System.out.println("phone method 2"+mob.sendmessege());
		System.out.println("Smartphone method 3"+mob.takePhoto());
		System.out.println("Smartphone method 4"+mob.viewVideo());
	}
	
// When methods are same in both classes then we can access it with the object of base class with refence 
//	of inheritedclass - method overreid.
// when both classes having different methods then we should access that methods with the obj of Inheritedclass.	

}
