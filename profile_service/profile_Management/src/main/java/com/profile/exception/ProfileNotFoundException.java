package com.profile.exception;

public class ProfileNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProfileNotFoundException(String msg) {
		super(msg);
	}

}
