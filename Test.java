package com.java.Bank;

import java.util.Scanner;

public class Test {
	static String name = "";
	static String address = "";
	static String phonenumber = "";
	static String creditrating = "";
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void clientinput() {
		
		System.out.println("���̸������ÿ�");
		name = sc.nextLine();
		System.out.println("���ּҸ����ÿ�");
		address = sc.nextLine();
		System.out.println("���ڵ�����ȣ�����ÿ�");
		phonenumber = sc.nextLine();
		System.out.println("���ſ��������ÿ�");
		creditrating = sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		String freeaccount = "";
		String minusaccount = "";
		int number = 0;
		int identifinumber = 0;	
		int firstmoney = 0;
		
		
		
	Teller teller = new Teller();
	//�������߰�	
	clientinput();
	
	teller.samename();
	
	if( teller.samename() == false) 
	{
		teller.openaccount(name, address, phonenumber, creditrating);
	}
	
	System.out.println("Ȯ���ϰ����ϴ��̸��� �����ÿ�");
	name = sc.nextLine();
	
	teller.showclient(name);
	
			
	Account account = new Account();
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("���� ��������� ���¹�ȣ�� ���ÿ�");
	freeaccount = sc.nextLine();
	
	System.out.println("���� ���̳ʽ����� ���¹�ȣ�� ���ÿ�");
	minusaccount = sc.nextLine();
	
	account.freeaccountaddress(freeaccount, minusaccount);
	
	System.out.println(account.account.get(0).getcheckingaccount() );
	
	account.closeaccount(number);

	Client client = new Client();
	
	System.out.println("������ȣ�� ����Դϱ�");
	identifinumber = sc.nextInt();
	
	client.deposit(identifinumber);
	
	System.out.println("������ȣ�� ����Դϱ�");
	identifinumber = sc.nextInt();
	
	client.withdraw(identifinumber);
	
	System.out.println("������ȣ�� ����Դϱ�");
	identifinumber = sc.nextInt();
	
	client.accounttransfer(identifinumber);	
	
	
	
	System.out.println("������ȣ�� ����Դϱ�");
	identifinumber = sc.nextInt();
	
	client.showbalance(identifinumber);
	
	System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	client.showstatement();
		
		
		
		
		
		
	}

}
