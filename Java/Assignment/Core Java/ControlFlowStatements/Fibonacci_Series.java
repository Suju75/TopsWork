package com.ControlFlowStatements;

import java.util.*;
public class Fibonacci_Series {
	public static void main(String[] args) {
		int term;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the term you want series:");
		term = sc.nextInt();
		
		int num1=0;
		int num2=1;
		
		
		
		
		for(int i=0; i <= term ;i++) {
			System.out.print(num1+" ");
			int num3=num1+num2;
			
			num1=num2;
			num2=num3;
			
		}
		
		
		
	}


}
