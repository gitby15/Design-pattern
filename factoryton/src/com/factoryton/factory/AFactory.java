package com.factoryton.factory;

import com.factoryton.product.IFruit;

public class AFactory implements IFactory {

	
	private AFactory(){}
	private static IFactory instance = new AFactory();
	
	public static IFactory getFactory() {
		// TODO Auto-generated method stub
		return instance;
	}

	@Override
	public IFruit getFruit(String key) {
		// TODO Auto-generated method stub
		
		/*
		*���������ַ�ʽʵ�����ƥ�䣬һ����ͨ�������ڹ���������д��Map
		*��һ����ͨ��.properties�����ļ�����ȡ
		*�����ַ�ʽ��TM�����������ƻ�����ǰ��ͨJAVA����ʱ����Ҫ���ع���δ���
		*�����������ú�ɵ�ȵ�switch��ʵ�֣���ҪЦ��
		*
		*/
		String fruitName;
		if(key == null){
			System.out.println("key is null ");
			return null;
		}
		switch(key){
		case "Apple":{
			fruitName = "com.factoryton.product.AppleA";
			break;
			
			}
		case "Banana":{
			fruitName = "com.factoryton.product.BananaA";
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
