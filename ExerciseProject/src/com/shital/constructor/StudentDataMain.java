package com.shital.constructor;

public class StudentDataMain {

	public static void main(String[] args) 
	{
		int id= 101;
		String name ="Sanja";
		String address="paris";
		StudentData obj = new StudentData(id,name,address);
		obj.idGeneration();
		obj.nameCreation();
		obj.addressInsertion();
	
	
	}
	

}
