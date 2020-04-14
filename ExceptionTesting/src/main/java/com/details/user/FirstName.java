package com.details.user;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FirstName {

	@NotNull(message="pin name cannot be missing or empty")
    @Size(min=2, message="pin name must not be less than 2 characters")
	String pincode;

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
