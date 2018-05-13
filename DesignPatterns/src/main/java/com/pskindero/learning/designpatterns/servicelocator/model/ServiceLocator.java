package com.pskindero.learning.designpatterns.servicelocator.model;

public class ServiceLocator {

	private Cache cache;
	
	public ServiceLocator() {
		cache = new Cache();
	}
	
	public Service getService(String serviceName) {
		Service service = cache.getService(serviceName);
		if (service != null)
			return service;
		
		InitialContext ctx = new InitialContext();
		service  = (Service) ctx.lookup(serviceName);
		cache.addService(service);
		return service;
	}
}
