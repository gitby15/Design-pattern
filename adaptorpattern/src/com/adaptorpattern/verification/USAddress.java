package com.adaptorpattern.verification;

public class USAddress implements AddressValidator {

	@Override
	public boolean isValidAddress(String inp_address, String inp_zip,
			String inp_state) {
		// TODO Auto-generated method stub
		
		
		if(inp_address.trim().length()<10)
			return false;
		if(inp_zip.trim().length()<5)
			return false;
		if(inp_zip.trim().length()>10)
			return false;
		if(inp_state.trim().length() != 2)
			return false;
		
		
		return true;
	}

	

}
