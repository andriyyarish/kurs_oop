package kpi.univer.learn_process.studyPlan;

import kpi.univer.learn_process.ISchedule;
import kpi.univer.learn_process.ISubject;
import kpi.univer.persons.srudents.IScheduleObserver;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Schedule implements ISchedule {
    private List<IScheduleObserver> observers = new LinkedList<>();
    private Map<ISubject, String> schedule = new HashMap<>();


    @Override
    public void registerObserver(IScheduleObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IScheduleObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(el -> el.updateSchedule(schedule.toString()));
    }

    public void addNewSubjectSchedule(ISubject subject, String descr){
        System.out.println("Updating subject in schedule ...");
        schedule.put(subject, descr);
        notifyObservers();
    }

    public void updateSubjectSchedule(ISubject subject, String descr){
        System.out.println("Updating subject schedule");
        schedule.put(subject, descr);
        notifyObservers();
    }
}
