package com.Multithreading;


class Caller{
	public void call(String msg) throws InterruptedException {
		System.out.print("[");
		Thread.sleep(1000);
		System.out.print(msg);
		Thread.sleep(1000);
		System.out.println("]");
		Thread.sleep(1000);
		
	}
}

class Callback implements Runnable{
	 Caller c;
	 String msg;
	 Thread thread;
	 
	 public Callback (Caller c, String msg) {
		 this.c=c;
		 this.msg=msg;
		 thread=new Thread(this);
		 thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized (STR) {
				c.call(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}

public class SynchronizedDemo2 {
	public static void main(String[] args) {
		Caller c = new Caller();
		
		Callback c1 = new Callback(c,"Manish");
		Callback c2 = new Callback(c,"Roshan");
		Callback c3 = new Callback(c,"Hariom");
		Callback c4 = new Callback(c,"Kiran");
		Callback c5 = new Callback(c,"Kishan");
		
		
	}

}
