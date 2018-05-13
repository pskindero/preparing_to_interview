package com.pskindero.javainterview.javase.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		B b = new B();
		
		Method method = b.getClass().getDeclaredMethod("privateMsg");
		method.setAccessible(true);
		
		System.out.println(method.invoke(b));
	}

}

class B {
	private String msg= "It is a private message!";
	
	private String privateMsg() {
		return msg;
	}
}