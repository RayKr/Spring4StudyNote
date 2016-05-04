package com.swroom.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Ray on 2016/4/29.
 */
@Component("myStudent")
public class Student {

    @Value("张三")
    private String name;
    @Value("25")
    private int age;
    @Autowired
    @Qualifier("mySchool")  // byName方式，两个注解必须一起用
    private School school;

    public School getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initSome() {
        System.out.println("构造之后初始化。。。");
    }

    @PreDestroy
    public void preDead() {
        System.out.println("销毁之前");
    }


}
