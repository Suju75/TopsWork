package com.DataTypesVariablesandOperators;

// Create a calculator using arithmetic and relational operators
import com.PackagesAndAccessModifiers.*;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	AccessModifiers2 acc = new AccessModifiers2();
	
	System.out.println(acc.houseAddresss);
//	System.out.println(acc.pesonalAccBal);
//	System.out.println(acc.familyAccBal);
//	System.out.println(acc.housemembes);
	
		
		double num1,num2;
        int a=0;
		Scanner sc =  new Scanner(System.in);
		
		while(a==0) {
			System.out.println("Enter Number 1");
			num1=sc.nextInt();
			
			System.out.println("Enter Number 2");
			num2=sc.nextInt();
			
			
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Division");
			System.out.println("Enter 4 for Multiplication");
			System.out.println("Enter 5 for cheak Greater or Smaller Number");
				
			
			int calc;
			calc = sc.nextInt();
			
			switch(calc){
			
			case 1:
				System.out.println("The addition of "+num1+" and "+num2+" = "+(num1+num2));
				break;
				
			case 2:
				System.out.println("The Substraction of "+num1+" and "+num2+" = "+(num1-num2));
				break;
				
			case 3:
				System.out.println("The Division of "+num1+" and "+num2+" = "+(num1/num2));
				break;
				
			case 4:
				System.out.println("The Multiplication of "+num1+" and "+num2+" = "+(num1*num2));
				break;
				
			case 5:
				if(num1>num2) {
					System.out.println("Number 1 is greater then  num2:- "+ num1+ " is Greater");
				}else if(num2>num1){
					System.out.println("Number 2 is greater then num1:- "+num2+ " is Greter");
				}else {
					System.out.println("Number 1 is Equal to Number 2.");
				}
				
			}
			System.out.println("Do you Want to use again Calculator press : 0");
			a=sc.nextInt();
			
			
			
		}
		
	}


}
