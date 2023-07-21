package com.one.day1;

import java.util.Scanner;

public class Scan {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a=s.nextLine();
		System.out.println("Enter your Age: ");
		int b=s.nextInt();
		System.out.println(a+"   "+b);
	}

}
