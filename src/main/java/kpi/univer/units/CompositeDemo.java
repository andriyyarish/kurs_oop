package kpi.univer.units;

import kpi.univer.persons.srudents.DailyFormStudent;
import kpi.univer.persons.srudents.DistanceFormStudent;

public class CompositeDemo {
    public static void main(String[] args) {
        Univer univer = new Univer();

        Unit kafedra = new Kafedra("IPSA");
        univer.addChildItem(kafedra);
        univer.addChildItem(new Kafedra("LALALA"));
        Unit course = new Kourse("Second Diploma", 1,true);
        kafedra.addChildItem(course);

        Unit group = new DailyFormGroup("IS_ZP-71");
        ((DailyFormGroup) group).addStudent(new DailyFormStudent("Ivan", "Ivanov"));
        ((DailyFormGroup) group).addStudent(new DailyFormStudent("Petr", "Petrov"));
        Unit group2 = new DailyFormGroup("IS_ZP-72");
        ((DailyFormGroup) group2).addStudent(new DistanceFormStudent("John", "Lenon"));

        course.addChildItem(group);
        course.addChildItem(group2);

        univer.describeStructure();



    }
}
