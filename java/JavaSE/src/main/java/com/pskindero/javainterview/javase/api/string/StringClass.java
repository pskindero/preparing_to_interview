package com.pskindero.javainterview.javase.api.string;

/**
 * String a = b + c + d;
 * is converted into
 * String a = new StringBuilder(b).append(c).append(d).toString();
 * 
 * A lot of changes in java 9:
 * - private final byte[] value; In java 8 there was char[]
 * - COMPACT_STRINGS (if coding used)
 * - changed coding (when used lation, the size is almost a half)
 */
public class StringClass {

	String s;
	
	public void m() {
	}
}
