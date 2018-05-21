package kpi.univer.learn_process.studyPlan;

public class CourseWork extends StudyPlanDecorator{

    public CourseWork(StudyPlan studyPlan) {
        super(studyPlan);
    }

    @Override
    public String studyPlanDescription() {
        return String.format("Course work is required. " + studyPlan.studyPlanDescription());
    }
}
