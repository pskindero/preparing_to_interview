package com.pskindero.javainterview.javase.collections.interfaces;

import java.util.Set;

/**
 * 	Need to be remembered:
 * - additional methods/definitions:
 * 		static of - return ImmutableCollections.Set
 * - from java 9: a lot of definitions of List.of()
		...
 	    static <E> Set<E> of(E e1) {
        	return new ImmutableCollections.Set1<>(e1);
    	}
	    static <E> Set<E> of(E e1, E e2) {
	        return new ImmutableCollections.Set2<>(e1, e2);
	    }

	    static <E> Set<E> of(E e1, E e2, E e3) {
	        return new ImmutableCollections.SetN<>(e1, e2, e3);
	    }
	    ...
	    until 10
 */
public class SetInterface {

	Set s;
}
