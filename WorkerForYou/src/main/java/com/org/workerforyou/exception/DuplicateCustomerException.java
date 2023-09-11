package com.org.workerforyou.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class DuplicateCustomerException extends RuntimeException {
	private final String message;

	public DuplicateCustomerException(String message) {
		super();
		this.message = message;
	}
}
