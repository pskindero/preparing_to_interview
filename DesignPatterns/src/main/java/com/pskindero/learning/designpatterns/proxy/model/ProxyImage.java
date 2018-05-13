package com.pskindero.learning.designpatterns.proxy.model;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	public void display() {
		if (!isLoadedImage()) {
			loadImage();
		}
		this.realImage.display();
	}
	
	private boolean isLoadedImage() {
		return this.realImage != null;
	}
	
	private void loadImage() {
		System.out.println("Loading image: " + this.fileName);
		this.realImage = new RealImage(this.fileName);
	}
}
