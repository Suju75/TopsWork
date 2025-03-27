package com.ExceptionHandling;

import java.util.Scanner;

class ExceptionHandle extends Exception{
	double amount;
	
	public ExceptionHandle(double amount) {
		this.amount=amount;
	}
	
}

class Bank{
	double amount,balance=1000;
	
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposited amount is "+amount+"Rs..."+"\n Your Updated Balance is "+balance);
		
	}
	public void withdraw(double amount) throws ExceptionHandle,ArithmeticException {
		if(amount <= balance) {
			balance-=amount;
			System.out.println("Withdrawal amount is "+amount+"Rs..."+"\n Your Updated Balance is "+balance);
			
		}else {
			double needs=amount-balance;
			throw new ExceptionHandle(needs);
		}
		
	}
}

public class ThrowThows3 {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
	
		double amount;
		
		System.out.println("Enter Amount for deposite: ");
		amount=sc.nextDouble();
		b.deposite(amount);
		

		System.out.println("Enter Amount for Withdrawal: ");
		amount=sc.nextDouble();
		try {
			b.withdraw(amount);
		} 
//		catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		catch (ExceptionHandle e) {
			// TODO Auto-generated catch block
			System.out.println("If you deposite "+e.amount+" Rs then you can withdraw "+amount+" Rs");
		}
		
		
	}

}
