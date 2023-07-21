package com.one.day1;

public class ThreadSample extends Thread{
	
	public void run() {	
		System.out.println("Hello");
	}
	public static void main(String [] args) {
		ThreadSample ts=new ThreadSample();
		ts.start();
	}

}
