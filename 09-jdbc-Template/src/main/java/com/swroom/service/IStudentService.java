package com.swroom.service;

import com.swroom.beans.Student;

import java.util.List;

/**
 * Created by Ray on 2016/5/16.
 */
public interface IStudentService {

    void addStudent(Student student);
    void removeStudent(int id);
    void modifyStudent(Student student);

    String findStudentNameById(int id);
    List<String> findStudentNames();

    Student findStudentById(int id);
    List<Student> findStudents();

}
