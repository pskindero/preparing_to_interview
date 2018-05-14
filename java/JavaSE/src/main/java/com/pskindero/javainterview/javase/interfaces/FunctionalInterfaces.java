package com.pskindero.javainterview.javase.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	Predicate p;	// boolean test(T t);
	Supplier s;		//T get();
	Consumer c;		//void accept(T t);
	Function f;		//R apply(T t);
	
	
	public static void main(String [] args) {
		//Number in range 0-100
		Predicate<Integer> pred = (t) -> t>0;
		pred = pred.and(t -> t<100);
		
		System.out.println(pred.test(-70));
		
		//Converter
		Function<Integer, Long> fun = (t) -> (long) t;
		System.out.println(fun.apply(10) instanceof Long);
		

		//Lazy initialization of list elements
		List<Supplier<Empty>> list = new ArrayList<>();
		list.add(Empty::new);
		System.out.println("Object not created");
		list.get(0).get();
		System.out.println("Now it is created");
	}
}
