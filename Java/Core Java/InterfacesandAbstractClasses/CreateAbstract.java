package com.InterfacesandAbstractClasses;

abstract class Bank{
	double balance;
	long bankAccountnumber;
	String accountHolderName;
	public abstract void BankAccount(); 
	
}

class Saving extends Bank{
	public void BankAccount() {
		 balance = 50000;
		 bankAccountnumber=5969498875868L;
		 accountHolderName="Kishan Mistry";
		
	}
	public void disPlay() {
		System.out.println("Account Balance is "+balance);
		System.out.println("Account number is "+bankAccountnumber);
		System.out.println("Account Holder Name is "+accountHolderName);
		
	}
}

public class CreateAbstract {
	public static void main(String[] args) {
		
		Saving s = new Saving();
		
		s.BankAccount();
		s.disPlay();
	}

}
