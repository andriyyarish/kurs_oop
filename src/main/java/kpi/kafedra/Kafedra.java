package kpi.kafedra;

import kpi.Person;
import kpi.kafedra.teachers.Teacher;
import kpi.students.Student;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Kafedra {
    private String name;
    private List<Group> groups;
    private List<Teacher> teachers;
    private Person head;

    public Kafedra(String name) {
        this.name = name;
        groups = new LinkedList<>();
        //TODO
        groups.add(new Group("A"));
        groups.add(new Group("B"));
        teachers = new LinkedList<>();
    }

    void assignTeachers(List<Teacher> teachers){
        teachers.addAll(teachers);
    }

    public void allocateStudents(List<Student> students){
        for(Student s: students) {
            groups.sort(new Comparator<Group>() {
                @Override
                public int compare(Group o1, Group o2) {
                    return new Integer(o1.getStudents().size()).compareTo(o2.getStudents().size());
                }
            });
            groups.get(0).addStudent(s);
        }
    }
}
