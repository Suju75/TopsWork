package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
// Write a program that demonstrates the use of an ArrayList and LinkedList.

public class ArrayListAndLinkedListDemo {
	public static void main(String[] args) {
		
		ArrayList <String> a1 = new ArrayList <String>();
		
		System.out.println("Defalut value is "+a1);
		System.out.println("Defalut size is "+a1.size());
		
		
		a1.add("Roshan");
		a1.add("Drasti");
		a1.add("Kiran");
		a1.add("Manish");
		a1.add("Mahesh");
		a1.add("Akshay");

		System.out.println("value is - "+a1);
		System.out.println("size is - "+a1.size());
		
		System.out.println("\n\n");
		
		a1.remove(1);
		a1.remove("Roshan");
		
		
		
		System.out.println("value is - "+a1);
		System.out.println("size is - "+a1.size());
		
		System.out.println("\n\n");
		
		Iterator<String> i1 = a1.iterator();
		
		while (i1.hasNext()) {
			
			System.out.println(i1.next());
			//String str = (String) i1.next();
		}
			System.out.println("\n\n");
			
			LinkedList<Integer> l1 = new LinkedList<Integer>();
			

			System.out.println("Defalut value is "+l1);
			System.out.println("Defalut size is "+l1.size());
			
			l1.add(1);
			l1.add(2);
			l1.add(3);
			l1.add(4);
			l1.add(5);
			l1.add(6);
			
			System.out.println("\n\n");
			
			System.out.println("value is - "+l1);
			System.out.println("size is - "+l1.size());
			
			l1.remove(0);
			l1.remove(0);
			
			System.out.println("\n\n");
			
			System.out.println("value is - "+l1);
			System.out.println("size is - "+l1.size());
			
			System.out.println("\n\n");
			
			Iterator<Integer> i2 = l1.iterator();
			
			while (i2.hasNext()) {
			//	Integer integer = (Integer) i2.next();
				System.out.println(i2.next());
				
			}
			
		
		
		
	}

}
