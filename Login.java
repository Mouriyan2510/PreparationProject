package com.one.day1;

public class Login {
	public void checkPassword(String a)throws CustomException {
		try {
		if(a.length()>8) {
			System.out.println("Login Successfully");
		}
		else {
			throw new CustomException("Password must contain more than 8");
		}
		}
		catch (CustomException ce){
			ce.printStackTrace();
//			System.out.println(ce);
		}
	}
}
