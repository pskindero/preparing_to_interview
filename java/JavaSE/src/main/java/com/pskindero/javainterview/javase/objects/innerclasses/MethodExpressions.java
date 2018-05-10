package com.pskindero.javainterview.javase.objects.innerclasses;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Need to be remembered: 
 * - use by static and non-static method, by constructors
 * - method param must be a functional interface!
 */
public class MethodExpressions {

	public static void main(String args[]) {
		Person[] peopleArray = new Person[] {new Person(10), new Person(88), new Person(66)};
		
		//Using lambda:
		Arrays.sort(peopleArray, 
				(p1, p2) -> Person.compareByAge(p1,  p2));
		
		//Using static method:
		Arrays.sort(peopleArray, Person::compareByAge);
		
		//Using non static
		Person p = new Person(1);
		Arrays.sort(peopleArray, p::compareByAgeNonStatic);
		
		//Using reference by constructor
		mm(Person::new);
		mms(Person::new);
	}
	
	public static <T extends Person> void mm(Supplier<T> s) {}
	public static void mms(PersonProvider p) {}
}

class Person {
	public int age;
	
	public Person() {
		this.age = 0;
	}
	
	public Person(int age) {
		this.age = age;
	}

	public static int compareByAge(Person p1, Person p2) {
		return p1.age - p2.age;
	}
	
	public int compareByAgeNonStatic(Person p1, Person p2) {
		return p1.age - p2.age;
	}	
}

interface PersonProvider {
	public Person get();
}
