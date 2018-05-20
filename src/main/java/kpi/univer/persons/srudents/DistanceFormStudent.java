package kpi.univer.persons.srudents;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DistanceFormStudent extends AbstractStudent {
    public DistanceFormStudent(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void assignSchoolarship(Double amount) {
        throw new RuntimeException("Distance form students are not allowed to get schoolarship");
    }
}
