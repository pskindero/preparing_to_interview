package com.pskindero.learning.designpatterns.prototype;

import java.util.Hashtable;

/**
 * PROTOTYPE - creational
 * 
 * This patters creates clone of the heavy object.
 */
public class MainClass {

	public static void main(String[] args) {
		HeavyObjCache.loadCache();
		HeavyObjCache.get("conn1");
	}

}

class HeavyObj implements Cloneable {

	String connectionName;

	public HeavyObj(String connectionName) {
		this.connectionName = connectionName;
	}

	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
}

class HeavyObjCache {
	
	   private static Hashtable<String, HeavyObj> shapeMap  = new Hashtable<>();

	   public static HeavyObj get(String connectionName) {
		  HeavyObj cachedShape = shapeMap.get(connectionName);
	      return (HeavyObj) cachedShape.clone();
	   }

	   public static void loadCache() {
		   shapeMap.put("conn1", new HeavyObj("conn1"));
		   shapeMap.put("conn1", new HeavyObj("conn2"));
	   }
	}