package com.one.day1;

public class CustomException extends Exception{
	public CustomException(String msg) {
		super(msg);
		}
	public void printStackTrace() {
		System.out.println("Hey Man");
	}
}
