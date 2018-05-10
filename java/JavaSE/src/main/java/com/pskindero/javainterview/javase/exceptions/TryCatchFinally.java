package com.pskindero.javainterview.javase.exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.FileSystemException;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {} finally {} //It is possible!
		
		try {
			int r = m();
			System.out.println(r);
		} catch (FileNotFoundException e) {
			
		} catch (SocketException | EOFException e) {
			
		} catch (IOException e) {
			
		} 
		//catch (FileSystemException e) {} Unreachable block becasue it is subclass of IOException
	}

	public static int m() throws IOException {
		try {
			throw new Exception();
			//return 1; //unreachable code
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
		//throw new IOException();
	}
}
