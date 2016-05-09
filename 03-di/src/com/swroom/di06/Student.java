package com.swroom.di06;

/**
 * Created by Ray on 2016/4/29.
 */
public class Student {

    private String name;
    private int age;
    private School school;
    private School mySchool;

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

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    public School getMySchool() {
        return mySchool;
    }
}
