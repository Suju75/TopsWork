package com.ArraysandStrings;

import java.util.Scanner;

//Create a program to reverse a string and check for palindrom.

public class ReverseString2 {
	public static void main(String[] args) {
		
		String str;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any String for reverse.");
		str=sc.nextLine();
		
		StringBuilder reverse = new StringBuilder(str).reverse();
		
		System.out.println(reverse);
		
		
	}

}
