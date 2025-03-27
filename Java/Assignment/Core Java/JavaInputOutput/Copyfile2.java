package com.JavaInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;


//Implement a file copy program using FileInputStream and FileOutputStream.
public class Copyfile2 {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("src\\com\\JavaInputOutput\\myfile.txt");
			FileInputStream fis = new FileInputStream("file.txt");
			
			int x;
			
			while ((x=fis.read()) !=-1) {
				fos.write(x);
			}
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
