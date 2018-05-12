package com.pskindero.javainterview.javase.api.reactive;

import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class ExampleSubscriberPublisher {
	public static void main(String[] args) {
		Subscriber<String> s = new ESubscriber<>();
		final SubmissionPublisher<String> sp = new SubmissionPublisher<String>();
		sp.subscribe(s);
		
		
		new Thread(() -> {
			List<String> events = List.of("1", "2", "3", "4", "5", "6");
			events.forEach(sp::submit);
			
			//To not finishing app;
			sleep(20000);
		}).start();
	}

	public static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ESubscriber<T> implements Subscriber<T>{

	Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		this.subscription.request(2);
	}

	@Override
	public void onNext(T item) {
		System.out.println("Event: " + item);
		ExampleSubscriberPublisher.sleep(200);
		this.subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println("Error occured: " + throwable);
	}

	@Override
	public void onComplete() {
		System.out.println("Finishing");
	}

}
