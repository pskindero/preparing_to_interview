package com.pskindero.javainterview.javase.concurrency;

import java.time.Duration;

public class ThreadExample {

	public static void main(String[] args) {

		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(Duration.ofMillis(2000).toMillis());
					System.out.println("Thread finishing");
					throw new RuntimeException("Example");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t.setName("Example of Java Thread");
		t.setPriority(Thread.MAX_PRIORITY); //priority from 1 to 10(MAX)
		t.setUncaughtExceptionHandler((thread, throwable) -> 
			{System.out.println("UncaughtException for thread: " + thread.getName() + " with msg: " + throwable.getMessage());});
		
		t.start();
		
		t.dumpStack(); // print stacktrace of currect thread
		
		//From java 9 thread names are system names
		// Execute: ps -fe | grep ThreadExample | awk '{print $2}' //todo
	}

}
