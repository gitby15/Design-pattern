package com.factoryton.client;

import com.factoryton.factory.*;
import com.factoryton.product.*;



public class Client {

	
		public static void main(String[] args) {
			IFactory afactory = AFactory.getFactory();
			IFactory bfactory = BFactory.getFactory();
			IFruit appleA = afactory.getFruit("Apple");
			appleA.show();
			
			
			IFruit appleB = bfactory.getFruit("Apple");
			appleB.show();
			
			
			IFruit bananaA = afactory.getFruit("Banana");
			bananaA.show();
			
			
			IFruit bananaB = bfactory.getFruit("Banana");
			bananaB.show();
			
			
			
		}
		
}
