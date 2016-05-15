package com.swroom.aop7;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 * Created by Ray on 2016/5/9.
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行方法之后");
    }
}
