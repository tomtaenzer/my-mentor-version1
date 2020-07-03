package de.neuefische.myownmentor.db;

import de.neuefische.myownmentor.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentsDb {

    private final List<Student> students = new ArrayList<>();

    public List <Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void clearDB(){
        students.clear();
    }
}


