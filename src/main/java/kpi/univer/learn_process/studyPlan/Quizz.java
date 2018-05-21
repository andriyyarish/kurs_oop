package kpi.univer.learn_process.studyPlan;

public class Quizz extends StudyPlanDecorator {

    public Quizz(StudyPlan studyPlan) {
        super(studyPlan);
    }

    @Override
    public String studyPlanDescription() {
        return "\n Quizz: few quizes are required in the end of each topic" + studyPlan.studyPlanDescription();
    }
}
