package com.pskindero.javainterview.javase.objects.innerclasses;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExpressions {
	public static void main(String[] args) {
		
	}
}

interface Choose<T extends Number> {
	
	Choose<T> filter(Predicate<T> filter);

    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
	
}