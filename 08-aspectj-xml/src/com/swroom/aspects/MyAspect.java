package com.swroom.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 定义切面
 * Created by Ray on 2016/5/15.
 */
class MyAspect {
    public void myBefore() {
        System.out.println("执行前置通知myBefore");
    }

    public void myBefore(JoinPoint jp) {
        System.out.println("执行前置通知myBefore, jp = " + jp);
    }

    public void myAfterReturning(Object result) {
        System.out.println("执行AspectJ后置通知,返回值=" + result);
    }

    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕：执行目标方法之前执行");
        Object result = pjp.proceed();
        System.out.println("环绕：执行目标方法之前执行,返回值=" + result);
        if (result != null) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }

    public void myThrows(Exception ex) {
        System.out.println("执行异常通知myThrows, ex=" + ex.getMessage());
    }

    public void myAfter() {
        System.out.println("执行最终通知方法myAfter");
    }
}
