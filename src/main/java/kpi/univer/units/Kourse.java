package kpi.univer.units;

import java.util.ArrayList;
import java.util.List;

public class Kourse implements Unit {
    private final List<Unit> groups;
    private final int courseNumber;
    private final boolean isBachelor;
    private final String name;

    public Kourse(String name, int courseNumber, boolean isBachelor) {
        this.groups = new ArrayList<>();
        this.courseNumber = courseNumber;
        this.isBachelor = isBachelor;
        this.name = name;
    }

    public void addGroup(DailyFormGroup group){
        groups.add(group);
    }

    public void addGroup(List<DailyFormGroup> group){

    }

    @Override
    public String getName() {
        return String.format("Name: %s at course %d",name, courseNumber );
    }

    @Override
    public List<Unit> getChildItems() {
        return groups;
    }

    @Override
    public void addChildItem(Unit unit) {
        groups.add(unit);
    }

    @Override
    public void describeStructure() {

    }

    @Override
    public String toString() {
        return "Kourse{" +
                "groups=" + groups +
                ", courseNumber=" + courseNumber +
                ", isBachelor=" + isBachelor +
                ", name='" + name + '\'' +
                '}';
    }
}
