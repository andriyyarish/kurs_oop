package kpi.univer.learn_process.studyPlan;

public class CourseWork extends StudyPlan{

    public CourseWork(int numberOfHours) {
        super(numberOfHours);
    }

    @Override
    public String studyPlanDescription() {
        return String.format("Course work. ");
    }
}
