package com.keshava.methodreference;

import java.util.function.Predicate;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class RefactorMethodReferenceExample {

    static Predicate<Student> gradeLevelPredicate = s -> s.getGradeLevel() >= 3;
    public static void main(String[] args) {
        System.out.println(gradeLevelPredicate.test(StudentDatabase.getStudent.get()));
    }
}