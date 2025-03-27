package com.ControlFlowStatements;

// Implement a simple menu-driven program using a switch-case.
import java.util.*;
public class Switchcase {
	public static void main(String [] args) {
		double Balence =100000,withdrawal,deposite,Updatedbal;
		int atm;
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Withdraw the money");
		System.out.println("2. deposite money");
		System.out.println("3. cheak Balence");
		System.out.println("4. Exit");
		
		
		
		System.out.println("Press button to perform task");
		atm = sc.nextInt();
		
		
		if(atm==4) {
			System.out.println("Thank you");
			break;
		}
		
		switch(atm) {
		case 1:
			System.out.println("Enter Amount To Withdraw");
			withdrawal = sc.nextDouble();
			if(withdrawal <= Balence) {
			Updatedbal = Balence - withdrawal;
			System.out.println("Withdrawal Succeful reaming Balence is: "+Updatedbal);
			}else {
				System.out.println("Invalid amount please cheak balance\n\n");
			}
			break;
			
			case 2:
				System.out.println("Enter Amount To Deposite");
				deposite = sc.nextDouble();
				Updatedbal = Balence + deposite;
				System.out.println("Deposite Succeful updated Balence is: "+Updatedbal);
				break;
				
			case 3:
				System.out.println("Balence is:"+Balence);
				break;
				
			default:
				System.out.println("Invalid option try again");
				
				
			}
		}
			
		}


}
