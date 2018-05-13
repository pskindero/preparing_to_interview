package com.pskindero.learning.designpatterns.template;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.pskindero.learning.designpatterns.template.model.SimpleTestCase;
import com.pskindero.learning.designpatterns.template.model.TestCaseResult;

public class SimpleTestCaseTest {

	@Test
	public void testGetTestCaseName() {
		String tcName = "TEST0";
		SimpleTestCase test = new SimpleTestCase(tcName, "string1_more_than_8");
		assertEquals(test.getName(), tcName);
	}
	
	@Test
	public void testPositiveScenario() {
		SimpleTestCase test = new SimpleTestCase("POSITIVE_TEST1", "string1_more_than_8");
		assertEquals(test.run(), TestCaseResult.PASS);
	}
	
	@Test
	public void testNegativeScenario_TooShortString() {
		SimpleTestCase test = new SimpleTestCase("NEGATIVE_TEST1", "short");
		assertEquals(test.run(), TestCaseResult.FAIL);
	}
	
	@Test
	public void testNegativeScenario_TooLongString() {
		SimpleTestCase test = new SimpleTestCase("NEGATIVE_TEST2", "string_should_have_less_than_24_characters");
		assertEquals(test.run(), TestCaseResult.FAIL);
	}
}
