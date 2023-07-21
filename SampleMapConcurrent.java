package com.one.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMapConcurrent {
	public static void main(String [] args){
		Map<Integer,String> names=new ConcurrentHashMap<>();
		names.put(101,"Nisha");
		names.put(102,"Maran");
		names.put(103,"Rajesh");
		
		for(String g:names.values()) {
			names.put(107, "Pugazh");
			System.out.println(g);
		}
}
}
