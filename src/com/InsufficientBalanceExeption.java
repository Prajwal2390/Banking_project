package com;

public class InsufficientBalanceExeption extends RuntimeException{
	
	private String message;
	 InsufficientBalanceExeption(String message) {
		this.message=message;
	}
	 public String getMessage() {
		 return message;
	 }
	

}
