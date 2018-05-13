package com.pskindero.learning.designpatterns.doublecheckedlocking;

import com.pskindero.learning.designpatterns.doublecheckedlocking.model.DoubleCheckedLocking;

/**
 * Double-checked locking pattern
 * 
 * It is used to reduce the overhead of acquiring a lock by first testing 
 * the locking criterion without actually acquiring the lock. 
 * Only if the locking criterion check indicates that locking is required does the actual locking logic proceed.
 * 
 * It is typically used to reduce locking overhead when implementing "lazy initialization" in a multi-threaded environment, 
 * especially as part of the Singleton pattern. Lazy initialization avoids initializing a value until the first time it is accessed.
 */
public class MainClass {

	public static void main(String[] args) {
		DoubleCheckedLocking obj = new DoubleCheckedLocking();
		obj.getResource();
	}
}
