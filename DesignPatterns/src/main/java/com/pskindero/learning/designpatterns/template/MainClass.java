package com.pskindero.learning.designpatterns.template;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.pskindero.learning.designpatterns.template.model.SimpleTestCase;
import com.pskindero.learning.designpatterns.template.model.TestCaseResult;

/**
 * Simple example of running Test Case.
 * 
 * @author pskindero
 */
public class MainClass {

	private static final Logger logger = LogManager.getLogger(MainClass.class);

	public static void main(String[] args) {
		logger.info("Starting Test Campaign");
		SimpleTestCase testCase = new SimpleTestCase("Test_string_1", "Some_String");
		TestCaseResult result = testCase.run();

		logger.info("Finishing Test Campaign with result: " + result);
	}
}
