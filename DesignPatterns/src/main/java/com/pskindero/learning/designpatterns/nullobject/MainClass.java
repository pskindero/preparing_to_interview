package com.pskindero.learning.designpatterns.nullobject;

/**
 * Example of Null Object design pattern usage.
 * Consider to Use Optional in Java 8+
 */
public class MainClass  {
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
		AbstractObject[] array = new AbstractObject[3];
    	array[0] = new RealObject();
    	array[1] = new NullObject();
    	array[2] = new RealObject();
    	return array;
	}
}

abstract class AbstractObject {
	public abstract String getBehaviorDesc();
}

class NullObject extends AbstractObject{
	@Override public String getBehaviorDesc() {return "";}
}

class RealObject extends AbstractObject{
	@Override public String getBehaviorDesc() {return "Some real behaviour!";}
}