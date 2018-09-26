package com.glovoapp.backender.exception;

/**
 * Created by Sridharan Murugadass on 2018-09-26
 */

public class OrderNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1144083935961862256L;

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String message) {
		super(message);
	}

	public OrderNotFoundException(Throwable throwable) {
		super(throwable);
	}

	public OrderNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
