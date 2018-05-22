package kpi.univer;

import kpi.univer.persons.srudents.AbstractStudent;
import kpi.univer.units.DailyFormGroup;
import kpi.univer.units.IGroup;
import kpi.univer.units.Unit;

import java.util.ArrayList;
import java.util.List;

public class GroupFactory {
    public static final int GROUP_SIZE = 20;

    public static List<IGroup> instantiateGroups(List<AbstractStudent> students, Unit parentUnit){
        List<IGroup> groups = new ArrayList<>();

        if(students.size()<=20){
            IGroup group = new DailyFormGroup("ISZP-777");
            groups.add(group);
        }else {
            for(int i=1, studentIndex=0; i<=calcGroupsSize(students.size());i++){
                IGroup group = new DailyFormGroup("ISZP-2018_"+i);
                ((DailyFormGroup) group).addStudents(students.subList(studentIndex, studentIndex-1 + GROUP_SIZE));
                studentIndex += GROUP_SIZE;
                groups.add(group);
            }
        }
        return groups;
    }

    private static int calcGroupsSize(int numOfSt){
        int groupsAmount = numOfSt/GROUP_SIZE;
        groupsAmount = numOfSt%GROUP_SIZE>0 ? groupsAmount+=1
                                                    : groupsAmount;
        return groupsAmount;
    }



}
