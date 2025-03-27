package com.ArraysandStrings;

// Implement string comparison using equals() and compareTo() methods.
public class StringEqualsTo3 {
	public static void main(String[] args) {
		
		String str= "My name is Roshan I Am fullStack Java Devloper";
		String str1= "Apple";
		String str2= "Banana";
		String str3= "Apple";
		
		if(str.equals("My name is Roshan I Am fullStack Java Devloper")) {
			System.out.println("Strings are Equal.");
		}else {
			System.out.println("Strings are not Equal.");
		}
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str1));
		
		
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
	}

}
