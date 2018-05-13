package com.pskindero.learning.designpatterns.singleton;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class IdGeneratorSimpleSingletonTest {

	IdGeneratorSimpleSingleton idGenerator;
	
	@BeforeTest
	public void setUp() {
		idGenerator = IdGeneratorSimpleSingleton.getInstance();
	}
	
	@Test
	public void test() {
		assertEquals(1, idGenerator.getNextId());
		assertEquals(2, idGenerator.getNextId());
	}
	
	@AfterTest
	public void tearDown() {
		idGenerator = null;
	}
}
