package com.shital.interfaces;

public class MainOperations 
{

	public static void main(String[] args) 
	{
		DatabaseOperations operation1 = new SqlOperationsImpl();
		DatabaseOperations operation2 = new OracleOperationsImpl();
		
		System.out.println("++++++++SQL-Operations..+++++++");
		
		System.out.println(""+operation1.createTable());
		System.out.println(""+operation1.insertRecord());
		System.out.println(""+operation1.deleteRecord());
		System.out.println(""+operation1.dropTable());
		
		System.out.println("++++++Oracle-Operations..+++++++");
		System.out.println(""+operation2.createTable());
		System.out.println(""+operation2.insertRecord());
		System.out.println(""+operation2.deleteRecord());
		System.out.println(""+operation2.dropTable());
		
	}

}
