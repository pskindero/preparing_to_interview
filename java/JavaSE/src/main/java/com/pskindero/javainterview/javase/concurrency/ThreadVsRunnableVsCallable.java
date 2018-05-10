package com.pskindero.javainterview.javase.concurrency;

import java.time.Duration;
import java.util.concurrent.Callable;

/**
 * Important methods:
 *  - Thread.sleep - currect thread is suspending for time
 *  - interrupt - it change the flag for interrupt and throws InterruptedException
 *  - join - allows thread to join/wait for other thread
 */
public class ThreadVsRunnableVsCallable {

	/**
	 * It implements Runnable
	 */
	Thread t;
	
	Runnable r;
	
	/**
	 * V call() throws Exception;
	 */
	Callable c;
	
	public static void main(String... args) {
		
		new Thread() {
			public void run() {
				try {
					System.out.println("START");
					Thread.sleep(Duration.ofSeconds(2).toMillis());
					System.out.println("STOP");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread(() -> {
			try {
				System.out.println("START");
				Thread.sleep(Duration.ofSeconds(2).toMillis());
				System.out.println("STOP");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		

		//Callable is started in the other way. 
	}
}
