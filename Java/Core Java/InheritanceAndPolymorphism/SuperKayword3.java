package com.InheritanceAndPolymorphism;


class Papa1{
	
	 String name1;
	 int age1;
	 int height1;
	
	public Papa1(String name, int age,int height) {
		name1=name;
		age1=age;
		height1=height;
	
		
	}
	
	public void show() {
		System.out.println("Papa");
		System.out.println("Papa name is "+name1);
		System.out.println("Papa age is "+age1);
		System.out.println("Papa height is "+height1);
		
	}
}


class Beta1 extends Papa1{
	String name1;
	 int age1;
	 int height1;
	
	public Beta1(String name, int age,int height) {
	super("Vinay", 47, 5);
		name1=name;
		age1=age;
		height1=height;	
	
}
	
	public void show() {
		super.show();
		System.out.println("Beta");
		System.out.println("beta name is "+name1);
		System.out.println("beta age is "+age1);
		System.out.println("beta height is "+height1);
		
	}
	
}
public class SuperKayword3 {
public static void main(String[] args) {
		
		Beta1 beta1=new Beta1("Roshan",21,5);
		beta1.show();
		
		
		
	}

}
