package com.swroom.di05;

/**
 * Created by Ray on 2016/4/29.
 */
public class Student {

    private String name;
    private int age;
    private School mySchool;

    public School getMySchool() {
        return mySchool;
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.mySchool = school;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mySchool=" + mySchool +
                '}';
    }

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
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

    public void initSome() {
        System.out.println("构造之后初始化。。。");
    }

    public void preDead() {
        System.out.println("销毁之前");
    }


}
