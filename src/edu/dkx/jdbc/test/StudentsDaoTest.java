package edu.dkx.jdbc.test;

import edu.dkx.jdbc.dao.IStudentsDao;
import edu.dkx.jdbc.dao.impl.StudentsDaoImpl;
import edu.dkx.jdbc.domain.Student;
import org.junit.Test;


public class StudentsDaoTest {
    @Test
    public void save() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        iStudentsDao.save(new Student(2016212001, "张三", 1, 1));
    }

    @Test
    public void delete() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        iStudentsDao.delete(2);
    }

    @Test
    public void update() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        iStudentsDao.update(1, new Student(100, "杜凯旋", 2, 1));
    }

    @Test
    public void get() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        System.out.println(iStudentsDao.get(2016210823));
    }

    @Test
    public void getAll() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        System.out.println(iStudentsDao.getAll());
    }

    @Test
    public void transMajor() {
        IStudentsDao iStudentsDao = new StudentsDaoImpl();
        iStudentsDao.transMajor(1, 2);
    }
    //git test
}
