package com.InterfacesandAbstractClasses;

import java.util.Scanner;

class Payments implements PaymentGetway{
	double account_balance = 50000;
	double credit_card = 50000;
	int tr = 1;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		String upi_id;
		double amount;
		String mobile_number;
		String ifsc_code;
		String account_holdername;
		int account_number;
		
		System.out.println("For send the money choose the option you want to pay.");
		
		System.out.println();
		
		System.out.println("1:- For Send money by UPI ID.");
		System.out.println("2:- For Send money by Phone number.");
		System.out.println("3:- For Send money by net banking.");
		System.out.println("4:- For cheak Account Balance.");
		
		int a;
		a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Send money by UPI ID.");
			System.out.println();
			System.out.println("Enter Upi Id for Send Money.");
			upi_id = sc.next();
			System.out.println("Enter Amount for send money.");
			amount = sc.nextDouble();
			
			if(amount <= account_balance) {
				account_balance -= amount;
			}else {
				System.out.println("Plese cheak your balance.");
			}
			break;
		case 2:
			System.out.println("Send money by Phone number.");
			System.out.println();
			System.out.println("Enter Mobile Number for Send Money.");
			mobile_number = sc.next();
			System.out.println("Enter Amount for send money.");
			amount = sc.nextDouble();
			
			if(amount <= account_balance) {
				account_balance -= amount;
			}else {
				System.out.println("Plese cheak your balance.");
			}
			break;
		case 3:
			System.out.println("Send money by net banking.");
			System.out.println();
			System.out.println("Enter Account holder name.");
			account_holdername = sc.next();
			System.out.println("Enter Account for Send Money.");
			account_number = sc.nextInt();
			System.out.println("Enter IFSC CODE.");
			ifsc_code = sc.next();
			System.out.println("Enter Amount for send money.");
			amount = sc.nextDouble();
			
			if(amount <= account_balance) {
				account_balance -= amount;
			}else {
				System.out.println("Plese cheak your balance.");
			}
			break;
		case 4:
			System.out.println("Your balance in Bank Account is "+account_balance);
			break;
		default:
			System.out.println("Please choose Valid Option.");
		}
			
	}

	@Override
	public void Paybills() {
		// TODO Auto-generated method stub
		int bill;
		int via;
		double amount;
		String mobileL;
		
		System.out.println("For pay the bill choose the option which bill you want pay.");
		
		System.out.println();
		
		System.out.println("1:- For Pay Phone bill.");
		System.out.println("2:- For Pay credit card bill.");
		System.out.println("3:- For pay electricity bill.");
		System.out.println("4:- For pay gas bill.");
		System.out.println("5:- For pay Water bill.");
		System.out.println("6:- For cheak credit card limit.");
		
		bill = sc.nextInt();
		
		switch(bill) {
		case 1:
			System.out.println("For Pay Phone bill.");
			System.out.println();
			System.out.println("1:- Via bank account or Debit Card.");
			System.out.println("2:- Via crdidt card");
			via = sc.nextInt();
			switch(via) {
			case 1:
				System.out.println("Via bank account or Debit Card.");
				System.out.println("Enter Mobile number");
				mobileL = sc.next();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <=  account_balance) {
					 account_balance -= amount;
				}else {
					System.out.println("card limit is Exceeded please cheak your card limit.");
				}
				break;
			case 2:
				System.out.println("Via crdidt card");
				System.out.println("Enter Mobile number");
				mobileL = sc.next();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <= credit_card) {
					credit_card -= amount;
				}else {
					System.out.println("Please cheak your account balance.");
				}
				break;
			}
			break;
		case 2:
			System.out.println("For Pay credit card bill");
			System.out.println();
			System.out.println("1:- Via bank account or Debit Card.");
			via = sc.nextInt();
			switch(via) {
			case 1:
				System.out.println("Via bank account or Debit Card.");
				System.out.println("Enter Credit Card Number");
				long creditcardnumber=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <= account_balance) {
					account_balance -= amount;
				}else {
					System.out.println("Please cheak your account balance.");
				}
				break;
			}
			
			break;
		case 3:
			System.out.println(" For pay electricity bill.");
			System.out.println();
			System.out.println("1:- Via bank account or Debit Card.");
			System.out.println("2:- Via crdidt card");
			via = sc.nextInt();
			switch(via) {
			case 1:
				System.out.println("Via bank account or Debit Card.");
				System.out.println("Enter consumer number.");
				int cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <=  account_balance) {
					 account_balance -= amount;
				}else {
					System.out.println("card limit is Exceeded please cheak your card limit.");
				}
				break;
			case 2:
				System.out.println("Via crdidt card");
				System.out.println("Enter consumer number.");
			    cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <= credit_card) {
					credit_card -= amount;
				}else {
					System.out.println("Please cheak your account balance.");
				}
				break;
			}
			
			break;
		case 4:
			System.out.println("For pay gas bill.");
			System.out.println();
			System.out.println("1:- Via bank account or Debit Card.");
			System.out.println("2:- Via crdidt card");
			via = sc.nextInt();
			switch(via) {
			case 1:
				System.out.println("Via bank account or Debit Card.");
				System.out.println("Enter consumer number.");
				int cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <=  account_balance) {
					 account_balance -= amount;
				}else {
					System.out.println("card limit is Exceeded please cheak your card limit.");
				}
				break;
			case 2:
				System.out.println("Via crdidt card");
				System.out.println("Enter consumer number.");
			    cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <= credit_card) {
					credit_card -= amount;
				}else {
					System.out.println("Please cheak your account balance.");
				}
				break;
			}
			
			break;
		case 5:
			System.out.println("For pay Water bill.");
			System.out.println();
			System.out.println("1:- Via bank account or Debit Card.");
			System.out.println("2:- Via crdidt card");
			via = sc.nextInt();
			switch(via) {
			case 1:
				System.out.println("Via bank account or Debit Card.");
				System.out.println("Enter consumer number.");
				int cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <=  account_balance) {
					 account_balance -= amount;
				}else {
					System.out.println("card limit is Exceeded please cheak your card limit.");
				}
				break;
			default:
				System.out.println("Please choose Valid Option.");
			case 2:
				System.out.println("Via crdidt card");
				System.out.println("Enter consumer number.");
				cnum=sc.nextInt();
				System.out.println("Enter bill amout to pay.");
				amount = sc.nextDouble();
				if(amount <= credit_card) {
					credit_card -= amount;
				}else {
					System.out.println("Please cheak your account balance.");
				}
				break;
			}
			
			break;
		case 6:
			System.out.println("Credit card limit reaming is "+credit_card);
			break;
		default:
			System.out.println("Please choose Valid Option.");
		}
	}
	
}

public class PhonePay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		int tru=1;
		Payments p = new Payments();
		
		while(tru==1) {
			System.out.println("Enter option for which function you want to use.");
			System.out.println();
			System.out.println("1:- For send money.");
			System.out.println("2:- For pay bills.");
			b=sc.nextInt();
			
			switch(b) {
			case 1:
				p.sendMoney();
				break;
			case 2:
				p.Paybills();
				break;
			default:
				System.out.println("Invalid option plese enetr valid option.");
		}
			
				
				
			System.out.println("If you want to reuse the function enter 1 to stop the function enter any other number.");
			tru=sc.nextInt();
			
		
		}	
	}
}
