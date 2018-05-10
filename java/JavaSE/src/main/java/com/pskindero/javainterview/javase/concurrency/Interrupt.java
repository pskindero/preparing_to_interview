package com.pskindero.javainterview.javase.concurrency;

import java.time.Duration;

public class Interrupt {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread() {
			public void run() {
				MAIN:
					while (!isInterrupted()) {
						System.out.println("sleeping so good");
						try {
							Thread.sleep(Duration.ofMillis(100l).toMillis());
						} catch (InterruptedException e) {
							System.out.println("BREAK!");
							break MAIN;
						}
					}
			}
		};
		t.start();
		
		Thread.sleep(Duration.ofMillis(450).toMillis());
		t.interrupt();
	}

}
