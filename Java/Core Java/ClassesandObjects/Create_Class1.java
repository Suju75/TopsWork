package com.ClassesandObjects;

class Student{
	String name;
	int age;
	
	public void getData() {
		name = "Roshan";
		age = 21;
	}
	public void showData() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		
	}
	
}


public class Create_Class1 {
public static void main(String[] args) {
		
		Student s = new Student();
		
		s.getData();
		s.showData();
	}

}
