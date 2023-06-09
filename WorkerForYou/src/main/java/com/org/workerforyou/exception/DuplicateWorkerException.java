package com.org.workerforyou.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class DuplicateWorkerException extends RuntimeException {
	
	private final String message;

	public DuplicateWorkerException(String message) {
		super();
		this.message = message;
	}
	
}
