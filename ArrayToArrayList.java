package com.one.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String [] args) {
		int []a= {1,2,3,4,55,6,78};
		List <Integer> f=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			f.add(a[i]);
		}
		System.out.println(f);
	}

}
