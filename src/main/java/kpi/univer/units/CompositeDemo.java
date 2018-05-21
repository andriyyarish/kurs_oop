package kpi.univer.units;

public class CompositeDemo {
    public static void main(String[] args) {
        Univer univer = new Univer();

        Unit kafedra = new Kafedra("IPSA");
        univer.addChildItem(kafedra);

        Unit course = new Kourse("Second Diploma", 1,true);
        kafedra.addChildItem(course);

        Unit group = new DailyFormGroup("IS_ZP-71");
        Unit group2 = new DailyFormGroup("IS_ZP-72");

        course.addChildItem(group);
        course.addChildItem(group2);



    }
}
