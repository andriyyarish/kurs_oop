package kpi.univer.persons.srudents;

import kpi.univer.persons.srudents.AbstractStudent;

public class DailyFormStudent extends AbstractStudent implements IScheduleObserver {
    public DailyFormStudent(String firstName, String lastName, Sex sex) {
        super(firstName, lastName, sex);
    }

    @Override
    public void updateSchedule(String info) {
        System.out.println("I am daily form student and just get updates about the schedule");
        System.out.println(info);
    }
}
