package kpi.univer.learn_process.studyPlan;

public class Exam extends StudyPlan{
    private final int numberOfLectures;
    public Exam(int numberOfHours, int numberOfLectures) {
        super(numberOfHours);
        this.numberOfLectures = numberOfLectures;
    }

    @Override
    public String studyPlanDescription() {
        return String.format("Exam. total duration %d, number of lectures $d", numberOfHours, numberOfLectures);
    }
}
