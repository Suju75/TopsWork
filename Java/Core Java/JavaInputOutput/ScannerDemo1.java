package com.JavaInputOutput;

import java.util.Scanner;

//1) Write a program to read input from the console using Scanner.

public class ScannerDemo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		
		System.out.println("Enter Numbers to perform Arthmatic Oprations.\n");
		System.out.print("Enter number 1:- ");
		num1=sc.nextDouble();
		System.out.print("Enter number 2:- ");
		num2=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Addition :- "+(num1+num2));
		System.out.println("Substraction :- "+(num1-num2));
		System.out.println("Multiplication :- "+(num1*num2));
		System.out.println("Division :- "+(num1/num2));
		System.out.println("Mod :- "+(num1%num2));
		
		
	}

}
