package kpi.univer.units;

import kpi.univer.persons.Person;
import kpi.univer.persons.srudents.AbstractStudent;

import java.util.ArrayList;
import java.util.List;

public class RemoteGroup implements IGroup, Unit {
    private final String name;
    private Person headOfGroup;
    private List<AbstractStudent> students;

    public RemoteGroup(String name, List<AbstractStudent> students) {
        this.students.addAll(students);
        this.name = name;
    }

    public RemoteGroup(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<AbstractStudent> listStudents() {
        return students;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Unit> getChildItems() {
        return null;
    }

    @Override
    public void addChildItem(Unit unit) {

    }

    @Override
    public void describeStructure() {
        System.out.println("Remote group: " + name);
        students.forEach(el -> System.out.println(el.getFirstName()+el.getLastName()));
    }
}
