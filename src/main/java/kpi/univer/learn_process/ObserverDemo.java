package kpi.univer.learn_process;

import kpi.univer.learn_process.studyPlan.*;
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

        ((Schedule) schedule).addNewSubjectSchedule(new ISubject.Math(new CourseWork(new Labs(new Exam(10, 12)))), "monday tuesday friday");
        ((Schedule) schedule).addNewSubjectSchedule(new ISubject.ObjectOrientedProgramming(new Quizz(new Labs(new Credit(10,50)))), "friday saturday");
        ((Schedule) schedule).updateSubjectSchedule(new ISubject.Math(new CourseWork(new Credit(30,15))), "friday only");

        schedule.printSchedule();
    }
}
