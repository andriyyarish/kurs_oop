package kpi.univer.units;

import kpi.univer.persons.Person;
import kpi.univer.persons.srudents.AbstractStudent;

import java.util.List;

public interface IGroup {
    int getSize();
    List<AbstractStudent> listStudents();
}
