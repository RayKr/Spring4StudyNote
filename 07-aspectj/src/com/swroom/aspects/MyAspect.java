package com.swroom.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Aspect 标示该POJO类为切面
 * Created by Ray on 2016/5/15.
 */
@Aspect
class MyAspect {
    // 该注解的value值就是切入点表达式
    @Before("execution(* *..ISomeService.doSome(..))")
    public void myBefore() {
        System.out.println("执行前置通知myBefore");
    }

    @Before("execution(* *..ISomeService.doSecond(..))")
    public void myBefore(JoinPoint jp) {
        System.out.println("执行前置通知myBefore, jp = " + jp);
    }

    @AfterReturning(value = "execution(* *..doSome(..))", returning = "result")
    public void myAfterReturning(Object result) {
        System.out.println("执行AspectJ后置通知,返回值=" + result);
    }

    @Around("execution(* *..doThird(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕：执行目标方法之前执行");
        Object result = pjp.proceed();
        System.out.println("环绕：执行目标方法之前执行,返回值=" + result);
        if (result != null) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }

    @AfterThrowing(value = "execution(* *..ISomeService.doSome(..))", throwing = "ex")
    public void myThrows(Exception ex) {
        System.out.println("执行异常通知myThrows, ex=" + ex.getMessage());
    }
}
