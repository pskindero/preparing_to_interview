package com.pskindero.learning.designpatterns.proxy;

import com.pskindero.learning.designpatterns.proxy.model.Image;
import com.pskindero.learning.designpatterns.proxy.model.ProxyImage;

/**
 * Proxy Design Pattern
 * 
 * 
 */
public class MainClass {
	
    public static void main( String[] args ) {
    	
    	Image img1 = new ProxyImage("funny_cat.jpg");
    	Image img2 = new ProxyImage("funny_tarantula.jpg");
    	
    	System.out.println("Displaying images: ");
    	img1.display();
    	img2.display();
    	img1.display();
    	img2.display();
    	
    }
}