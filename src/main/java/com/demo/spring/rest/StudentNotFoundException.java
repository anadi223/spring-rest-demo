package com.demo.spring.rest;

//Student not found exception helper class
public class StudentNotFoundException extends RuntimeException {


	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
	

}
