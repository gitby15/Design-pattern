package com.adaptorpattern.verification;

public class CanadaAddress  {

	
	public boolean isValidCanadaAddr(String inp_address, String inp_pcode,
			String inp_prvnc) {

		if(inp_address.trim().length() < 15)
			return false;
		if(inp_pcode.trim().length() != 6)
			return false;		
		if(inp_address.trim().length() < 6)
			return false;
		return true;
	}

}
