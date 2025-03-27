package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int empId;
	String empName;
	long salary;
	
	public Employee(int emmId,String empName,long salary) {
		this.empId=emmId;
		this.empName=empName;
		this.salary=salary;
			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("employee id is "+empId+"\nemployee name is "+empName+"\nemployee salary is "+salary);
	}
	
}

public class SerializationAndDeserialization3 {
	public static void main(String[] args) {
		
		// Serialization.
		
		Employee e1= new Employee(5,"Roshan", 50000);
		
		try {
			FileOutputStream fos = new FileOutputStream("file.txt2");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			oos.flush();
			oos.close();
			System.out.println("Data Written Succesfully.");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Deserialization.
		
		System.out.println("File reading start.");
		
		
		try {
			FileInputStream fis = new FileInputStream("file.txt2");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e2 = (Employee) ois.readObject();
			ois.close();
			System.out.println(e2);
					

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
