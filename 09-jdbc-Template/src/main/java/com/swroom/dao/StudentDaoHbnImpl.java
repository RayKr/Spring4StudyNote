package com.swroom.dao;

import com.swroom.beans.Student;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Ray on 2016/5/18.
 */
public class StudentDaoHbnImpl implements IStudentDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insertStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    public void deleteStudent(int id) {
//        Student student = sessionFactory.getCurrentSession().get(Student.class, id);
        Student student = this.selectStudentById(id);
        sessionFactory.getCurrentSession().delete(student);
    }

    @Override
    public void updateStudent(Student student) {
        sessionFactory.getCurrentSession().update(student);
    }

    @Override
    public String selectStudentNameById(int id) {
        Student student = this.selectStudentById(id);
        if (student != null) {
            return student.getName();
        }
        return "查无此人";
    }

    @Override
    public List<String> selectStudentNames() {
        String hql = "select name from student";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @Override
    public Student selectStudentById(int id) {
        return sessionFactory.getCurrentSession().get(Student.class, id);
    }

    @Override
    public List<Student> selectStudents() {
        String hql = "from student";
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
