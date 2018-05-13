package com.pskindero.javainterview.javase.concurrency.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.Collectors;

public class LockObjects {

	static Lock lockInterface;
	
	/**
	 * Same as synchronized, but contains couple of usefull methods
	 */
	static ReentrantLock reentrantLock;
	
	/**
	 * This interface allows you to lock on write or on read
	 */
	static ReadWriteLock rwLock;
	
	/**
	 * from java 8
	 * Contains mmechanism for read and write lock
	 * Lock methods returns a stamp (long). Using them can unlock, check if lock is valid
	 * Supports OptimisticLocking
	 */
	static StampedLock stampedLock;
	
	static int order = 1;
	static int nThreads = 100;
	public static void main(String...strings) throws InterruptedException {
		//ReentrantLock
		reentrantLock = new ReentrantLock();
		
		ExecutorService es = Executors.newFixedThreadPool(nThreads);
		Set<Integer> result = es.invokeAll(getListOfTasks())
			.stream()
			.map((order) -> {
				try {
					return order.get();
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
					return -1;
				} 
			})
			.collect(Collectors.toSet());
		
		System.out.println("As you can see there are not duplicates: " + result.size());
		
	}
	
	
	
	public static List<Callable<Integer>> getListOfTasks() {
		List<Callable<Integer>> l = new ArrayList<>();
		for (int i = 0; i < nThreads; i++) {
			l.add(() -> {
				int result = 0;
				while (!reentrantLock.tryLock()) {
				}
				System.out.println("Gathered!");
				result = order;
				order++;
				Thread.sleep(100);
				reentrantLock.unlock();
				return result;
			});
		}
		return l;
	}
}