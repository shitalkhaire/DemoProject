package com.shital.interfaces;

public class OracleOperationsImpl implements DatabaseOperations
{

	
	@Override
	public String createTable() 
	{
		
		return "Oracle-Table created Sucessfully..";
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
