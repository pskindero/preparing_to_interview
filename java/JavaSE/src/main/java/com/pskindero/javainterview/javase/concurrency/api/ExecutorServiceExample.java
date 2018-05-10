package com.pskindero.javainterview.javase.concurrency.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		
		//Only 3 threads at time are executed
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for (int i =0; i<10; i++) {
			es.submit(() -> {
					System.out.println("Sleeping in: " + Thread.currentThread().getName());
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Finishing in: " + Thread.currentThread().getName());
				});
		}
	}

}
