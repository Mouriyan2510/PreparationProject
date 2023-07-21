package com.one.day1;

import java.util.Hashtable;

public class SampleHashTable {

	public static void main(String [] args){
		Hashtable<Integer,String> names=new Hashtable<>(10);
		names.put(101,"Nisha");
		names.put(102,"Maran");
		names.put(106,"Rajesh");
		
		for(Integer d:names.keySet()) {
			System.out.println(d+"  "+d.hashCode()%10);
		}
}
}
