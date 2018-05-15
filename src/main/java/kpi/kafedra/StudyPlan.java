package kpi.kafedra;

import kpi.kafedra.teachers.ISubject;
import kpi.kafedra.teachers.Teacher;

import java.util.HashMap;
import java.util.Map;

public class StudyPlan {
    private int year;
    private int quarter;
    private Group group;
    private Map<ISubject, Teacher> subjectToTeacherMapping;

    public StudyPlan(int year, int quarter, Group group) {
        this.year = year;
        this.quarter = quarter;
        this.group = group;
        subjectToTeacherMapping = new HashMap<>();
    }

    public void addSubject(ISubject subject, Teacher teacher){
        Teacher added = subjectToTeacherMapping.putIfAbsent(subject, teacher);
    }

    public void removeSubject(ISubject subject){
        Teacher removed = subjectToTeacherMapping.remove(subject);
        System.out.println(String.format("Subject %s with assotiated teacher %s removed from study plan", subject, removed));
    }

    public void setSubjectToTeacherMapping(Map<ISubject, Teacher> subjectToTeacherMapping) {
        this.subjectToTeacherMapping.putAll(subjectToTeacherMapping);
    }


}
