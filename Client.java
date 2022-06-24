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
		
		System.out.println("자유입출금통장이면 0, 마이너스 통장이면 1  을입력하시오 ");
		number = sc.nextInt();
		
		if(number == 0)
		{

			System.out.println("입금할금액을 입력하시오");
			firstmoney = sc.nextInt();

			inputfirstmoney = inputfirstmoney + firstmoney;
			inputsecondmoney = inputsecondmoney + secondmoney; 
						
			accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
			
			firstmoney = 0;
			secondmoney = 0;
			

		
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add(new String("자유통장입금"+ inputfirstmoney +"원") );
		}
		
		if(number == 1) 
		{			
			System.out.println("입금할금액을 입력하시오");
			secondmoney = sc.nextInt();

			
			inputfirstmoney = inputfirstmoney + firstmoney;
			inputsecondmoney = inputsecondmoney + secondmoney;
			
			firstmoney = 0;
			secondmoney = 0;
			
			
			accountmoney.add(identifinumber, new Client(inputfirstmoney, inputsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("마이너스통장입금"+ inputsecondmoney + "원" );
			
		}
	}	
		
	public void withdraw(int identifinumber) {
		
		System.out.println("자유입출금통장이면 0, 마이너스 통장이면 1  을입력하시오 ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			
			
			System.out.println("출금할금액을 입력하시오");
			firstmoney = sc.nextInt();
			
			outfirstmoney = outfirstmoney - firstmoney;
			 
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("자유통장출금"+outfirstmoney+"원");
		}
		
		if(number == 1) 
		{
			
			System.out.println("출금할금액을 입력하시오");
			secondmoney = sc.nextInt();
			
			outsecondmoney = outsecondmoney - secondmoney;
			
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );
			
			period.add(new ArrayList<String>() );
			period.get(identifinumber).add("마이너스통장출금"+outsecondmoney+"원");
		}
	}
		
	//계좌이체
	public void accounttransfer(int identifinumber) {
		
		System.out.println("이체할 통장이 자유입출금통장이면 0, 마이너스 통장이면 1  을입력하시오 ");
		number = sc.nextInt();
		
		if(number == 0)
		{
			System.out.println("이체할금액을 입력하시오");
			firstmoney = sc.nextInt();
			
			outfirstmoney = outfirstmoney - firstmoney;
			
			accountmoney.add(number,new Client(outfirstmoney, outsecondmoney) );
			
			System.out.println("이체받을통장이 자유입출금통장이면 0 마이너스 통장이면 1을입력하시오");
			number = sc.nextInt();
			
			if(number==0)
			{
				System.out.println("고유번호가 몇번입니까");
				identifinumber = sc.nextInt();
				
				inputfirstmoney = inputfirstmoney + firstmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, outsecondmoney) );
				
				period.get(identifinumber).add("자유통장에서 자유통장으로 계좌이체"+firstmoney+"원");
			}
			
			if(number==1)
			{
				System.out.println("고유번호가 몇번입니까");
				identifinumber = sc.nextInt();
				
				inputsecondmoney = inputfirstmoney + firstmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
				
				period.get(identifinumber).add("자유통장에서 마이너스통장으로 계좌이체"+firstmoney+"원");
			}
			
			
		}
		
		if(number == 1) 
		{
			System.out.println("이체할금액을 입력하시오");
			secondmoney = sc.nextInt();
			
			outsecondmoney = outsecondmoney - secondmoney;
			
			accountmoney.add(identifinumber,new Client(outfirstmoney, outsecondmoney) );

			System.out.println("이체받을통장이 자유입출금통장이면 0 마이너스 통장이면 1을입력하시오");
			number = sc.nextInt();
			
			if(number==0)
			{
				System.out.println("고유번호가 몇번입니까");
				identifinumber = sc.nextInt();
				
				inputfirstmoney = inputfirstmoney + secondmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, outsecondmoney) );
				
				period.get(identifinumber).add("마이너스통장에서 자유통장으로 계좌이체"+secondmoney+"원");
			}
			
			if(number==1)
			{
				System.out.println("고유번호가 몇번입니까");
				identifinumber = sc.nextInt();
				
				inputsecondmoney = inputfirstmoney + secondmoney;
				accountmoney.add(identifinumber,new Client(inputfirstmoney, inputsecondmoney) );
				
				period.get(identifinumber).add("마이너스통장에서 마이너스통장으로 계좌이체"+secondmoney+"원");
			}
		}
	}		
		
	public void showbalance(int identifinumber) {
		
		System.out.println(accountmoney.get(identifinumber).getfreemoney() );
		System.out.println(accountmoney.get(identifinumber).getminusmoney() );
	
	}
		
	public void showstatement() {
		
		period.add(new ArrayList<String>() );
	
		System.out.println("보고싶은 통장의 고유번호를 쓰시오");
		
		number = sc.nextInt();
		
		for(int i=0; i<period.get(number).size(); i++)
		{
			System.out.println(period.get(number).get(i) );		
		}
	
	}

}
