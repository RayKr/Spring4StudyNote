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
        String sql = "UPDATE student SET NAME = ?, age = ? WHERE id = ?";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
    }

    @Override
    public String selectStudentNameById(int id) {
        String sql = "select name from student where id = ?";
        return this.getJdbcTemplate().queryForObject(sql, String.class, id);
    }

    @Override
    public List<String> selectStudentNames() {
        String sql = "select name from student";
        return this.getJdbcTemplate().queryForList(sql, String.class);
    }

    @Override
    public Student selectStudentById(int id) {
        String sql = "select id, name, age from student where id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new StudentMapper(), id);
    }

    @Override
    public List<Student> selectStudents() {
        String sql = "select id, name, age from student where";
        return this.getJdbcTemplate().query(sql, new StudentMapper());
    }
}
