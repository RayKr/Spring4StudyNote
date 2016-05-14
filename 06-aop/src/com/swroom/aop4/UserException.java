package com.swroom.aop4;

/**
 * 受查异常（编译时异常）
 * Created by Ray on 2016/5/14.
 */
public class UserException extends Exception {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}
