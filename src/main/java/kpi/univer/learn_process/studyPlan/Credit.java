package kpi.univer.learn_process.studyPlan;

public class Credit implements StudyPlan{
    private final int minimumPassRate;
    private final int numberOfHours;

    public Credit(int numberOfHours, int minimumPassRate) {
        this.minimumPassRate = minimumPassRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String studyPlanDescription() {
        return String.format("\n Credit: total duration %d.", numberOfHours );
    }
}
