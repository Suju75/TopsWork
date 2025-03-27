package com.ClassesandObjects;

class Name{
	
	Name(int a){
		System.out.println(a);
		
		
	}
	
	Name(String b){
		System.out.println(b);
		
	}
	
	Name(double c){
		System.out.println(c);
	}
}



public class CreateMultiplConstructors2 {
	
public static void main(String[] args) {
		
		Name n = new Name(100);
		Name n1 = new Name("Roshan");
		Name n2 = new Name(100);
	}


}
