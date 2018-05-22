package kpi.univer.persons.srudents;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DistanceFormStudent extends AbstractStudent implements IScheduleObserver{
    public DistanceFormStudent(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    public DistanceFormStudent(String john, String lenon) {
        super(john, lenon);
    }

    @Override
    public void assignSchoolarship(Double amount) {
        throw new RuntimeException("Distance form students are not allowed to get schoolarship");
    }

    @Override
    public void updateSchedule(String info) {
        System.out.println(String.format("My name is %s %s and I was just informed about updates in schedule", firstName, lastName));
        System.out.println(info);
    }
}
