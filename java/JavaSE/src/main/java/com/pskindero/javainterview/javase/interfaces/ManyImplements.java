package com.pskindero.javainterview.javase.interfaces;

public class ManyImplements {

	public static void main(String[] args) {
		I100 i100 = new ManyImpl();
		I200 i200 = new ManyImpl();
		ManyImpl m = new ManyImpl();
		
		System.out.println(i100.i + " " + i200.i);
		//ManyImpl.i; -> it is ambigous, use directly interface
		
	}
}

interface I100 {
	int i = 100;
}

interface I200 {
	int i = 200;
}

class ManyImpl implements I100, I200 {
	
}