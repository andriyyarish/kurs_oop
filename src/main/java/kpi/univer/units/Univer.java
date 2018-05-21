package kpi.univer.units;

import java.util.ArrayList;
import java.util.List;

public class Univer implements Unit {
    private static final String NAME = "KPI";
    private List<Unit> kafedras;

    public Univer() {
        this.kafedras = new ArrayList<>();
    }

    public void addCourse(Unit courses) {
        this.kafedras.add(courses);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public List<Unit> getChildItems() {
        return kafedras;
    }

    @Override
    public void addChildItem(Unit unit) {
        kafedras.add(unit);
    }

    @Override
    public void describeStructure() {

    }


    @Override
    public String toString() {
        return "Univer{" +
                "kafedras=" + kafedras +
                '}';
    }
}
