package kpi;

import kpi.univer.*;
import kpi.kafedra.teachers.ISubject;
import kpi.kafedra.teachers.Teacher;
import kpi.students.Student;

import java.util.ArrayList;
import java.util.List;

public class UniverFacade {

    private static List<Student> students;
    private static final int STUDENTS_AMOUNT = 90;
    private static List<Group> groups;
    private static List<Teacher> teachers;


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
            Student student = new Student("Ivan_"+i,"Ivanov_"+i, Person.Sex.MALE);
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
        Teacher teacher = new Teacher("John", "Doe", Person.Sex.MALE);
        teacher.addSubject(new ISubject.Math());
        teacher.addSubject(new ISubject.TimeSeries());

        Teacher teacher1 = new Teacher("Angela", "Merkel", Person.Sex.FEMALE);
        teacher1.addSubject(new ISubject.ObjectOrientedProgramming());

        Teacher teacher2 = new Teacher("Petro", "Porokh", Person.Sex.MALE);
        teacher2.addSubject(new ISubject.DataBase());

        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);
    }
}
