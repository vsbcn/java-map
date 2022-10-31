package com.ironhack.main;

import com.ironhack.main.student.Student;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//Create Student class with name and grade (this is an int in the range 0-100), then create Student objects for 4
//of your classmates. create a Map with a key of the student name and a value of a Student object.

        HashMap<String, Student> students = new HashMap<String, Student>();
        students.put("student1", new Student("Silvia", 67));
        students.put("student2", new Student("Juan", 80));
        students.put("student3", new Student("Ana", 75));
        students.put("student4", new Student("Lukas", 75));
        System.out.println("Students registers created: " + students.size());

//Create a method that takes a Map<String, Student> as a parameter, increases every student’s grade by 10%,
//and returns the Map.

        Student.studentGradeIncrease(students);
        for (String i : students.keySet()) {
            System.out.println(students.get(i).getName() + ", new grade: " + students.get(i).getGrade());
        }

    }
}
