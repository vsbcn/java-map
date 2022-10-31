package com.ironhack.main.student;

import java.util.HashMap;

public class Student {

    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.err.print("Introduce valid grade between 0-100");
        }
    }

    public Student(String name, Integer grade) {
        this.name = name;
        setGrade(grade);
    }

    public static HashMap<String, Student> studentGradeIncrease(HashMap<String, Student> students) {
        final double increment = 1.1;

        for (String i : students.keySet()) {
            students.get(i).setGrade((int) (students.get(i).getGrade() * increment));
        }

        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
