package com.swroom.aop7;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "com/swroom/aop7/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        // 如果使用自动代理服务器，则此处getBean使用目标对象的id即可
        ISomeService service = (ISomeService) ac.getBean("someService");
        service.doSome();
        System.out.println("--------------------------");
        service.doSecond();
        System.out.println("--------------------------");
        service.doThird();

    }
}
