package com.pskindero.learning.designpatterns.template.model;

public class SimpleTestCase extends AbstractTestCase {

	private static final int MIN_STRING_LENGTH = 8;
	private static final int MAX_STRING_LENGTH = 24;
	private String stringToTest;
	
	public SimpleTestCase(String testCaseName, String stringToTest) {
		super(testCaseName);
		this.stringToTest = stringToTest;
	}

	@Override
	void prepare() throws TestCaseException {
		//TODO some preparation
	}

	@Override
	void execute() throws TestCaseException {
		if (stringToTest.length() < MIN_STRING_LENGTH ||
				stringToTest.length() > MAX_STRING_LENGTH)
			throw new TestCaseException("Tested string have incorrect length!");
	}

	@Override
	void restore() throws TestCaseException {
		//TODO some restore
	}
}
