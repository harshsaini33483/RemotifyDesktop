package com.remotify.exceptionmy;

public class CloseException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CloseException() {
		super("Either Client is Disconnect or there is problem in InputStream");
	}
	
	

}
