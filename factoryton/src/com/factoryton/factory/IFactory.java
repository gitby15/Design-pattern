package com.factoryton.factory;

import com.factoryton.product.IFruit;

public interface IFactory {

		//public IFactory getFactory();
		public IFruit getFruit(String key);
}
