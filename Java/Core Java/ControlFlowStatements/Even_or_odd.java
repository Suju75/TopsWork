package com.ControlFlowStatements;

import java.util.*;
//  Write a program to find if a number is even or odd using an if-else statement
public class Even_or_odd {
	public static void main (String [] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any number to find number is odd or even: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even :  "+num);
		}else {
			System.out.println("Number is odd :  "+num);
		}
		
		
	}

}
