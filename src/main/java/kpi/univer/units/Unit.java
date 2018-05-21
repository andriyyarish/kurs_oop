package kpi.univer.units;

import java.util.List;

public interface Unit {
    String getName();
    List<Unit> getChildItems();
    void addChildItem(Unit unit);
    void describeStructure();

   /* default void listChildItems(){
        List<Unit> childItems = this.getChildItems();
        System.out.println(String.format("Listing child items of %s", this.getClass().getSimpleName()));
        childItems.stream().forEach(el -> System.out.println(el.toString()));
        System.out.println("\n");
    }*/
}
