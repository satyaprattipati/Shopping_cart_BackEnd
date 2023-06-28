package com.cart.exception;

public class CartValidationException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public String message;

    public CartValidationException() {
        super();
        message = "Id already Existing";
    }

    public String getMessage() {

        return message;
    }

}
