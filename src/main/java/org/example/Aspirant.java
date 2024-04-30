package org.example;

public class Aspirant extends Student {

    String researchWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.researchWork = work;
    }

    @Override
    public int getScholarship() {
        if (averageMark == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }



}
