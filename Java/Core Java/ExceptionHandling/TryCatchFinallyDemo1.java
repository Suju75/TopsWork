package com.ExceptionHandling;

import java.util.Scanner;

// Write a program to demonstrate exception handling using try-catch-finally .

public class TryCatchFinallyDemo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,num3;
		
		System.out.println("Enter numbers for divison.");
		
		System.out.println("Enter number 1.");
		num1=sc.nextInt();
		
		System.out.println("Enter number 2.");
		num2=sc.nextInt();
		
		
		num3=num1/num2;
		
		
		
		
		int num4 = (int) num1;
		int num5 = (int) num2;
		int num6 = (int) num3;
		
		
		
		if(num5==0) {	
			
			try {
		     num6 =num4/num5;
				System.out.println(num6);
				
			}catch(ArithmeticException e){
				
				//e.printStackTrace();
			}
			
			finally {
				
				System.out.println("Division by 0 is not possible.");
			}
			
		}else {
			System.out.println("The division of num1 and num2 is : "+num3);
		}
		
		
		
	
		
	}

}
