package com.swroom.service;

/**
 * Created by Ray on 2016/5/9.
 */
public class SomeServiceImpl implements ISomeService {
    @Override
    public String doSome() {
        System.out.println("执行doSome()");
        return "Qingdao";
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond()");
        return null;
    }

    @Override
    public String doThird() {
        System.out.println("执行doThird()方法");
        return "Nut Beans";
    }
}
