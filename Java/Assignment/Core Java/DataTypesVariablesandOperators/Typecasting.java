package com.DataTypesVariablesandOperators;

// Demonstrate type casting (explicit and implicit)

public class Typecasting {
public static void main(String[] args) {
		
		//Integer into double
		
		int a = 10;
		double b = a;
		System.out.println(b);
		
		//double into Integer
		
		double z = 50.0;
		int c = (int) z;
		System.out.println(c);
		
		//long into int
		
		long num=123456678;
		int num1=(int)num;
		System.out.println(num1);
		
		//float into into int
		
		float aa = 100.00f;
		int bb = (int) aa;
		System.out.println(bb);
		
		//String into int
		
		String  number = "100";
		System.out.println(100+number);
		System.out.println(Integer.parseInt(number)+100);
		
		//String into Double
		
		System.out.println(Double.parseDouble(number)+300);
		
		//Byte into int
		
		byte aaaa= 10;
		int bbbbb = aaaa;
		System.out.println(bbbbb);
		
		// int into string
		
		int num3 = 500;
		String str = Integer.toString(num3);
		System.out.println(str);
		System.out.println(str+100);
		
		System.out.println("\n\n\n");
		//familyAcc demoAccessModifiers=new familyAcc();
	//	demoAccessModifiers.setData();
	//	demoAccessModifiers.show();
//		
//		//System.out.println("Private variable "+demoAccessModifiers.pesonalAccBal);
//		System.out.println("\n\n\n"+"Protected variable "+demoAccessModifiers.familyAccBal);
//		System.out.println("Public variable "+demoAccessModifiers.houseAddresss);
//		System.out.println("default variable "+demoAccessModifiers.housemembes);
//		
		
		
		
		
		
		
	}


}
