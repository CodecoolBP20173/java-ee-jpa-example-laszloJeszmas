package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "Class")
public class Klass {

    @Id
    private String name;

    @ElementCollection
    @Column (name = "Student")
    @OneToMany (mappedBy = "klass")
    private Set<Student> students = new HashSet<>();

    @Enumerated (value = EnumType.STRING)
    private CCLocation city;

    public Klass() {

    }


    public Klass(String name) {
        this.name = name;
        this.city = CCLocation.KRAKOW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
