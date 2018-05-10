package com.pskindero.javainterview.javase.objects;

/**
 * Need to be remembered:
 * - contains methods (most of them are native):
 * 		equals
 * 		hashCode
 * 		clone
 * 		toString - returns getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 		getClass
 * 		notify
 * 		notifyAll
 * 		wait
 * 		finalize - @Deprecated since jdk9
 */
public class ObjectInside {
	Object o;
}
