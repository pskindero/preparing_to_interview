package com.pskindero.learning.javaee.di;

import javax.inject.Inject;
import javax.inject.Named;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pskindero.learning.javaee.di.binding.byannotation.AnnotationForBindings;
import com.pskindero.learning.javaee.di.binding.byannotation.IAnnotationBinding;
import com.pskindero.learning.javaee.di.binding.linked.ILinkedBindings;
import com.pskindero.learning.javaee.di.scope.SingletonScopeExample;

public class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new GuiceModule());
		
		App app = injector.getInstance(App.class);
		app.linkedBinding.printName();
		app.annotationBinding.printName();
		System.out.println(app.instanceBinding);
		System.out.println(app.usingProvider);
		System.out.println(app.untargetedBinding);
		
		app.singl1.getAndIncrement();
		System.out.println(app.singl1.get() + " " + app.singl2.get());
		
	}
	
	/**
	 * Linked bindings map a type to its implementation.
	 */
	@Inject ILinkedBindings linkedBinding;
	
	/**
	 * Allow multiple-buildings for same type
	 */
	@Inject @AnnotationForBindings IAnnotationBinding annotationBinding;

	/**
	 * Same as Annotation Binding
	 */
	@Inject @Named("database_url") String instanceBinding;
	
	/**
	 * Defined provider in Module class
	 */
	@Inject Byte usingProvider;
	
	/**
	 * Implementation injected
	 */
	@Inject Object untargetedBinding;
	
	/**
	 * Scopes:
	 * by default, Guice returns a new instance each time it supplies a value
	 * @Singleton - must be thread-safe
	 * @SessionScoped - must be thread-safe
	 * @RequestScoped
	 */
	@Inject SingletonScopeExample singl1;
	@Inject SingletonScopeExample singl2;
}
