package org.example.week4.people;

import java.util.*;

public class Student extends Person {

    public int credits=0;

    private int student_id;
    private ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
    }

    public int study() {
        return this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n credits " + this.credits;
    }

    public int getStudent_id() {
        return this.student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }


    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits);
        olli.study();
        System.out.println("credits "+ olli.credits);

    }

}
