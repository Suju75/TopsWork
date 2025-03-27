package com.JavaInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("file.txt3",true);
			String str ="My name is Roshan.\n";
			
			byte[] b1=str.getBytes();
			
			fos.write(b1);
			fos.flush();
			fos.close();
			System.out.println("Data is Enterd.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("file.txt3");
			int x;
			
			while((x=fis.read())!=-1) {
				System.out.print((char)x);
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
