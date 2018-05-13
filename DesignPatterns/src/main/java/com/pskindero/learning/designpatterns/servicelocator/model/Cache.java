package com.pskindero.learning.designpatterns.servicelocator.model;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	private Map<String, Service> registry = new HashMap<String, Service>();
	
	public void addService(Service service) {
		if (!registry.containsKey(service.getName()))
			registry.put(service.getName(), service);
	}
	
	public Service getService(String name) {
		return registry.get(name);
	}
}
