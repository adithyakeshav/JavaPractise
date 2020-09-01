package com.keshava.methodreference;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> printConsumer = System.out :: println ;
    static Supplier<Map<String, Double>> getGpaSupplier = () -> {
        Map<String, Double> studentMap = new HashMap<>();

        StudentDatabase.getAllStudents().forEach(s -> {
            studentMap.put(s.getName(), s.getGpa() );
        });

        return studentMap;
    };
    static Predicate<Student> gradePredicate = s -> s.getGpa() > 4.0;

    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(student -> {
            if(gradePredicate.test(student)) {
                printConsumer.accept(student);
            }
        });
    }
}