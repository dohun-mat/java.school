package com.java.Bank;

import java.util.Scanner;

public class Test {
	static String name = "";
	static String address = "";
	static String phonenumber = "";
	static String creditrating = "";
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void clientinput() {
		
		System.out.println("고객이름을쓰시오");
		name = sc.nextLine();
		System.out.println("고객주소를쓰시오");
		address = sc.nextLine();
		System.out.println("고객핸드폰번호를쓰시오");
		phonenumber = sc.nextLine();
		System.out.println("고객신용등급을쓰시오");
		creditrating = sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		String freeaccount = "";
		String minusaccount = "";
		int number = 0;
		int identifinumber = 0;	
		int firstmoney = 0;
		
		
		
	Teller teller = new Teller();
	//고객정보추가	
	clientinput();
	
	teller.samename();
	
	if( teller.samename() == false) 
	{
		teller.openaccount(name, address, phonenumber, creditrating);
	}
	
	System.out.println("확인하고자하는이름을 적으시오");
	name = sc.nextLine();
	
	teller.showclient(name);
	
			
	Account account = new Account();
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("만들 자유입출금 계좌번호를 쓰시오");
	freeaccount = sc.nextLine();
	
	System.out.println("만들 마이너스통장 계좌번호를 쓰시오");
	minusaccount = sc.nextLine();
	
	account.freeaccountaddress(freeaccount, minusaccount);
	
	System.out.println(account.account.get(0).getcheckingaccount() );
	
	account.closeaccount(number);

	Client client = new Client();
	
	System.out.println("고유번호가 몇번입니까");
	identifinumber = sc.nextInt();
	
	client.deposit(identifinumber);
	
	System.out.println("고유번호가 몇번입니까");
	identifinumber = sc.nextInt();
	
	client.withdraw(identifinumber);
	
	System.out.println("고유번호가 몇번입니까");
	identifinumber = sc.nextInt();
	
	client.accounttransfer(identifinumber);	
	
	
	
	System.out.println("고유번호가 몇번입니까");
	identifinumber = sc.nextInt();
	
	client.showbalance(identifinumber);
	
	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	client.showstatement();
		
		
		
		
		
		
	}

}
