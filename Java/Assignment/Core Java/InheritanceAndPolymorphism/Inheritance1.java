package com.InheritanceAndPolymorphism;

import com.PackagesAndAccessModifiers.AccessModifiers2;

// Write a program that demonstrates inheritance using extends keyword.

class School{
	String name;
	String std;
	char div;
	
	public void setData() {
		name="Manish";
		std="12th";
		div='D';	
	}
	
}

class College extends School{
	String name1;
	String year;
	String course;
	
	public void setData1() {
		name1= "Roshan";
		year = "2nd";
		course = "BCA";
		
	}
	
	public void disPlay() {
		System.out.println("School Student name is "+name1);
		System.out.println("Study in "+std+" Standard");
		System.out.println("Division is "+div);
		System.out.println("College Student name is "+name);
		System.out.println("Study in "+year+ "year");
		System.out.println("Course is "+course);
		
	}
}

class New extends AccessModifiers2{
	
	public void display1() {
		System.out.println(familyAccBal);
	}
	
}


public class Inheritance1 {
	public static void main(String[] args) {
		New n=new New();
		n.display1();
		  
		College college=new College();
		
		college.setData();
		college.setData1();
		college.disPlay();
	}


}
