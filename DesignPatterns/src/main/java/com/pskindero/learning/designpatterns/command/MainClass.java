package com.pskindero.design_patterns.command;

import com.pskindero.design_patterns.command.model.Broker;
import com.pskindero.design_patterns.command.model.BuyStock;
import com.pskindero.design_patterns.command.model.SellStock;
import com.pskindero.design_patterns.command.model.Stock;

/**
 * Example of Command Pattern implemenation.
 * 
 */
public class MainClass {
	
    public static void main( String[] args ) {
    	Stock kghm = new Stock("KGHM", 5);
    	Stock pzu = new Stock("PZU", 4);
    	
    	Broker broker = new Broker();
    	broker.addOrder(new BuyStock(kghm));
    	broker.addOrder(new SellStock(pzu));
    	
    	broker.executeOrders();
    }
}
