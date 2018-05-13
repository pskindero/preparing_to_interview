package com.pskindero.javainterview.javase.concurrency;

/**
 * A daemon thread is a thread that does not prevent the JVM from exiting 
 * when the program finishes but the thread is still running. 
 * When the JVM halts any remaining daemon threads are abandoned (finally block not executed).
 * An example for a daemon thread is the garbage collection.
 * 
 * 
 * When a new thread is created it inherits the daemon status of its parent
 */
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
