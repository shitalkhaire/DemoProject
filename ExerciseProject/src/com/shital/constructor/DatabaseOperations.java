package com.shital.constructor;

public class DatabaseOperations {
 
	String strConnection;
	
	public DatabaseOperations(String strConnection) {
		this.strConnection=strConnection;
	}
	
	public void addData(String strColumn)
	{
		System.out.println("added "+strColumn+" using "+strConnection);
	}
	
	void deleteData(String strColumn)
	{
		System.out.println("deleted "+strColumn+" using "+strConnection);
	}
}
