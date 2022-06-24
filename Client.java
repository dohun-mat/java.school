package com.java.Bank;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.classout.Teacher;

public class Client {
	private int freemoney = 0;
	private int minusmoney = 0;
	
	public Client() {
		
	}
	
	public Client(int freemoney, int minusmoney) {
		
		this.freemoney = freemoney;
		this.minusmoney = minusmoney;
	}
	
	public int getfreemoney() {
		
		return this.freemoney;
	}
	
	public int getminusmoney() {
		
		return this.minusmoney;
	}
	
	public ArrayList<Client> accountmoney= new ArrayList<Client>();
	public ArrayList<ArrayList<String>> period = new ArrayList<ArrayList<String>>();
	
	Scanner sc = new Scanner(System.in);
	
	int number = 0;
	int firstmoney = 0;
	int secondmoney = 0;
	int inputfirstmoney = 0;
	int inputsecondmoney = 0;
	int outfirstmoney = 0;
	int outsecondmoney = 0;
	int inputnumber = 0;
	
	public void deposit(int identifinumber) {
		
		System.out.println("��������������̸� 0, ���̳ʽ� �����̸� 1  ���Է��Ͻÿ� ");
		number = sc.nextInt();
		
		if(number == 0)
		{

			System.out.println("�Ա��ұݾ��� �Է��Ͻÿ�");
			firstmoney = sc.nextInt();

			inputfirstmoney = inputfirstmoney + firstmoney;
			inputsecondmoney = inputsecondmoney + secondmoney; 
						
			accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
			
			firstmoney = 0;
			secondmoney = 0;
			

		
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add(new String("���������Ա�"+ inputfirstmoney +"��") );
		}
		
		if(number == 1) 
		{			
			System.out.println("�Ա��ұݾ��� �Է��Ͻÿ�");
			secondmoney = sc.nextInt();

			
			inputfirstmoney = inputfirstmoney + firstmoney;
			inputsecondmoney = inputsecondmoney + secondmoney;
			
			firstmoney = 0;
			secondmoney = 0;
			
			
			accountmoney.add(identifinumber, new Client(inputfirstmoney, inputsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("���̳ʽ������Ա�"+ inputsecondmoney + "��" );
			
		}
	}	
		
	public void withdraw(int identifinumber) {
		
		System.out.println("��������������̸� 0, ���̳ʽ� �����̸� 1  ���Է��Ͻÿ� ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			
			
			System.out.println("����ұݾ��� �Է��Ͻÿ�");
			firstmoney = sc.nextInt();
			
			outfirstmoney = outfirstmoney - firstmoney;
			 
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("�����������"+outfirstmoney+"��");
		}
		
		if(number == 1) 
		{
			
			System.out.println("����ұݾ��� �Է��Ͻÿ�");
			secondmoney = sc.nextInt();
			
			outsecondmoney = outsecondmoney - secondmoney;
			
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("���̳ʽ��������"+outsecondmoney+"��");
		}
	}
		
	//������ü
	public void accounttransfer(int identifinumber) {
		
		System.out.println("��ü�� ������ ��������������̸� 0, ���̳ʽ� �����̸� 1  ���Է��Ͻÿ� ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			System.out.println("��ü�ұݾ��� �Է��Ͻÿ�");
			firstmoney = sc.nextInt();
			
			outfirstmoney = outfirstmoney - firstmoney;
			
			accountmoney.add(number,new Client(outfirstmoney, outsecondmoney) );
			
			System.out.println("��ü���������� ��������������̸� 0 ���̳ʽ� �����̸� 1���Է��Ͻÿ�");
			number = sc.nextInt();
			
			if(number==0)
			{
				System.out.println("������ȣ�� ����Դϱ�");
				identifinumber = sc.nextInt();
				
				inputfirstmoney = inputfirstmoney + firstmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, outsecondmoney) );
				
				period.get(identifinumber).add("�������忡�� ������������ ������ü"+firstmoney+"��");
			}
			
			if(number==1)
			{
				System.out.println("������ȣ�� ����Դϱ�");
				identifinumber = sc.nextInt();
				
				inputsecondmoney = inputfirstmoney + firstmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
				
				period.get(identifinumber).add("�������忡�� ���̳ʽ��������� ������ü"+firstmoney+"��");
			}
			
			
		}
		
		if(number == 1) 
		{
			System.out.println("��ü�ұݾ��� �Է��Ͻÿ�");
			secondmoney = sc.nextInt();
			
			outsecondmoney = outsecondmoney - secondmoney;
			
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );

			System.out.println("��ü���������� ��������������̸� 0 ���̳ʽ� �����̸� 1���Է��Ͻÿ�");
			number = sc.nextInt();
			
			if(number==0)
			{
				System.out.println("������ȣ�� ����Դϱ�");
				identifinumber = sc.nextInt();
				
				inputfirstmoney = inputfirstmoney + secondmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, outsecondmoney) );
				
				period.get(identifinumber).add("���̳ʽ����忡�� ������������ ������ü"+secondmoney+"��");
			}
			
			if(number==1)
			{
				System.out.println("������ȣ�� ����Դϱ�");
				identifinumber = sc.nextInt();
				
				inputsecondmoney = inputfirstmoney + secondmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
				
				period.get(identifinumber).add("���̳ʽ����忡�� ���̳ʽ��������� ������ü"+secondmoney+"��");
			}
		}
	}		
		
	public void showbalance(int identifinumber) {
		
		System.out.println(accountmoney.get(identifinumber).getfreemoney() );
		System.out.println(accountmoney.get(identifinumber).getminusmoney() );
	
	}
		
	public void showstatement() {
		
		period.add(new ArrayList<String>() );
	
		System.out.println("������� ������ ������ȣ�� ���ÿ�");
		
		number = sc.nextInt();
		
		for(int i=0; i<period.get(number).size(); i++)
		{
			System.out.println(period.get(number).get(i) );		
		}
	
	}

}
