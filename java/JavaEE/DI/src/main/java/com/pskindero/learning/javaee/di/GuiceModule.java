package com.pskindero.learning.javaee.di;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.pskindero.learning.javaee.di.binding.byannotation.AnnotationBindingImpl;
import com.pskindero.learning.javaee.di.binding.byannotation.AnnotationForBindings;
import com.pskindero.learning.javaee.di.binding.byannotation.IAnnotationBinding;
import com.pskindero.learning.javaee.di.binding.linked.ILinkedBindings;
import com.pskindero.learning.javaee.di.binding.linked.LinkedBindingsImpl;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ILinkedBindings.class).to(LinkedBindingsImpl.class);
		
		bind(IAnnotationBinding.class).annotatedWith(AnnotationForBindings.class).to(AnnotationBindingImpl.class);
		
		bind(String.class).annotatedWith(Names.named("database_url")).toInstance("jdbc:mysql://localhost:1234/mydb");;
	}
	
	@Provides
	Byte byteRandomProvider() {
		return 7;
	}
}
