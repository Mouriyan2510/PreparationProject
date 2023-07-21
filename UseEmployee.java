package com.one.day1;

import java.util.HashMap;

public class UseEmployee {

	public static void main(String [] args) {
		SampleHashMapEmployee e1=new SampleHashMapEmployee("Nisha",101,15,"Trainer");
		SampleHashMapEmployee e2=new SampleHashMapEmployee("Mouri",102,25,"Student");
		SampleHashMapEmployee e3=new SampleHashMapEmployee("Naveen",101,27,"Manager");
		SampleHashMapEmployee e4=new SampleHashMapEmployee("Kathir",107,23,"Plumber");		
		HashMap<Integer, SampleHashMapEmployee> has=new HashMap<>();
		has.put(e1.getId(), e1);
		has.put(e2.getId(), e2);
		has.put(e3.getId(), e3);////hashing technique = hash & (n-1)////   hash%n
		has.put(e4.getId(), e4);
		for(Integer d:has.keySet()) {
			System.out.println(d+"  "+d.hashCode()%16);
		}
		has.values().forEach(t-> System.out.println(t));
		System.out.println(e1.equals(e3));
	}
}
