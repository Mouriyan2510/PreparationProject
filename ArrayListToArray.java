package com.one.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	public static void main(String [] args) {
		
		List<Integer> num = Arrays.asList(5,6,8,933,57);
//		int[] array = num.stream().mapToInt(Integer::intValue).toArray();
//		Integer[] array=num.toArray(new Integer [num.size()]);
		Object[] array=num.toArray(); 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
