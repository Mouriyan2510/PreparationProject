package com.one.day1;

public class FinallySample {

	public static void main(String[] args) throws CustomException {
		int a = 10;
		int b = 100;
		try {
			if (a < b) {
				throw new CustomException(a + "  is small");
			} else {
				throw new CustomException(b + "  is small");
			}
		} finally {
			System.out.println("Execute whether it is handled or not");
		}
	}

}
