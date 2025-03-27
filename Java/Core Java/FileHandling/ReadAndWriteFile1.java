package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile1 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("file.txt",true);
			String str = "\nThis is a character Stream \n Write a program to read and write content to a file using FileReader and FileWriter. \n  CharacterStream uses 2byte/char. \n   FileWriter to write data into file and FileReader to read data from the file";
			fw.write(str);
			fw.flush();
			System.out.println("Data is Writern");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr= new FileReader("file.txt");
			int x;
			
			while((x=fr.read()) !=-1) {
				System.out.print((char)x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
