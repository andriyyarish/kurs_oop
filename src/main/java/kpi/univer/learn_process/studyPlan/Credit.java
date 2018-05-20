package kpi.univer.learn_process.studyPlan;

public class Credit extends StudyPlan{
    private final int minimumPassRate;

    public Credit(int numberOfHours, int minimumPassRate) {
        super(numberOfHours);
        this.minimumPassRate = minimumPassRate;
    }

    @Override
    public String studyPlanDescription() {
        return String.format("Credit. total duration %d. 3 labs should be done to pass this subject");
    }
}
