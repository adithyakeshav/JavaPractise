package com.keshava.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class BiFunctionExample {

    static BiFunction<List<Student>, BiPredicate<Double, Integer>, Map<String, Double>> getStudentGradesWithCondition = 
        (students, predicate) -> {
            Map<String, Double> studentMap = new HashMap<>();

            students.forEach(student -> {
                if(predicate.test(student.getGpa(), student.getGradeLevel())) {
                    studentMap.put(student.getName(), student.getGpa());
                }
            });

            return studentMap;
        };

    public static void main(String[] args) {
        System.out.println(getStudentGradesWithCondition.apply(
            StudentDatabase.getAllStudents(), 
            new PredicateAndConsumerExample().filterByGpaAndGradeLevelValue
            ));
    }
}