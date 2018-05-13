package com.pskindero.learning.designpatterns.singleton.model;

public class IdGeneratorSimpleSingleton {

	private static IdGeneratorSimpleSingleton instance;
	private long id;
	
	private IdGeneratorSimpleSingleton() {
		id=0;
	}

	public static IdGeneratorSimpleSingleton getInstance() {
		if (instance==null) {
			instance = new IdGeneratorSimpleSingleton();
		}
		return instance;
	}
	
	public synchronized long getNextId() {
		incrementId();
		return id;
	}
	
	private void incrementId() {
		id++;
	}
}
