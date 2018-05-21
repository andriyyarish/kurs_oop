package kpi.univer.units;

import kpi.univer.persons.srudents.AbstractStudent;

import java.util.List;

public class RemoteGroup implements IGroup, Unit {
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<AbstractStudent> listStudents() {
        return null;
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

    }
}
