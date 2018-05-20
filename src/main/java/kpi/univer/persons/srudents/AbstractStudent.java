package kpi.univer.persons.srudents;

import kpi.univer.persons.Person;
import kpi.univer.persons.UnitAssignable;
import kpi.univer.units.Unit;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStudent extends Person implements UnitAssignable {
    private Unit group;
    protected double schoolarship;

    public AbstractStudent(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public List<Unit> belongsToUnit() {
        ArrayList<Unit> groups = new ArrayList<>();
        groups.add(group);
        return groups;
    }

    public void assignSchoolarship(Double amount){
        schoolarship = amount;
    }
}
