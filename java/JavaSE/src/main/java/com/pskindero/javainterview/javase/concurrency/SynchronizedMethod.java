package com.pskindero.javainterview.javase.concurrency;

/**
 * - constructors cannot be synchronized
 * - when a synchronized method exits, it automatically establishes a happens-before 
 * relationship with any subsequent invocation of a synchronized method for the same object. 
 * This guarantees that changes to the state of the object are visible to all threads.
 * - when a thread invokes a synchronized method, it automatically acquires the intrinsic lock 
 * for that method's object and releases it when the method returns. 
 * The lock release occurs even if the return was caused by an uncaught exception.
 * When a static synchronized method is invoked, the thread acquires the intrinsic lock for the Class 
 * object associated with the class. 
 */
public class SynchronizedMethod {

	public static void main(String[] args) {
		int size = 30;
		Runnable[] r = new Runnable[size];
		for (int i = 0; i <size; i++ ) {
			final int j = i;
			r[i] = () -> {
				if (j%2==0) m();
				else n();};
		}
		for (int i = 0; i <size; i++ ) {
			new Thread(r[i]).start();
		}
	}
	
	public static synchronized void m() {
		System.out.println("m " + Thread.currentThread().getName());
		try {
			Thread.sleep(2250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized void n() {
		System.out.println("n " + Thread.currentThread().getName());
		try {
			Thread.sleep(2250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
