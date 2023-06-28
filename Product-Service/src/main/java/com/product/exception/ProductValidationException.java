package com.product.exception;

public class ProductValidationException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public String message;

    public ProductValidationException() {
        super();
        message = "Id already Existing";
    }

    public String getMessage() {

        return message;
    }

}
