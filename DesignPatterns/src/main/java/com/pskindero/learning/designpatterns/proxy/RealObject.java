package com.pskindero.learning.designpatterns.proxy;

public class RealObject extends AbstractObject{

	public RealObject() {
	}

	@Override
	public String getBehaviorDesc() {
		return "Some real behaviour!";
	}

}
