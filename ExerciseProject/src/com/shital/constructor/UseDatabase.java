package com.shital.constructor;

public class UseDatabase {

	public static void main(String[] args) {
		
		String strConnection ="oracle";
		DatabaseOperations operations = new DatabaseOperations(strConnection);
		
		operations.addData("nilesh");
		operations.deleteData("nilesh");
	}

}
