package com.factoryton.factory;

import com.factoryton.product.IFruit;

public class BFactory implements IFactory {

	
	
	private BFactory(){}
	private static IFactory instance = new BFactory();
	
	public static IFactory getFactory() {
		// TODO Auto-generated method stub
		return instance;
	}


	@Override
	public IFruit getFruit(String key) {
		// TODO Auto-generated method stub
		
		/*
		*这里有两种方式实现类的匹配，一种是通过事先在工厂类里面写好Map
		*另一种是通过.properties配置文件来读取
		*这两种方式我TM还不熟练，计划在年前精通JAVA，到时候我要来重构这段代码
		*所以现在先用很傻比的switch来实现，不要笑我
		*
		*/
		String fruitName;
		if(key == null){
			System.out.println("key is null ");
			return null;
		}
		switch(key){
		case "Apple":{
			fruitName = "com.factoryton.product.AppleB";
			break;
			
			}
		case "Banana":{
			fruitName = "com.factoryton.product.BananaB";
			break;
			
			}
		 default:{
			 System.out.println("have not this fruit yet");
			 return null;
		 	}
		}
		
		
		try {
			IFruit fruit = (IFruit)Class.forName(fruitName).newInstance();
			return fruit;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		//return null;
	}

}
