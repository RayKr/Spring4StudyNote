package com.swroom.test;

import com.swroom.service.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        ISomeService service = (ISomeService) ac.getBean("someService");
        service.doSome();
        System.out.println("----------------------");
        service.doSecond();
        System.out.println("----------------------");
        String s = service.doThird();
        System.out.println(s);

    }
}
