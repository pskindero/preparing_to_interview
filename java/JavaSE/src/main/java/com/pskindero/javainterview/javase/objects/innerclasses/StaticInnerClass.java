package com.pskindero.javainterview.javase.objects.innerclasses;

/**
 * Need to be remembered:
 * - initialization:
		StaticInnerClass.Inner in = new StaticInnerClass.Inner()
 * - no access to local members of outer class
 * - no shadowing
 * - can contains non-final and final static member
 * - can contains static method
 */
public class StaticInnerClass {

	private int i = 0;
	private int j = 0;
	
	public static void main(String...strings) {
		StaticInnerClass.Inner in = new StaticInnerClass.Inner();
	}
	
	public static class Inner {
		
		public final static int FIS = 3;
		public static int IS = 3;  
		
		
		private int j = 2;
		
		public void m1() {
			//i = 1; cannot
		}
		
		public static void s() {
			
		}
	}
}
