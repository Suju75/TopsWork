package com.JavaInputOutput;

import java.io.FileReader;
import java.io.FileWriter;


public class ReadAndWriteOtherFile3 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("src\\com\\JavaInputOutput\\myfile2.txt");
			FileReader fr = new FileReader("file.txt");
			
            int x;
            while((x=fr.read())!=-1) {
            	fw.write(x);
            }
			fr.close();
			fw.close();
            System.out.println("Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
