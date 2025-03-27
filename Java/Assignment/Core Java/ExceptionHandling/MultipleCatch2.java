package com.ExceptionHandling;

import java.util.Scanner;

// Implement multiple catch blocks for different types of exceptions.
public class MultipleCatch2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		try {

			int num1 = 20, num2 = 0, num3;

			num3 = num1 / num2;

			System.out.println(num3);

			int[] arr = new int[4];

			System.out.println("Enter value of arr.");

			for (int i = 0; i <= arr.length; i++) {

				arr[i] = sc.nextInt();

				System.out.println(arr[i]);
			}

		} catch (ArithmeticException e) {
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("done");

	}
}
