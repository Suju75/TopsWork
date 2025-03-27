package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

// Implement a program using HashSet to remove duplicate elements from a list.
public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet h1 = new HashSet();
		
		System.out.println("The default value is "+h1);
		System.out.println("The default size is "+h1.size());
		
		h1.add("Roshan");
		h1.add("Gupta");
		h1.add(1);
		h1.add(2);
		h1.add(5);
		h1.add("Roshan");
		h1.add("Gupta");
		h1.add(6);
		h1.add(7);
		h1.add(8);
		
		System.out.println("The  value is "+h1);
		System.out.println("The size is "+h1.size());
		
		System.out.println("\n\n\n ");
		
		Iterator i1 = h1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		
		
		
	}

}
