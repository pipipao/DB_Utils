package edu.dkx.jdbc.dao;

import edu.dkx.jdbc.domain.Student;

import java.util.List;

public interface IStudentsDao {
    //insert
    void save(Student student);

    //update
    void update(int id, Student student);

    //delete
    void delete(int id);

    //query
    Student get(int i);

    //query all
    List<Student> getAll();

    //transMajor
    void transMajor(int ida, int idb);

}
