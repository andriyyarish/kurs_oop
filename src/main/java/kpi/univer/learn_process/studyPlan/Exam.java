package kpi.univer.learn_process.studyPlan;

public class Exam implements StudyPlan{
    private final int numberOfLectures;
    public Exam(int numberOfHours, int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }

    @Override
    public String studyPlanDescription() {
        return String.format("\n Exam: total duration %d, number of lectures $d", numberOfLectures);
    }
}
