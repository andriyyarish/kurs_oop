package kpi.kafedra.teachers;

abstract class StudyPlan{
    private final int numberOfHours;

    public StudyPlan(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    static class Exam extends StudyPlan{
        private final int numberOfLectures;
        public Exam(int numberOfHours, int numberOfLectures) {
            super(numberOfHours);
            this.numberOfLectures = numberOfLectures;
        }
    }

    static class Credit extends StudyPlan{
        private final int minimumPassRate;

        public Credit(int numberOfHours, int minimumPassRate) {
            super(numberOfHours);
            this.minimumPassRate = minimumPassRate;
        }
    }

    static class CourseWork extends StudyPlan{

        public CourseWork(int numberOfHours) {
            super(numberOfHours);
        }
    }

}
