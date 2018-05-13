package com.pskindero.javainterview.javase.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *  An atomic action cannot stop in the middle: it either happens completely, or it doesn't happen at all
 *  
    Reads and writes are atomic for reference variables and for most primitive variables (all types except long and double).
    Reads and writes are atomic for all variables declared volatile (including long and double variables).

 	Using volatile variables reduces the risk of memory consistency errors, because any write to a volatile variable 
 	establishes a happens-before relationship with subsequent reads of that same variable. This means that changes 
 	to a volatile variable are always visible to other threads. What's more, it also means that when a thread reads 
 	a volatile variable, it sees not just the latest change to the volatile, but also the side effects of the code 
 	that led up the change
 */
public class AtomicAccess {

	volatile int i;
	
	/**
	 * It is a wrapper that contains:
	 		private volatile int value;
	 */
	static AtomicInteger ai;
	
	public static void main(String...strings) throws InterruptedException {
		ai = new AtomicInteger(0);

		ExecutorService executor = Executors.newFixedThreadPool(200);
		IntStream.range(0, 1000)
		    .forEach(i -> executor.submit(ai::incrementAndGet));

		executor.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println(ai.get()); 
	}
}
