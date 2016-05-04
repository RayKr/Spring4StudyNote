package com.swroom.test;

import com.swroom.service.SomeServiceImpl;
import org.junit.Test;

/**
 * Created by Ray on 2016/5/4.
 */
public class MyTest {

    @Test
    public void test () {
        SomeServiceImpl someService = new SomeServiceImpl();
        someService.doSome();
        someService.doSecond();
    }
}
