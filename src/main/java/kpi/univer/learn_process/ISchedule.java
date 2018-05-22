package kpi.univer.learn_process;

import kpi.univer.persons.srudents.IScheduleObserver;

public interface ISchedule {
    void registerObserver(IScheduleObserver observer);
    void removeObserver(IScheduleObserver observer);
    void notifyObservers();
    void printSchedule();
}
