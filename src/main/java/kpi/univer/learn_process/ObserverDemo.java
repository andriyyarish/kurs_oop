package kpi.univer.learn_process;

import kpi.univer.learn_process.studyPlan.Schedule;
import kpi.univer.persons.Person;
import kpi.univer.persons.srudents.DistanceFormStudent;
import kpi.univer.persons.srudents.IScheduleObserver;

public class ObserverDemo {
    public static void main(String[] args) {
        ISchedule schedule = new Schedule();
        IScheduleObserver scheduleObserver1 = new DistanceFormStudent("petr", "petrov", Person.Sex.MALE);
        IScheduleObserver scheduleObserver2 = new DistanceFormStudent("ivan", "ivanov", Person.Sex.MALE);
        IScheduleObserver scheduleObserver3 = new DistanceFormStudent("jimy", "hendrix", Person.Sex.MALE);

        schedule.registerObserver(scheduleObserver1);
        schedule.registerObserver(scheduleObserver2);
        schedule.registerObserver(scheduleObserver3);

        ((Schedule) schedule).addNewSubjectSchedule(new ISubject.Math(), "monday tuesday friday");
        ((Schedule) schedule).addNewSubjectSchedule(new ISubject.ObjectOrientedProgramming(), "friday saturday");
        ((Schedule) schedule).updateSubjectSchedule(new ISubject.Math(), "friday only");
    }
}
