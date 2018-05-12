package com.pskindero.javainterview.javase.api.reactive;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

/**
 * - Java 9 introduces API for Reactive Stream - 4 interfaces
 * - Reactive Manifesto:
 * 		Responsive -  system responds in a timely manner if at all possible;
 * 		Resillient - system stays responsive in the face of failure;
 * 		Elastic - system stays responsive under varying workload;
 * 		Message Driven - systems rely on asynchronous message-passing to establish
 * 						 a boundary between components that ensures loose coupling, 
 * 						isolation and location transparency
 * - Backpresure - 
 * 
 * Implementations: RxJava, Akka
 * About: https://dzone.com/articles/reactive-streams-in-java-9
 */
public class ReactiveApi {

	public static void main(String[] args) {
		
	}
	
	//Interfaces
	static Publisher publisher;
	static Subscriber subscriber;	
	static Subscription subscription;
	static Processor processor;
	
	//Implementations:
	static SubmissionPublisher subPublisher;
	

}
