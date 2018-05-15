package kpi.kafedra;

import kpi.Person;
import kpi.students.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Group {
    private final String name;
    private Person headOfGroup;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        students = new LinkedList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public void setHeadOfGroup(Person headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    public String getName() {
        return name;
    }

    public Person getHeadOfGroup() {
        return headOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(headOfGroup, group.headOfGroup) &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, headOfGroup, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", headOfGroup=" + headOfGroup +
                ", students=" + students +
                '}';
    }
}
