package com.swroom.service;

import com.swroom.utils.SomeUtil;

/**
 * Created by Ray on 2016/5/4.
 */
public class SomeServiceImpl implements ISomeService {
    @Override
    public void doSome() {
        SomeUtil.doTransaction();
        System.out.println("执行doSome方法");
        SomeUtil.doLog();
    }

    @Override
    public String doSecond() {
        SomeUtil.doTransaction();
        System.out.println("执行doSecond方法");
        SomeUtil.doLog();
        return null;
    }


}
