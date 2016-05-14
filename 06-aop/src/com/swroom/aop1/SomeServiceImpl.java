package com.swroom.aop1;

/**
 * Created by Ray on 2016/5/9.
 */
public class SomeServiceImpl implements ISomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome()");
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond()");
        return null;
    }
}
