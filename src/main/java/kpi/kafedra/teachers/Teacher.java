package kpi.kafedra.teachers;

import kpi.Person;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private List<ISubject> subjects;
    private String position;


    public Teacher(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
        subjects = new LinkedList<>();
    }

    public void addSubject(ISubject subject) {
        subjects.add(subject);
    }

    public void addSubject(List<ISubject> subjects) {
        this.subjects.addAll(subjects);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "subjects=" + subjects +
                ", position='" + position + '\'' +
                '}';
    }
}
