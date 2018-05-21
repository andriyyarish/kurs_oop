package kpi;

import kpi.univer.learn_process.ISubject;
import kpi.univer.persons.Person;
import kpi.univer.persons.srudents.DailyFormStudent;
import kpi.univer.persons.teahers.AbstractTeacher;
import kpi.univer.persons.srudents.AbstractStudent;
import kpi.univer.persons.teahers.CompScienceTeacher;
import kpi.univer.persons.teahers.MathTeacher;
import kpi.univer.units.*;

import java.util.ArrayList;
import java.util.List;

public class UniverFacade {

    private static List<AbstractStudent> students;
    private static final int STUDENTS_AMOUNT = 90;
    private static List<DailyFormGroup> groups;
    private static List<AbstractTeacher> teachers;


    public static void main(String[] args) {

    }

    private static void initStudents(){
        students = new ArrayList<>();
        for(int i = 0; i< STUDENTS_AMOUNT; i++){
            AbstractStudent student = new DailyFormStudent("Ivan_"+i,"Ivanov_"+i, Person.Sex.MALE);
            students.add(student);
        }
    }

    private static void initGroups(){
        groups = new ArrayList<>();
        DailyFormGroup group1 = new DailyFormGroup("Group_1");
        DailyFormGroup group2 = new DailyFormGroup("Group_2");
        group1.addStudents(students.subList(0, STUDENTS_AMOUNT/3));
        group2.addStudents(students.subList((STUDENTS_AMOUNT/3)+1, ((STUDENTS_AMOUNT/3)*2)));
        groups.add(group1);
        groups.add(group2);
    }



    private static void initTeachers(){
        teachers = new ArrayList<>();
        AbstractTeacher teacher = new MathTeacher("John", "Doe", Person.Sex.MALE);
        teacher.addSubject(new ISubject.Math());

        AbstractTeacher teacher1 = new CompScienceTeacher("Angela", "Merkel", Person.Sex.FEMALE);
        teacher1.addSubject(new ISubject.ObjectOrientedProgramming());


        teachers.add(teacher);
        teachers.add(teacher1);
    }
}
