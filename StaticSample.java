package com.one.day1;

public class StaticSample {
	public static void main (String [] args) {
		StaticSample ss=new StaticSample();
		StaticSample ss2=new StaticSample();
		StaticSample ss3=new StaticSample();
		
	System.out.println(StaticSample.add());	
	System.out.println(StaticSample.add());
	System.out.println(StaticSample.s);
	}
	
	public static int s=1000;
	public StaticSample() {
		++s;
		System.out.println(s);
	}
	
	static {
		if(s>100) {
			System.out.println(s+"---Correct");
		}
		else {
			System.out.println(s+"---Incorrect");
		}
	}
	
	public static int add() {
		return s+1000;
	}

}
