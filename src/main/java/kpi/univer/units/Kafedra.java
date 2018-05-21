package kpi.univer.units;

import kpi.univer.persons.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kafedra implements Unit {
    private final String name;
    private final List<Unit> courses;
    private final List<Person> stuff;
    private Person head;

    public Kafedra(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        stuff = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Unit> getChildItems() {
        return courses;
    }

    @Override
    public void addChildItem(Unit unit) {
        courses.add(unit);
    }

    @Override
    public void describeStructure() {

    }

    @Override
    public String toString() {
        return "Kafedra{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", stuff=" + stuff +
                ", head=" + head +
                '}';
    }
}
