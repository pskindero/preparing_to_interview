package com.pskindero.learning.javaee.di.scope;

import javax.inject.Singleton;

@Singleton
public class SingletonScopeExample {

	private int counter = 0;
	
	public synchronized int getAndIncrement() {
		counter++;
		return counter;
	}
	
	public synchronized int get() {return counter;}
}
