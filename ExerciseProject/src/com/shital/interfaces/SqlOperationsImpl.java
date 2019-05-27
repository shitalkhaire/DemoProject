package com.shital.interfaces;

public class SqlOperationsImpl implements DatabaseOperations
{

	@Override
	public String createTable() 
	{
		
		return "SQL-Table created Sucessfully..";
	}

	@Override
	public String insertRecord()
	{
		
		return "Record inserted sucessfully..";
	}

	@Override
	public String deleteRecord()
	{
		return "Record Deleted..";
	}

	@Override
	public String dropTable() 
	{
		return "Droped table sucessfully..";
	}
	
}
