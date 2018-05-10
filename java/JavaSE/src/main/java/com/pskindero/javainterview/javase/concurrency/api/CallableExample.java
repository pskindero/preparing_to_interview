package com.pskindero.javainterview.javase.concurrency.api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		Future<String> result = executor.submit(new Callable<String>() {
			public String call() throws InterruptedException {
				Thread.currentThread().sleep(1000);
				return "OK";
			}
		});
		
		while(!result.isDone()) {
			System.out.println("Still waiting ... ");
			Thread.sleep(100);
		}
		
		System.out.println("Finished: " + result.get());
	}
}
