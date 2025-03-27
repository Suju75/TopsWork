package com.MethodsInJava;

import java.util.Scanner;

// Write a program to find the maximum of three numbers using a method.

public class Maximumofthree1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("To find the Maximum Number from Three number Enter the numbers: \n\n");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Number 1 is Greatter.");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Number 2 is Greatter.");
		}else {
			System.out.println("Number 3 is Greatter.");
		}
	}

}
