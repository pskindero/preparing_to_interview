package com.pskindero.javainterview.javase.inheritance;

public class OverrideNonStatic {
	public static void main(String[] args) {
		II ib = new BB(11);
		AA ab = new BB(22);
		BB bb = new BB(33);
		
		System.out.println("ib.ns = " + ib.ns); 
		System.out.println("ab.ns = " + ab.ns + " ab.getNs() = " + ab.getNs());
		System.out.println("bb.ns = " + bb.ns + " bb.getNs() = " + bb.getNs());
		
		System.out.println("ab.n = " + ab.n + " ab.getN() = " + ab.getN());
		System.out.println("bb.n = " + bb.n + " bb.getN() = " + bb.getN());
	}
}

interface II {
	int ns = 1;
	
	public static int getNs() {
		return ns;
	}
}

class AA implements II {
	public int ns = 2;
	public int n;
	
	public AA(int n) {this.n = n;}
	
	public int getNs() {
		return ns;
	}
	
	public int getN() {return n;}
	
	public synchronized void sync() {}
}

class BB extends AA {
	public int ns = 3;
	public int n;

	public BB(int n) {super(n); this.n = n;}
	
	public int getNs() {
		return ns;
	}
	
	public int getN() {return n;}

	//There is a Eclipse checker for the Missing synchronized on inherited method
	public void sync() {}	//BE CAREFULL
	
}