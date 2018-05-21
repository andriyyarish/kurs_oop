package kpi.univer.learn_process.studyPlan;

public class Labs extends StudyPlanDecorator {

    public Labs(StudyPlan studyPlan) {
        super(studyPlan);
    }

    @Override
    public String studyPlanDescription() {
        return " \n Labs: 10 labs required." + studyPlan.studyPlanDescription();
    }
}
