package com.pskindero.javainterview.javase.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Need to be remembered:
 * - from java 7 use diamond: List<Integer> l1 = new ArrayList<>();
 * - < E extends SomeClass&MustBeInterface, the first element may be a class, but next must be interface!
 */
public class GenericsGeneral {

	public static void main(String[] args) {
		
		//Now it is possible!
		ArrayList l = new ArrayList();
		l.add("dupa");
		List<Integer> l2 = l;
		l2.add(1);
		System.out.println(l2.get(0));
		
		//GenA<String, Number> g = new GenA<String, Integer>(); not compile
		//GenA<String, Integer> g = new GenA<String, Number>(); not compile
		
		 //In the following example, the compiler generates an unchecked conversion warning 
		//because the HashMap() constructor refers to the HashMap raw type, 
		//not the Map<String, List<String>> type:
		Map<String, List<String>> myMap = new HashMap(); // unchecked conversion warning

	}
}

class GenA<K, E extends L1&I1> {
	public K k;
	public E e;
}

//class E <E extends I1&L0>{} compilation error!

class L2 extends L1 implements I1 {}
class L1{}
class L0 extends L1{}
interface I1{}