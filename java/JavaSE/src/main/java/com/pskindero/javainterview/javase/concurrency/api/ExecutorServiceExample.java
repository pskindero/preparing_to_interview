package com.pskindero.javainterview.javase.concurrency.api;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Need to be remembered:
 * - from java 5
 */
public class ExecutorServiceExample {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Only 3 threads at time are executed
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for (int i =0; i<10; i++) {
			es.submit(() -> {
					System.out.println("Sleeping in: " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Finishing in: " + Thread.currentThread().getName());
				});
		}
		System.out.println("Waiting for all tasks to be finished");
		es.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println("All tasks finished\n\n");
		
		//Using streams:
		es = Executors.newFixedThreadPool(2);
		es.invokeAll(
			List.<Callable<String>>of(
					() -> {Thread.sleep(2000); return "Run1";},
					() -> {Thread.sleep(2000); return "Run2";},
					() -> {Thread.sleep(2000); return "Run3";},
					() -> {Thread.sleep(2000); return "Run4";},
					() -> {Thread.sleep(2000); return "Run5";},
					() -> {Thread.sleep(2000); return "Run6";}
			)
		)
		.stream()
		.map((future) -> {
			try {
				return future.get();
			} catch (InterruptedException| ExecutionException e) {
				e.printStackTrace();
				return "";
			}
			})
		.forEach(System.out::println);
	}

}
