package com.java.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Teller {
	
	private String name = "";
	private String address = "";
	private String phonenumber = "";
	private String creditrating = "";
	
	public Teller() {
		
	}
	
	
	public Teller(String name, String address, String phonenumber, String creditrating) {
		
		
		this.name = name;
		this.address =address;
		this.phonenumber = phonenumber;
		this.creditrating = creditrating;
		
	}

	public String getname() {
		
		return this.name;
	}
	
	public String getaddress() {
		
		return this.address;
	}
	
	public String getphonenumber() {
		
		return this.phonenumber;
	}
	
	public String getcreditrating() {
		
		return this.creditrating;
	}
	
	public int samenumber = 0;
	public int number = 0;
	
	public ArrayList<Teller> clientinformation = new ArrayList<Teller>();
	public Scanner sc = new Scanner(System.in);
	
	
	
	
	public void openaccount(String name, String address, String phonenumber, String creditrating) {
		
		clientinformation.add(new Teller (name, address, phonenumber, creditrating));
	}
	
	
	public boolean samename() {
	
		boolean samename = false;
		
		for(int i=0; i<clientinformation.size(); i++)
		{
			if(name.equals(clientinformation.get(i).name) )
			{
				System.out.println("동일한이름이있습니다");
				number = i;
				samename = true;
			}
		}
		
			return samename;
	}
	
	
	public void showclient(String name) {
		
		samename();
		
		if(samename() == true)
		{
			System.out.println(clientinformation.get(number).getname() );
			System.out.println(clientinformation.get(number).getaddress() );
			System.out.println(clientinformation.get(number).getphonenumber() );
			System.out.println(clientinformation.get(number).getcreditrating() );
		}
		
		else
		{
			for(int i =0; i<clientinformation.size(); i++)
			{
				System.out.println(clientinformation.get(i).getname() );
				System.out.println(clientinformation.get(i).getaddress() );
				System.out.println(clientinformation.get(i).getphonenumber() );
				System.out.println(clientinformation.get(i).getcreditrating() );
			}
		}
		
	}
}

	
	
	
	
	
	













