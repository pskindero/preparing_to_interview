package com.pskindero.learning.designpatterns.singleton;

/**
 * Singleton implementation with SingletonHolder
 * It's thread-safe because the JVM handles lazily loading the nested class.
 * 
 */
public class SingletonThreadSafe {

	private static class SingletonHolder {
		public static final SingletonThreadSafe instance = new SingletonThreadSafe();
	}

	public static SingletonThreadSafe getInstance() {
		return SingletonHolder.instance;
	}
}
