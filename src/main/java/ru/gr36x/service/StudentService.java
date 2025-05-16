package ru.gr36x.service;

import io.ebean.DB;
import ru.gr36x.db.Student;

import java.util.List;

public class StudentService {

    public void createStudent(Student std){
        std.save();
    }

    public void updateStudent(long id, String name, String surname, String groupNum){
        var stud = DB.find(Student.class, id);
        if (stud != null){
            stud.setName(name);
            stud.setSurname(surname);
            stud.setGroupNum(groupNum);
            stud.update();
        }
    }

    public void deleteStudent(long id){
        Student student = DB.find(Student.class, id);
        if (student != null) {
            student.delete();
        }
    }

    public List<Student> getAllStudents(){
        return DB.find(Student.class).findList();
    }
}
