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
		
		//���� ������ȣ�ο�
		secretnumber = secretnumber + 1;
		
		account.add(new Account(freeaccount, minusaccount, secretnumber-1) ); 
	}
	
	public void  closeaccount(int number) {
		
		System.out.println("��������� ������ ��������������̸� 0, ���̳ʽ� �����̸� 1  ���Է��Ͻÿ� ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			System.out.println("������ȣ�� ����Դϱ�");
			inputnumber = sc.nextInt();
			account.remove(inputnumber).getcheckingaccount();
		}
		
		if(number == 1) 
		{
			System.out.println("������ȣ�� ����Դϱ�");
			inputnumber = sc.nextInt();
			account.remove(inputnumber).getminusaccount();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}