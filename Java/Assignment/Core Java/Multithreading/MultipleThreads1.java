package com.Multithreading;



//Write a program to create and run multiple threads using the Thread class.

class MultiThredingDemo extends Thread{
	
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println("This is First thread...");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class SecondThread extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("This is Second Thread...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MultipleThreads1 {
	public static void main(String[] args) {
		
		MultiThredingDemo m = new MultiThredingDemo();
		SecondThread s = new SecondThread();
		
		m.start();
		s.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("This is Main Thread.");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
