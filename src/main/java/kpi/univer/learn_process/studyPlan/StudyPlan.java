package kpi.univer.learn_process.studyPlan;

public abstract class StudyPlan{
    protected final int numberOfHours;

    public StudyPlan(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public abstract String studyPlanDescription();


}
