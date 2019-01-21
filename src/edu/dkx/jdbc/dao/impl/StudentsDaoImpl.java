package edu.dkx.jdbc.dao.impl;

import edu.dkx.jdbc.dao.IStudentsDao;
import edu.dkx.jdbc.domain.Student;
import edu.dkx.jdbc.util.JDBCUtil;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentsDaoImpl implements IStudentsDao {
    @Override
    public void save(Student student) {
        String sql = "insert into students values(?,?,?,?)";
        try {
            JDBCUtil.qr.update(sql, student.getId(), student.getName(), student.getClassNum(), student.getDepNum());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(int id, Student student) {
        String sql = "update students set id=?,name=?,classNum=?,depNum=? where id=?";
        try {
            JDBCUtil.qr.update(sql, student.getId(), student.getName(), student.getClassNum(), student.getDepNum(), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {

        String sql = "delete from students where id=?";
        try {
            JDBCUtil.qr.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student get(int i) {
        String sql = "select * from students where id=?";
        try {
            Student s = JDBCUtil.qr.query(sql, new BeanHandler<Student>(Student.class), i);
            return s;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        String sql = "select * from students";
        try {
            return JDBCUtil.qr.query(sql, new BeanListHandler<Student>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void transMajor(int ida, int idb) {
        String sql = "CALL transMajor(?,?)";
        try {
            JDBCUtil.qr.execute(sql, ida, idb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
