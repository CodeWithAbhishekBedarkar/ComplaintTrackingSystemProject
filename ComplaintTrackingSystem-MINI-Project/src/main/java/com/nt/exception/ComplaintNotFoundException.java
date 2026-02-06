package com.nt.exception;




public class ComplaintNotFoundException extends RuntimeException{

	public ComplaintNotFoundException() {
		
	}
	
	public ComplaintNotFoundException(String msg) {
		super(msg);
	}
}
