package com.pskindero.learning.design_patterns.template.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pskindero.learning.design_patterns.template.exceptions.TestCaseException;

/**
 * Base class for Test Cases. 
 * Template Design pattern has been used for defining Test Cases steps.
 *
 * @author pskindero
 */
public abstract class AbstractTestCase {

	private static final Logger logger = LogManager.getLogger(AbstractTestCase.class);
	private String testCaseName;
	
	public AbstractTestCase(String testCaseName) {
		this.testCaseName = testCaseName;
	}
	
	abstract void prepare() throws TestCaseException;
	
	abstract void execute() throws TestCaseException;
	
	abstract void restore() throws TestCaseException;
	
	public TestCaseResult run() {
		logger.info("Starting Test Case: " + this.testCaseName);
		TestCaseResult result = TestCaseResult.NOT_FINISHED;
		
		try {
			logger.info("Test Case prepare - start.");
			prepare();
			logger.info("Test Case prepare - passed.");
			
			logger.info("Test Case execute - start.");
			execute();
			logger.info("Test Case execute - passed.");
		} catch(TestCaseException ex) {
			logger.info("Test Case - failed. Reason: " + ex.getMessage());
			result = TestCaseResult.FAIL;
		
		} finally {
			try {
				logger.info("Test Case restore - start.");
				restore();
				logger.info("Test Case restore - passed.");
			}  catch(TestCaseException ex) {
				logger.info("Test Case - failed. Reason: " + ex.getMessage());
				result = TestCaseResult.FAIL;
			}
		}

		if (result == TestCaseResult.NOT_FINISHED)
			result = TestCaseResult.PASS;
		logger.info("Finishing Test Case: " + this.testCaseName);
		logger.info("Result: " + result);
		
		return result;
	}
	
	public String getName() {
		return this.testCaseName;
	}
}
