package com.adaptorpattern.verification;

public class CanadaAddressAdaptor extends CanadaAddress implements
		AddressValidator {

	@Override
	public boolean isValidAddress(String inp_address, String inp_zip,
			String inp_state) {
		// TODO Auto-generated method stub
		return isValidCanadaAddr(inp_address,inp_zip, inp_state);
	}

}
