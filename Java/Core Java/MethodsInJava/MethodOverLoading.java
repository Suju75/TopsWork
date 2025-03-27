package com.MethodsInJava;

class Overload{
	
	private int id;
	private String name;
	private int age;
	private String Bloodgroup;
	
	public void name(int id) {
		this.id=id;
		System.out.println("My id is : "+id);
		
	}
	
	public void name(String name) {
		this.name=name;
		System.out.println("My name is : "+name);
	}
	
	public void name(int age,String Bloodgroup) {
		this.age=age;
		this.Bloodgroup=Bloodgroup;
		
		System.out.println("My age is : "+age);
		System.out.println("My Blood group is : "+Bloodgroup);
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		
		Overload O = new Overload();
		
		O.name(123);
		O.name("Roshan");
		O.name(21, "A+");
	}

}
