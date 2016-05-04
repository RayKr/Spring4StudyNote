package com.swroom.service;

/**
 * 目标类（业务层）
 * Created by Ray on 2016/5/4.
 */
public class SomeServiceImpl implements ISomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome方法");
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond方法");
        return null;
    }


}
