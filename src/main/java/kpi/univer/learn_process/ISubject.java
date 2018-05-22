package kpi.univer.learn_process;


import kpi.univer.learn_process.studyPlan.CourseWork;
import kpi.univer.learn_process.studyPlan.Credit;
import kpi.univer.learn_process.studyPlan.Exam;
import kpi.univer.learn_process.studyPlan.StudyPlan;

public abstract class ISubject {
    protected StudyPlan studyPlan;
    public abstract String getSubjectName();
    public abstract StudyPlan getStudyPlan();

    public ISubject(StudyPlan studyPlan) {
        this.studyPlan = studyPlan;
    }

    public ISubject(){}

    public void startStudiingProcess(){
        System.out.println("Starting subject");
        studyPlan.studyPlanDescription();
    }

    @Override
    public String toString() {
        return "ISubject{" + "SubjectName: "+ getSubjectName() +
                "  --->   studyPlan=" + studyPlan.studyPlanDescription() +
                '}';
    }

    public static class Math extends ISubject{

        public Math(StudyPlan studyPlan) {
            super(studyPlan);
        }

        public Math() {
        }

        @Override
        public String getSubjectName() {
            return "MATHEMATIC";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return studyPlan;
        }
    }

    public static class ObjectOrientedProgramming extends ISubject{

        public ObjectOrientedProgramming(StudyPlan studyPlan) {
            super(studyPlan);
        }

        public ObjectOrientedProgramming() {
        }

        @Override
        public String getSubjectName() {
            return "OOP";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return studyPlan;
        }

    }

    public static class DataBase extends ISubject{

        public DataBase(StudyPlan studyPlan) {
            super(studyPlan);
        }

        public DataBase() {
        }

        @Override
        public String getSubjectName() {
            return "Data Base";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return studyPlan;
        }

    }

    public static class TimeSeries extends ISubject{

        public TimeSeries(StudyPlan studyPlan) {
            super(studyPlan);
        }

        public TimeSeries() {
        }

        @Override
        public String getSubjectName() {
            return "Time Series";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return studyPlan;
        }

    }

}
