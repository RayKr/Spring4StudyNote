package com.swroom.aop3;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Ray on 2016/5/14.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("目标方法执行之前");
        // 执行目标方法
        Object result = methodInvocation.proceed();
        System.out.println("目标方法执行之后");
        return result;
    }
}
