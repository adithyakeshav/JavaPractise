package com.keshava.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class PredicateStudentExample {
    static Predicate<Student> filterStudentByGradeLevel = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> filterStudentByGPA = s -> s.getGpa() >= 4;

    public static void executeCondition() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach((student )-> {
            if(filterStudentByGradeLevel.and(filterStudentByGPA).test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        executeCondition();
    }
}