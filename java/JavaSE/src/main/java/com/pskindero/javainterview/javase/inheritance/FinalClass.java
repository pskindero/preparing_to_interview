package com.pskindero.javainterview.javase.inheritance;

/**
 * Methods called from constructors should generally be declared final. 
 * If a constructor calls a non-final method, a subclass may redefine 
 * that method with surprising or undesirable results.
 */
public final class FinalClass {

}

//class A extends FinalClass {} CANNOT
