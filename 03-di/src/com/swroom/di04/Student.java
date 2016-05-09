package com.swroom.di04;

import java.util.*;

/**
 * Created by Ray on 2016/4/29.
 */
public class Student {

    private String name;
    private int age;
    private School school;
    private Map<String, String> mMap;
    private List<School> mList;
    private String[] mStrs;
    private Set<String> mSets;
    private Properties mPros;
    private School mySchool;

    public List<School> getmList() {
        return mList;
    }

    public void setmList(List<School> mList) {
        this.mList = mList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                ", mMap=" + mMap +
                ", mList=" + mList +
                ", mStrs=" + Arrays.toString(mStrs) +
                ", mSets=" + mSets +
                ", mPros=" + mPros +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public School getSchool() {
        return school;
    }

    public Map<String, String> getmMap() {
        return mMap;
    }

    public void setmMap(Map<String, String> mMap) {
        this.mMap = mMap;
    }

    public String[] getmStrs() {
        return mStrs;
    }

    public void setmStrs(String[] mStrs) {
        this.mStrs = mStrs;
    }

    public Set<String> getmSets() {
        return mSets;
    }

    public void setmSets(Set<String> mSets) {
        this.mSets = mSets;
    }

    public Properties getmPros() {
        return mPros;
    }

    public void setmPros(Properties mPros) {
        this.mPros = mPros;
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
