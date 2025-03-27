package com.InterfacesandAbstractClasses;

class Implement implements  ImplementInterfaces, ImplementInterfaces1, ImplementInterfaces2, ImplementInterfaces3{
	
	double salary;
	String name;
	String department;
	int empid;

	@Override
	public void empSalary() {
		salary = 50000;
		
	}

	@Override
	public void empDepartment() {
		// TODO Auto-generated method stub
		department  = "IT";
	}


	@Override
	public void empName() {
		// TODO Auto-generated method stub
		name = "Kiran Thakre";
	}

	@Override
	public void empId() {
		// TODO Auto-generated method stub
		empid = 123;
	}
	
	public void disPlay() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+empid);
		System.out.println("Employee Department is "+department);
		System.out.println("Employee salary is "+salary);
		
	}
	
}
public class ImplementsMultipleInterfaces {
	public static void main(String[] args) {
		
		Implement imp = new Implement();
		
		imp.empId();
		imp.empDepartment();
		imp.empName();
		imp.empSalary();
		
		imp.disPlay();
	}
	

}
