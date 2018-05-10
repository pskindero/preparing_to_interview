package com.pskindero.javainterview.javase.collections.impl;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * transient - not be serializable
 */
public class SetImpl {

	/**
	 * 	private transient HashMap<E,Object> map;
	 * 
	 *  public boolean add(E e) {
        	return map.put(e, PRESENT)==null;
    	}
    	public boolean remove(Object o) {
        	return map.remove(o)==PRESENT;
    	}
	 */
	HashSet hs;
	
	/**
	 * 	private transient NavigableMap<E,Object> m; //TreeMap actually
	 * 
	 *  public boolean add(E e) {
        	return m.put(e, PRESENT)==null;
    	}
	 */
	TreeSet ts;
	
	/**- extends HashSet
	 */
	LinkedHashSet lhs;
	
	
	//Special
	/**
	 * abstract EnumSet<E extends Enum<E>> extends AbstractSet<E> 
	 * 
	 * final transient Enum<?>[] universe;

	 */
	EnumSet es; 
	
	/**
	 * private final CopyOnWriteArrayList<E> al;
	 */
	CopyOnWriteArraySet cows;
}
