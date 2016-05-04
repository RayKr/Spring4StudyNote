package com.swroom.di07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/4/29.
 */
public class MyTest {

    @Test
    public void test01() {

        String configLocation = "com/swroom/di07/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        Student student1 = (Student) ac.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) ac.getBean("student2");
        System.out.println(student2);

    }
}
