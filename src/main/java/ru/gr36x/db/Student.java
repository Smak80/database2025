package ru.gr36x.db;

import io.ebean.Model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String surname;
    String groupNum;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public Student(String name, String surname, String groupNum){
        this.name = name;
        this.surname = surname;
        this.groupNum = groupNum;
    }

    public List<Grade> getGrades() { return grades; }
    public void setGrades(List<Grade> grades) { this.grades = grades; }

    @Override
    public String toString(){
        return id + ". " + surname + " " + name + " (гр. " + groupNum + ")";
    }
}
