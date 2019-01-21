package edu.dkx.jdbc.domain;

public class Student {
    private Integer id;
    private String name;
    private Integer classNum;
    private Integer depNum;

    public Student(Integer id, String name, Integer classNum, Integer depNum) {
        this.id = id;
        this.name = name;
        this.classNum = classNum;
        this.depNum = depNum;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public Integer getDepNum() {
        return depNum;
    }

    public void setDepNum(Integer depNum) {
        this.depNum = depNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNum=" + classNum +
                ", depNum=" + depNum +
                '}';
    }
}
