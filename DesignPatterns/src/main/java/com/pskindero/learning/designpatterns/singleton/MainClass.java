package com.pskindero.learning.designpatterns.singleton;

import com.pskindero.learning.designpatterns.singleton.model.IdGeneratorSimpleSingleton;

public class MainClass {

	public static void main(String[] args) {
		IdGeneratorSimpleSingleton idGenerator = IdGeneratorSimpleSingleton.getInstance();
		System.out.println("Generated id: " + idGenerator.getNextId());
		System.out.println("Generated id: " + idGenerator.getNextId());
		System.out.println("Generated id: " + idGenerator.getNextId());
	}

}
