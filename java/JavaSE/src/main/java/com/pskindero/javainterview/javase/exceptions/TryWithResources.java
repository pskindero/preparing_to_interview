package com.pskindero.javainterview.javase.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Need to be remembered:
 * - from java 7
 * - Resource must implement AutoClosable or Closable
 * - from java 9, may use final Resource
 * - resource is closed automatically
 */
public class TryWithResources {

	public static void main(String args[]) throws IOException {
		final BufferedReader br = new BufferedReader(new FileReader(""));
		try (br;
			java.util.zip.ZipFile zf =
			             new java.util.zip.ZipFile("zipFileName")) {
			
			throw new Exception("");
			
		} catch (Exception e) {
			
		}
	}
}
