package com.pskindero.javainterview.javase.api.numbers;

public class NumberWrappers {

	public static void main(String[] args) {
		byte a = 110;
		int i = a;
		float f = a;
		
		int ib = 200;
		byte b = (byte) ib; // -56
		
		Integer in = 1; //autoboxing
		int ii = in; //unboxing
		long ll = in; 
		//Integer in2 = 10l; Type mismatch!
		
		//
		m(1); //int
		short s=1; m(s); //short
		m((byte) 1); //byte
		//m(123456789123456); compilation error
		m(123456789123456l); //long
		//m((Short) 1); //canot cast to short!
		Short ss = 1; m(ss); //Short
		
		m(1.2); //double
	}

	public static void m(byte s) { System.out.println("byte");}
	public static void m(short s) { System.out.println("short");}
	public static void m(int s) { System.out.println("int");}
	public static void m(long s) { System.out.println("long");}
	public static void m(float s) { System.out.println("float");}
	public static void m(double s) { System.out.println("double");}
	public static void m(Byte s) { System.out.println("Byte");}
	public static void m(Short s) { System.out.println("Short");}
	public static void m(Integer s) { System.out.println("Integer");}
	public static void m(Long s) { System.out.println("Long");}
	public static void m(Float s) { System.out.println("Float");}
	public static void m(Double s) { System.out.println("Double");}
}
