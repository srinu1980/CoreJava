package com.cts.java8features;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo9 {

	public static void main(String[] args) {

/*
		Stream.iterate(1, count->count+1)
			.filter(number->number%3==0)
			.limit(6)
			.forEach(System.out::println);
	
*/
	
			List <Integer> num=Arrays.asList(1,2,3,4,5,6);
			
			List<Integer>square=num.stream()
					.map(n->n*n)
					.collect(Collectors.toList());
			
			System.out.println(square);
		
		
	}	
		
}
