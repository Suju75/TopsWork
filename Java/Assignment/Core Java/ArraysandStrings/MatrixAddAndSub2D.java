package com.ArraysandStrings;

import java.util.Scanner;

public class MatrixAddAndSub2D {
	public static void main(String[] args) {
		
		int[][] a=new int [3][3];
		int[][] b=new int [3][3];
		int[][] c=new int [3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("For a");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Enter a value");
				
				a[i][j]=scanner.nextInt();
				
			}
			
		}
		
		System.out.println("For b");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println("Enter a value");
				
				b[i][j]=scanner.nextInt();
				
			}
			
		}
		
         System.out.println("For Sum");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
				
				
			}
		}
		
		System.out.println("Sum is:");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(" "+c[i][j]);
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		  System.out.println("For Substaction");
			
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					c[i][j]=a[i][j]-b[i][j];
					
					
				}
			}
			
			System.out.println("Sum is:");
			
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					System.out.print(" "+c[i][j]);
					
				}
				
				System.out.println();
			}
			
		
	}
}


