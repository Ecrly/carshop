package com.karl.carshop.service.ex;

public class UserNotLogin extends  SelectException{
    public UserNotLogin() {
        super();
    }

    public UserNotLogin(String message) {
        super(message);
    }

    public UserNotLogin(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotLogin(Throwable cause) {
        super(cause);
    }

    protected UserNotLogin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
