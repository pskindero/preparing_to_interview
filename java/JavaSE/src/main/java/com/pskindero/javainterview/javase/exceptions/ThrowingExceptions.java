package com.pskindero.javainterview.javase.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Need to be remembered:
 * - you can make throw more detailed exception in parent class, but cannot throw more general
 */
public class ThrowingExceptions {

	public static void main(String[] args) {
		
	}

}

abstract class AC {
	public void m() throws IOException {}
}

class CC extends AC{
	public void m() throws FileNotFoundException {}
	//public void m() throws Exception {} CANNOT
}