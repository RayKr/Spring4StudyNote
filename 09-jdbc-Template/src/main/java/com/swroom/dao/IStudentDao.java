package com.swroom.dao;

import com.swroom.beans.Student;

import java.util.List;

/**
 * Created by Ray on 2016/5/16.
 */
public interface IStudentDao {
    void insertStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    String selectStudentNameById(int id);

    List<String> selectStudentNames();

    Student selectStudentById(int id);

    List<Student> selectStudents();

}
