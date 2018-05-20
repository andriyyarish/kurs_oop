package kpi.univer.persons.teahers;

import kpi.univer.learn_process.ISubject;
import kpi.univer.persons.srudents.AbstractStudent;
import kpi.univer.persons.teahers.AbstractTeacher;
import kpi.univer.units.Unit;

import java.util.List;

public class MathTeacher extends AbstractTeacher {
    public MathTeacher(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void teach(ISubject subject) {

    }

    @Override
    public void examine(ISubject subject, AbstractStudent student) {
        String subjectName = subject.getSubjectName();
        System.out.println(String.format("Exmining %s, subject %s",student.getLastName(), subject));
    }


    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public List<Unit> belongsToUnit() {
        return belongToUnits;
    }
}
