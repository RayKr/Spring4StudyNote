package com.swroom.aop2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "com/swroom/aop2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        ISomeService service = (ISomeService) ac.getBean("servicKeProxy");
        service.doSome();
        System.out.println("---------------------K-----");
        service.doSecond();

    }
}
