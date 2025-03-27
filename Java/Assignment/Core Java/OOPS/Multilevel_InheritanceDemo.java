package com.OOPS;

//Create a class hierarchy and demonstrate multilevel inheritance.
class GrandFather{
	String name;
	int age;
	
	public void setData() {
		name="Vindeshwari prasad";
		age=70;
		
	}
	
	
}
class Father extends GrandFather{
	String name1;
	int age1;
	
	
	public void setData1() {
		name1= "Vinay Gupta";
		age1= 47;
	}
	
	
}
class Child extends Father{
	String name2;
	int age2;
	
	public void setData2() {
		name2="Roshan gupta";
		age2=21;
	}
	
	public void disPlay() {
		System.out.println("Grand Father name is "+name);
		System.out.println("Grand Father age is"+age);
		System.out.println("Father name is "+name1);
		System.out.println("Father age is "+age1);
		System.out.println("Child name is "+name2);
		System.out.println("Child age is "+age2);
		
	}
}

public class Multilevel_InheritanceDemo {
	public static void main(String[] args) {
		
		Child ch= new Child();
		
		ch.setData();
		ch.setData1();
		ch.setData2();
		ch.disPlay();
	}

}
