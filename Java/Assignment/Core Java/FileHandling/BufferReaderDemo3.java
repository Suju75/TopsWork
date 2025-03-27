package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderDemo3 {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("src\\com\\JavaInputOutput\\myfile2.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int x;
			
			while((x=br.read())!=-1) {
				System.out.print((char)x);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
