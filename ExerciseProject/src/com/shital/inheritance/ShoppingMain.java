package com.shital.inheritance;

public class ShoppingMain {

	public static void main(String[] args) 
	{
		OnlineShopping obj = new OnlineShopping();
		System.out.println("first method:"+obj.realViewProduct());
		System.out.println("second method:"+obj.payWithCard());
		System.out.println("third method:"+obj.OnlineOrdered());
		System.out.println("fourth method:"+obj.SeeUserfeedback());
	}

}
