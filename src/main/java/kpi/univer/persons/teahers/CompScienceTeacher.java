package kpi.univer.persons.teahers;

import kpi.univer.learn_process.ISubject;
import kpi.univer.units.Unit;

import java.util.List;

public class CompScienceTeacher extends AbstractTeacher {
    public CompScienceTeacher(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void teach(ISubject subject) {

    }

    @Override
    public void examine() {

    }

    @Override
    public double getSalary() {
        return 1000;
    }

    @Override
    public List<Unit> belongsToUnit() {
        return belongsToUnits;
    }
}
