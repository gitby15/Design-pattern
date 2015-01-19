package com.adaptorpattern.verification;

public class Customer {
	public static final String US = "US";
	public static final String CANADA = "Canada";
	private String address;
	private String name;
	private String zip,state,type;
	public boolean isValidAddress(String type){
		
		AddressValidator validator = getValidator(type);
		
		
		
		return validator.isValidAddress(address, zip, state);
		
	}
	private AddressValidator getValidator(String type)
	{
		AddressValidator validator = null;
		switch(type)
		{
			case "US":{
				validator = new USAddress();
				break;
			}
			case "Canada":{
				validator = new CanadaAddressAdaptor();
				break;
			}
			default:{
				System.out.println("type not match");
			}
		}
		return validator;
		
	}
	
	public Customer(String inp_name,String inp_address,String inp_zip,String inp_state,String inp_type){
		name = inp_name;
		address = inp_address;
		zip = inp_zip;
		state = inp_state;
		type = inp_type;
		
	}
	
	
	
}
