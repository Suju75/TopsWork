package com.PackagesAndAccessModifiers;

//Demonstrate the use of different access modifiers within the same package and across different packages.

class Modifiers{
	private int pesonalAccBal=50000;
	protected int familyAccBal=100000;
	public String houseAddresss="Dungri , Valsad";
	String housemembes ="5";
	
	
	
	void disPlay() {
		System.out.println("Personal Account Balance is "+pesonalAccBal);
		System.out.println("Family Account Balance is "+familyAccBal);
		System.out.println("House Address is "+houseAddresss);
		System.out.println("Toytal House members are "+housemembes);
		
	}
	
}

class Modifiers1 extends Modifiers{
	public void disPlay1() {
		//System.out.println("Personal Account Balance is "+pesonalAccBal);
		System.out.println("Family Account Balance is "+familyAccBal);
		System.out.println("House Address is "+houseAddresss);
		System.out.println("Toytal House members are "+housemembes);
		
	}

	
}

public class AccessModifiers2 {
	private int pesonalAccBal=50000;
	protected int familyAccBal=100000;
	public String houseAddresss="Dungri , Valsad";
	String housemembes ="5";
	public static void main(String[] args) {
		Modifiers mod =  new Modifiers();
		mod.disPlay();
		
		System.out.println("\n\n\n");
		
		Modifiers1 mod1 = new Modifiers1();
		mod1.disPlay1();
		
		
		
		
	}

}
