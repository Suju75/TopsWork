package com.Multithreading;

class Shirt extends Thread{
	
	int totalSells=0;
	
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				totalSells=totalSells+99;
			}		
		}	
	}
}

class Paint implements Runnable{
	int totalSells1=0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				totalSells1=totalSells1+299;
			}
			this.notifyAll();
		}
	}
	
}

public class WaitNotifyAllDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Shirt s = new Shirt();
		Paint p = new Paint();
		Thread t1 = new Thread(p);
		
		synchronized (s) {
			s.start();
			s.wait();
			
			System.out.println("Total Sells  of Shirts :- "+s.totalSells);
		}
		
		
		synchronized (t1) {
			t1.start();
			t1.wait();
			System.out.println("Total sells of pants :- "+p.totalSells1);
		}
		
	}

}
