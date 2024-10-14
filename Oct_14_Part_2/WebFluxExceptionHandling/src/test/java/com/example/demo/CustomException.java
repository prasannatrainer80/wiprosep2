package com.example.demo;

public class CustomException extends RuntimeException {

	CustomException(Throwable e) {
		super(e);
	}
}
