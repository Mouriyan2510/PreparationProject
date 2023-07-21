package com.one.day1;

public class ThreadSampleUsingRunnable implements Runnable{

	public void run() {
		synchronized (ThreadSampleUsingRunnable.class) {
			System.out.println("Hello World");	
			try {
				ThreadSampleUsingRunnable.class.wait(2000);
				System.out.println("Thread is waiting");
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
	
	public static void main(String [] args)throws  InterruptedException{
		ThreadSampleUsingRunnable tsr=new ThreadSampleUsingRunnable();
		Thread t=new Thread(tsr);
		t.start();
		Thread.sleep(6000);
		System.out.println("Hi");
	}
}
