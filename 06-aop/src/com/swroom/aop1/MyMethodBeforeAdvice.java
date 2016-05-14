package com.swroom.aop1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 * Created by Ray on 2016/5/9.
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("目标方法执行之前：对目标对象的增强代码就是写在这里的。");
    }
}
