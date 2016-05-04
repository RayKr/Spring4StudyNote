package com.swroom.test;

import com.swroom.service.ISomeService;
import com.swroom.service.SomeServiceImpl;
import com.swroom.utils.SomeUtil;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Ray on 2016/5/4.
 */
public class MyTest {

    @Test
    public void test () {
        final ISomeService service = new SomeServiceImpl();
        //使用动态代理将底层服务（SomeUtil）和业务层（ISomeService）织入到一起
        ISomeService proxy = (ISomeService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        SomeUtil.doTransaction();
                        Object result = method.invoke(service, args);
                        SomeUtil.doLog();
                        return result;
                    }
                }
        );
        // 使用增强后的代理类执行方法
        proxy.doSome();
        proxy.doSecond();
    }
}
