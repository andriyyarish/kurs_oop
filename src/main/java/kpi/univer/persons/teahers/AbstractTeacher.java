package kpi.univer.persons.teahers;

import kpi.univer.learn_process.ISubject;
import kpi.univer.persons.Employee;
import kpi.univer.persons.Person;
import kpi.univer.persons.UnitAssignable;
import kpi.univer.persons.srudents.AbstractStudent;
import kpi.univer.units.Unit;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractTeacher extends Person implements UnitAssignable, Employee {
    protected List<ISubject> subjects;
    protected String position;
    protected List<Unit> belongToUnits;


    public AbstractTeacher(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
        subjects = new LinkedList<>();
        belongToUnits = new LinkedList<>();
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

    public void assignToKafedra(Unit unit){
        belongToUnits.add(unit);
    }

    public abstract void teach(ISubject subject);
    public abstract void examine(ISubject subject, AbstractStudent student);

    @Override
    public String toString() {
        return "AbstractTeacher{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "subjects=" + subjects +
                ", position='" + position + '\'' +
                '}';
    }
}
