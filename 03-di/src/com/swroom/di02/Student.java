package com.swroom.di02;

/**
 * Created by Ray on 2016/4/29.
 */
public class Student {

    private String name;
    private int age;
    private School school;

    public Student() {
        // 构造注入是不调用无参构造器的
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, String age, School mySchool) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
