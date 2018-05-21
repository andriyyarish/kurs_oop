package kpi.univer.learn_process.studyPlan;

public class DecoratorDemo {

    public static void main(String[] args) {
        StudyPlan studyPlan = new Exam(100, 50);
        studyPlan = new Labs(studyPlan);
        studyPlan = new Quizz(studyPlan);
        System.out.println("Study plan 1 : \n" + studyPlan.studyPlanDescription());


        StudyPlan studyPlan2 = new Credit(70, 60);
        studyPlan2 = new CourseWork(studyPlan2);
        System.out.println("Study plan 2 : \n" + studyPlan2.studyPlanDescription());
    }
}
