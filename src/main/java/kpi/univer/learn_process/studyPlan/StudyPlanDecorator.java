package kpi.univer.learn_process.studyPlan;

public abstract class StudyPlanDecorator implements StudyPlan {
    protected StudyPlan studyPlan;


    public StudyPlanDecorator(StudyPlan studyPlan) {
        this.studyPlan = studyPlan;
    }

    @Override
    public abstract String studyPlanDescription();
}
