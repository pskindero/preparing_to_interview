package com.pskindero.learning.designpatterns.template;

import org.testng.annotations.Test;
import com.pskindero.learning.designpatterns.template.model.TestCaseResult;
import static org.testng.Assert.assertEquals;

public class TestCaseResultTest {

	@Test
	public void testVerdicts() {
		assertEquals("FAIL", TestCaseResult.FAIL.toString());
		assertEquals("PASS", TestCaseResult.PASS.toString());
		assertEquals("NOT_FINISHED", TestCaseResult.NOT_FINISHED.toString());
	}

}
