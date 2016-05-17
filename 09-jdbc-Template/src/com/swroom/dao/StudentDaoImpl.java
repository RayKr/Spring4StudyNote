package com.swroom.dao;

import com.swroom.beans.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by Ray on 2016/5/16.
 */
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {
    @Override
    public void insertStudent(Student student) {
        String sql = "INSERT INTO student(name, age) VALUES (?,?)";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        this.getJdbcTemplate().update(sql, id);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public String selectStudentNameById(int id) {
        return null;
    }

    @Override
    public List<String> selectStudentNames() {
        return null;
    }

    @Override
    public Student selectStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> selectStudents() {
        return null;
    }
}
