package com.springformvalid.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class loginData {
	
	@NotBlank(message = "User Name can not be empty !!")
	@Size(min = 3, max = 12, message = "User name must be 3 to 12 character!! ")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "must be a well-formed email address")
	private String email;
	
	
	@AssertTrue(message = "must agree term and condition")
	private boolean agreed;
	public loginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "loginData [userName=" + userName + ", email=" + email + "]";
	}
	

}
