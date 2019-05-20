package com.shital.inheritance;

public class Whatsapp_EmailMain {

	public static void main(String[] args)
	{
		Whatsapp object = new Whatsapp();
		System.out.println("method of both class:"+object.contact());
		System.out.println("Emailapps method:"+object.emailsChecking());
		System.out.println("EmailApps method:"+object.officialDocuments());
		System.out.println("Whatsapp method:"+object.sendVideo_Audio());
	}

}
