package com.pskindero.javainterview.javase.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Exceptions in streams: https://stackoverflow.com/questions/27644361/how-can-i-throw-checked-exceptions-from-inside-java-8-streams
 */
public class StreamsExamples {

	public static void main(String[] args) {
		//Divide and print
		List<Integer> li = List.of(7, 4, 9, 13, 22, 44, 11, 92);
		
		li.stream()
			.filter(n -> n%2 == 0)
			.map(Divider::divide)
			.forEach(System.out::println);
		
		
		//Sort and convert to List
		Set<Integer> s = Set.of(7, 4, 9, 13, 22, 44, 11, 92);
		List l = s.stream()
			.sorted((e1, e2) -> e1-e2)
			.collect(Collectors.toList());
		System.out.println(l);
	}

}

class Divider {
	public static Integer divide(Integer i) { 
		return i/2;
	}
}

class Empty{
	public Empty() {
		System.out.println("Object created");
	}
}