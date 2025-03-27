package com.Constructors;


class Co{
	
	public Co(int id,String department) {
		System.out.println("Employee Id is "+id);
		System.out.println("Employee Departmet Is "+department);
		
	}
	
	public Co(double salary,int age,String company) {
		System.out.println("Salary is "+salary);
		System.out.println("Age is "+22);
		System.out.println("Company name is "+company);
	}
}

public class ConstructorOverloading2 {
	
	public static void main(String[] args) {
		Co co=new Co(25000,22,"TCS");
		Co coo=new Co(22,"Technical");
	}


}
