package com.one.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleListConcurrent {//failfast//failsafe
	public static void main(String [] args){
		List<String> names=new CopyOnWriteArrayList<>();
		names.add("Nisha");
		names.add("Maran");
		names.add("Rajesh");
		
		for(String d:names) {

			names.remove("Maran");
			
		}
		System.out.println(names);
//		names.forEach(t-> System.out.println(t));
	}

}
