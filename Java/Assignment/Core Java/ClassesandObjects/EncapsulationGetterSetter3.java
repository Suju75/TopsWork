package com.ClassesandObjects;

// Implement a simple class with getters and setters for encapsulation.

class Encap{
	private int id;
	private String name;
	private int age;
	
	public void setData() {
		id=123;
		name="Roshan Gupta";
		age=21;
		
	}
	
	public void getData() {
		System.out.println("My id is : "+id);
		System.out.println("My name is : "+name);
		System.out.println("My age is : "+age);
		
	}
}

public class EncapsulationGetterSetter3 {
	public static void main(String[] args) {
		Encap e=new Encap();
		
		e.setData();
		e.getData();
	}

}
