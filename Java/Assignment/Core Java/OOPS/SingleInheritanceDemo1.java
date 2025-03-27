package com.OOPS;

// Write a program demonstrating single inheritance.

class Car{
	 String model,owner_name,number;
	
	public void setData() {
		model="Maruti Suzuki OMNI";
		owner_name="Kishan mistry";
		number="GJ 21 1134";
	}
}

class Validity extends Car{
	int ExpiryDate;
	String InsuraceExpiryDate;
	
	public void setData1() {
		ExpiryDate=2030;
		InsuraceExpiryDate="5-12-2026";
		
	}
	
	public void Display() {
		System.out.println("Car model is "+model);
		System.out.println("Car owner name is "+owner_name);
		System.out.println("Car number is "+number);
		System.out.println("Car Expiry year is "+ExpiryDate);
		System.out.println("Car Insurance Expiry Date is "+InsuraceExpiryDate);
		
	}
}

public class SingleInheritanceDemo1 {
	public static void main(String[] args) {
		
		Validity v= new Validity();
		
		v.setData();
		v.setData1();
		v.Display();
	}

}
