package com.glovoapp.backender.exception;

/**
 * Created by Sridharan Murugadass on 2018-09-26
 */

public class CourierNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3486177010503619892L;

	public CourierNotFoundException() {
		super();
	}

	public CourierNotFoundException(String message) {
		super(message);
	}

	public CourierNotFoundException(Throwable throwable) {
		super(throwable);
	}

	public CourierNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
