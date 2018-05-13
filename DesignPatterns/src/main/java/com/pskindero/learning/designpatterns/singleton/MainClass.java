package com.pskindero.learning.designpatterns.singleton;

public class MainClass {

	public static void main(String[] args) {
		IdGeneratorSimpleSingleton idGenerator = IdGeneratorSimpleSingleton.getInstance();
		System.out.println("Generated id: " + idGenerator.getNextId());
		System.out.println("Generated id: " + idGenerator.getNextId());
		System.out.println("Generated id: " + idGenerator.getNextId());
	}

}
