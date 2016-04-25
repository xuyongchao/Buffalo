package com.buffalo.extend.util;

/**
 * Created by ChrisChen on 2015/11/1.
 */
@SuppressWarnings("serial")
public class CustomException extends Exception {

	private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomException(String exMsg) {
        super(exMsg);
        message = exMsg;
    }
}
