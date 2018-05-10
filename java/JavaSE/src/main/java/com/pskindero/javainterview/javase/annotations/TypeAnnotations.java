package com.pskindero.javainterview.javase.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Type annotations were created to support improved analysis of Java programs way of ensuring stronger type checking. 
 * The Java SE 8 release does not provide a type checking framework, but it allows you to write (or download) a type checking 
 * framework that is implemented as one or more pluggable modules that are used in conjunction with the Java compiler.
 * 
 * For example, you want to ensure that a particular variable in your program is never assigned to null; 
 * you want to avoid triggering a NullPointerException. You can write a custom plug-in to check for this. 
 * You would then modify your code to annotate that particular variable, indicating that it is never assigned to null.
 * The variable declaration might look like this:

		@NonNull String str;

 */
@Target({ElementType.ANNOTATION_TYPE})
@interface TypeAnnotations {

}
