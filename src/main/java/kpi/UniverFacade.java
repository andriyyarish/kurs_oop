package kpi;

import kpi.univer.learn_process.ISubject;
import kpi.univer.learn_process.studyPlan.Credit;
import kpi.univer.learn_process.studyPlan.Exam;
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
    private static List<Group> groups;
    private static List<AbstractTeacher> teachers;


    public static void main(String[] args) {
        Univer univer = new Univer();

        Unit kafedra = new Kafedra("IPSA");
        univer.addChildItem(kafedra);

        Unit course = new Kourse("Second Diploma", 1,true);
        kafedra.addChildItem(course);

        Unit group = new Group("IS_ZP-71");
        Unit group2 = new Group("IS_ZP-72");

        course.addChildItem(group);
        course.addChildItem(group2);

        univer.listChildItems();
        kafedra.listChildItems();
        course.listChildItems();

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
        Group group1 = new Group("Group_1");
        Group group2 = new Group("Group_2");
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
