package com.java.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	
	
	private String checkingaccount = "";
	private String minusaccount = "";
	private int identifinumber = 0;
	
	
	public Account() {
		
	}
	
	public Account(String checkingaccount, String minusaccount, int identifinumber) {
			
		this.checkingaccount = checkingaccount;
		this.minusaccount = minusaccount;
		this.identifinumber = identifinumber;
	}
	
	public String getcheckingaccount() {
		
		return this.checkingaccount; 
	}
	
	public String getminusaccount() {
		
		return this.minusaccount; 
	}
	
	public int getidentifinumber() {
		
		return this.identifinumber;
	}
	
	
	
	public ArrayList<Account> account = new ArrayList<Account>();
	Scanner sc = new Scanner(System.in);	
	String freeaccount = "";
	int secretnumber = 0;
	int number = 0;
	int inputnumber = 0;
	
	public void freeaccountaddress(String freeaccount, String minusaccount) {
		
		//통장 고유번호부여
		secretnumber = secretnumber + 1;
		
		account.add(new Account(freeaccount, minusaccount, secretnumber-1) ); 
	}
	
	public void  closeaccount(int number) {
		
		System.out.println("계약해지할 통장이 자유입출금통장이면 0, 마이너스 통장이면 1  을입력하시오 ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			System.out.println("고유번호가 몇번입니까");
			inputnumber = sc.nextInt();
			account.remove(inputnumber).getcheckingaccount();
		}
		
		if(number == 1) 
		{
			System.out.println("고유번호가 몇번입니까");
			inputnumber = sc.nextInt();
			account.remove(inputnumber).getminusaccount();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}