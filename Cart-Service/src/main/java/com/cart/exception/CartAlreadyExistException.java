package com.cart.exception;

public class CartAlreadyExistException extends RuntimeException {

	public CartAlreadyExistException() {
		super();

	}

	public CartAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CartAlreadyExistException(String message, Throwable cause) {
		super(message, cause);

	}

	public CartAlreadyExistException(String message) {
		super(message);

	}

	public CartAlreadyExistException(Throwable cause) {
		super(cause);

	}

}
