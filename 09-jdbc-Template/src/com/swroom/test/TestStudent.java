package com.swroom.test;

import com.swroom.beans.Student;
import com.swroom.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ray on 2016/5/16.
 */
public class TestStudent {

    private IStudentService service;

    @Before
    public void before() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        service = (IStudentService) ac.getBean("studentService");
    }

    @Test
    public void testAdd() {
        service.addStudent(new Student("张三", 23));
    }

    @Test
    public void testRemove() {
        service.removeStudent(2);
    }

    @Test
    public void testFindStudentNameById() {
        String name = service.findStudentNameById(2);
        System.out.println(name);
    }

    @Test
    public void testFindStudentById() {
        Student student = service.findStudentById(3);
        System.out.println(student);
    }

}
