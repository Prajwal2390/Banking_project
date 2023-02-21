package com;

public class InvalidchoiceExecption extends Exception{
	private String message;
	 InvalidchoiceExecption(String message) {
	this.message=message;
	}
	 @Override
	public String getMessage() {
		return message;
	}
	

}
