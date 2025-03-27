package com.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
// Create a HashMap to store and retrieve key-value pairs.
public class HashmapDemo {
	public static void main(String[] args) {
		
		HashMap h1 = new HashMap();
		
		System.out.println("The default value is "+h1);
		System.out.println("The default size is "+h1.size());
		
		h1.put(1, "Roshan");
		h1.put(2, "Gupta");
		h1.put(3, 13);
		h1.put(4, "08");
		h1.put(5, 2003);
		
		System.out.println("The value is "+h1);
		System.out.println("The size is "+h1.size());
		
		System.out.println("\n\n");
		
		Set s1=h1.entrySet();
		
		Iterator i1 = s1.iterator();
		
		while (i1.hasNext()) {
			
			Map.Entry me = (Map.Entry) i1.next();
			
			System.out.println("The key is "+me.getKey());
			System.out.println("The Value is "+me.getValue());
			
		}
			
		
	}
	

}
