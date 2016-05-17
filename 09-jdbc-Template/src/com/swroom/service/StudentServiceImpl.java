package com.swroom.service;

import com.swroom.beans.Student;
import com.swroom.dao.IStudentDao;

import java.util.List;

/**
 * Created by Ray on 2016/5/16.
 */
public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeStudent(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public String findStudentNameById(int id) {
        return dao.selectStudentNameById(id);
    }

    @Override
    public List<String> findStudentNames() {
        return dao.selectStudentNames();
    }

    @Override
    public Student findStudentById(int id) {
        return dao.selectStudentById(id);
    }

    @Override
    public List<Student> findStudents() {
        return dao.selectStudents();
    }
}
