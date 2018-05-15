package kpi.kafedra.teachers;

public interface ISubject {
    String getSubjectName();
    StudyPlan getStudyPlan();

    class Math implements ISubject{

        @Override
        public String getSubjectName() {
            return "MATHEMATIC";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return new StudyPlan.Exam(100, 70);
        }

        @Override
        public String toString() {
            return getSubjectName();
        }
    }

    class ObjectOrientedProgramming implements ISubject{

        @Override
        public String getSubjectName() {
            return "OOP";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return new StudyPlan.CourseWork(50);
        }


        @Override
        public String toString() {
            return getSubjectName();
        }
    }

    class DataBase implements ISubject{

        @Override
        public String getSubjectName() {
            return "Data Base";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return new StudyPlan.Exam(100, 60);
        }


        @Override
        public String toString() {
            return getSubjectName();
        }
    }

    class TimeSeries implements ISubject{

        @Override
        public String getSubjectName() {
            return "Time Series";
        }

        @Override
        public StudyPlan getStudyPlan() {
            return new StudyPlan.Credit(150, 60);
        }

        @Override
        public String toString() {
            return getSubjectName();
        }
    }

}
