package com.pskindero.learning.designpatterns.doublecheckedlocking.model;

public class DoubleCheckedLocking {

	private volatile MyResource instance;
	
	public MyResource getResource() {
		MyResource result = instance;
		if (result == null) {
			synchronized(this) {
				result = instance;
				if (result == null) {
					result = instance = new MyResource();
				}
			}
		}
		return result;
	}
	
}

class MyResource {}