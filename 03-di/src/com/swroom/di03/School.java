package com.swroom.di03;

/**
 * Created by Ray on 2016/4/29.
 */
public class School {

    private String name;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

}
