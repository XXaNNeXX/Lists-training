package org.example;

import java.util.Objects;

public class Course {

    private String courseName;
    private String teacher;
    private String room;

    public Course() {
    }
    public Course(String courseName, String teacher, String room) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.room = room;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(teacher, course.teacher) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, teacher, room);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
