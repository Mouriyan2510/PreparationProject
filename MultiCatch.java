package com.one.day1;

public class MultiCatch {
	public static void main(String... args) {
		try {
			String[] word = { "Muthu", "Nila", "Kavi", "Inba","Vennila"};

			System.out.println(word[9]);
		} catch (StringIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("Num1");
		}
		catch (IndexOutOfBoundsException ie) {
			ie.printStackTrace();
			System.out.println("Num2");
		}
		catch (RuntimeException re) {
			re.printStackTrace();
			System.out.println("Num3");
		}
	}

}
