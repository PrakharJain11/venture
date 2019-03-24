package com.investmentadvice.equityList.Exception;

public class InvalidFieldException extends RuntimeException {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
