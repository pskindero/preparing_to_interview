package com.pskindero.learning.designpatterns.nullobject;

/**
 * Example of Null Object design pattern usage.
 */
public class MainClass  {
	private static final int SIZE = 3;

	public static void main( String[] args ) {
    	
		AbstractObject[] array = getArray();
    	
    	for (AbstractObject elem : array) {
    		System.out.println(elem.getBehaviorDesc());
    	}
    	
    	System.out.println("-------------");
    	
    	for (AbstractObject elem : array) {
    		if (!(elem instanceof NullObject)) {
    			System.out.println("Found not null object.");
    		}
    	}
    }
	
	private static AbstractObject[] getArray() {
		AbstractObject[] array = new AbstractObject[SIZE];
    	array[0] = new RealObject();
    	array[1] = new NullObject();
    	array[2] = new RealObject();
    	return array;
	}
}
