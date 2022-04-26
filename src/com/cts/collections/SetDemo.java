package com.cts.collections;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {


		//TreeMap<String, String> tm=new TreeMap<String, String>();
		//HashMap<String, String> tm=new HashMap<String, String>();
		LinkedHashMap<String, String> tm=new LinkedHashMap<String, String>();
		tm.put("Ten", "Srilanka");
		tm.put("One", "India");
		tm.put("Two", "Australia");
		tm.put("Five", "Bangladesh");
		tm.put("Three", "NewZealand");
		tm.put("SIX", "Pakistan");
		
		System.out.println(tm);
		
		System.out.println(tm.get("Five"));
		
		
		
	}

}
