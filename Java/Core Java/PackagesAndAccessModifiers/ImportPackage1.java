package com.PackagesAndAccessModifiers;

import com.DataTypesVariablesandOperators.*;


public class ImportPackage1 {
	public static void main(String[] args) {
		
		Modifiers mod =  new Modifiers();
		//System.out.println(mod.pesonalAccBal);
		System.out.println(mod.familyAccBal);
		System.out.println(mod.houseAddresss);
		System.out.println(mod.housemembes);
		
		System.out.println("\n\n\n");
		
		System.out.println("Calculator");
		Calculator cal= new Calculator();
		cal.main(args);
		
		
	}

}
