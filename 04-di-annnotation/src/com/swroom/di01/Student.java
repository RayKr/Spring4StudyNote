package com.swroom.di01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Ray on 2016/4/29.
 */
// 与此注解功能相同的还有三个
// @Repository  注解在Dao接口的实现类上，表示当前Dao为组件
// @Service   注解在Service接口的实现类上，表名当前Service为组件
// @Controller  注解Controller类上，表名当前Controller为组件
@Component("myStudent")   // 表明当前类为组件，并且创建的这个组件的对象名称为myStudent。类似于<bean />的id
@Scope("prototype") //作用域，默认singleton
public class Student {

    @Value("张三") //放置在属性上的注解（常用）
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    @Value("25") // 也可以注解在setter方法上，但是不可以放置在getter方法上
    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }





}
