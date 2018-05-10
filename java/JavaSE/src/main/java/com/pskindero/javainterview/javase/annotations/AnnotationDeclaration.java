package com.pskindero.javainterview.javase.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * To be remembered:
 * - from java 8 can be also used: (named Type Annotations)
  	class instance creation: 	new @Ann Dupa();
  	type cast:					A a = (@NotNull A) b;
  	implements:					class C<T> implements @Readonly List<@Readonly T> { ... }
  	throws: 					void m() throws @Critical TemperatureException { ... }
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)  //annotation used during runtime
@Target({ElementType.CONSTRUCTOR})
@interface AnnotationDeclaration {
	String author();

	String date();

	int currentRevision() default 1;

	TimeUnit reviewers() default TimeUnit.HOURS;
}
