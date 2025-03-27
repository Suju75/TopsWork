package com.Constructors;

//Write a program to create and initialize an object using a parameterized constructor.

class Paraconst{
	
	public Paraconst(int num,String name,double salary){
		System.out.println("Employee Id Number:- "+num);
		System.out.println("Employee name is:- "+name);
		System.out.println("Employee Salasry is:- "+salary);
		
	}
}
public class Parameterizedonstructor1 {
	public static void main(String[] args) {
		
		Paraconst paraconst= new Paraconst(1,"Roshan", 35000);
	}

}
