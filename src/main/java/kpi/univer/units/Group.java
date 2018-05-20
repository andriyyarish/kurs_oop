package kpi.univer.units;

import kpi.univer.persons.Person;
import kpi.univer.persons.srudents.AbstractStudent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Group implements Unit, IGroup {
    private final String name;
    private Person headOfGroup;
    private List<AbstractStudent> students;

    public Group(String name) {
        this.name = name;
        students = new LinkedList<>();
    }

    public void addStudent(AbstractStudent student){
        students.add(student);
    }

    public void addStudents(List<AbstractStudent> students) {
        this.students.addAll(students);
    }

    public void setHeadOfGroup(Person headOfGroup) {
        this.headOfGroup = headOfGroup;
    }

    public Person getHeadOfGroup() {
        return headOfGroup;
    }

    public List<AbstractStudent> getStudents() {
        return students;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Unit> getChildItems() {
        return new ArrayList<>();
    }

    @Override
    public void addChildItem(Unit unit) {
        throw new NotImplementedException();
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
        return "IGroup{" +
                "name='" + name + '\'' +
                ", headOfGroup=" + headOfGroup +
                ", students=" + students +
                '}';
    }

    @Override
    public int getSize() {
        return 0;
    }
}
