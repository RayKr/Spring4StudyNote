package com.swroom.di05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用bean充当spring配置文件，就相当于容器
 * Created by Ray on 2016/5/4.
 */
@Configuration
public class MyJavaConfig {

    @Bean(name = "mySchool")
    public School mySchoolCreator() {
        return new School("南京大学");
    }

    @Bean(name = "myStudent", autowire = Autowire.BY_NAME)
    public Student myStudentCreator() {
        return new Student("张三", 26);
    }
}
