package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Lisa", "Schmidt", 123));
        students.add(new Student("Marie", "Meier", 456));
        students.add(new Student("Brian", "Bauer", 789));

        School school = new School();
        school.addStudent(new Student("Lisa", "Schmidt", 123));
        school.addStudent(new Student("Marie", "Meier", 456));
        school.addStudent(new Student("Brian", "Bauer", 789));

        System.out.println("Students list: " + students);
        System.out.println("School list: " + school);

        System.out.println(school.findStudent(123));

        school.removeStudent(new Student("Brian", "Bauer", 789));
        System.out.println(school);

        Course lists = new Course();
        lists.setCourseName("Lists");
        lists.setTeacher("Florian");
        lists.setRoom("ffm-23-1");

        Course maps = new Course();
        maps.setCourseName("Maps");
        maps.setTeacher("Elvedin");
        maps.setRoom("Zoom");

        List<Course> courses = new ArrayList<>();
        courses.add(lists);
        courses.add(maps);



    }
}