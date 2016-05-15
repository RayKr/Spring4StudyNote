package com.swroom.aop8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "com/swroom/aop8/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        // 如果使用自动代理服务器，则此处getBean使用目标对象的id即可
        ISomeService service1 = (ISomeService) ac.getBean("someService1");
        service1.doSome();
        service1.doSecond();
        service1.doThird();
        System.out.println("------------------------");
        ISomeService service2 = (ISomeService) ac.getBean("someService2");
        service2.doSome();
        service2.doSecond();
        service2.doThird();

    }
}
