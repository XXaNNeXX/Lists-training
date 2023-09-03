package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> schoolStudents = new ArrayList<>();

    public void addStudent(Student student) {

        schoolStudents.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolStudents=" + schoolStudents +
                '}';
    }

    public Student findStudent(int matrikel) {
        for(Student student : schoolStudents) {
            return student;
        }
        return null;
    }

    public void removeStudent(Student name) {
        schoolStudents.remove(name);
    }

    private Student student = new Student();
    public List<Course> studentCourses(Student name) {
        return name.getCourses();
    }
}
