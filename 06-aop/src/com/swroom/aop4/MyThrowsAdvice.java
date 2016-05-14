package com.swroom.aop4;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by Ray on 2016/5/14.
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(UsernameException ex) {
        System.out.println("若发生UsernameException，该方法会自动调用执行！ex=" + ex.getMessage());
    }

    public void afterThrowing(PasswordException ex) {
        System.out.println("若发生PasswordException，该方法会自动调用执行！ex=" + ex.getMessage());
    }
}
