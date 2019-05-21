package com.shital.constructor;

public class StudentData 
{
	int sID;
	String sName;
	String address;
	public StudentData(int id,String name,String address)
	{
		this.sID=id;
		this.sName=name;
		this.address=address;
		
	}
	void idGeneration()
	{
		System.out.println("Student id:"+sID);
	}
	void nameCreation()
	{
		System.out.println("Student name:"+sName);
	}
	void addressInsertion()
	{
		System.out.println("Student Address:"+address);
	}

}
