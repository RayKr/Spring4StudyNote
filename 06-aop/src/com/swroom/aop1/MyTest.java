package com.swroom.aop1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "com/swroom/aop1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        ISomeService service = (ISomeService) ac.getBean("serviceProxy");
        service.doSome();
        service.doSecond();

    }
}
