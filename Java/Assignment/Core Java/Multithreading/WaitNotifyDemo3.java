package com.Multithreading;

class Colddrink extends Thread{
	int totalsells = 0;
	
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				totalsells= totalsells+40;
			}
			this.notify();
		}
		
	}
}


public class WaitNotifyDemo3 {
	public static void main(String[] args) throws InterruptedException {
		
		Colddrink colddrink = new Colddrink();
		
		synchronized (colddrink) {
			colddrink.start();
			colddrink.wait();
		}
		
		System.out.println("Total Cold drink sells is :- "+colddrink.totalsells);
	}

}
