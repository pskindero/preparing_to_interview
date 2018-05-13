package com.pskindero.learning.designpatterns.template.exceptions;

/**
 * Common exception used for failing Test Cases.
 * 
 * @author pskindero
 */
public class TestCaseException extends Exception {

	private static final long serialVersionUID = 1111782766133387106L;

	public TestCaseException(String message) {
		super(message);
	}
}
