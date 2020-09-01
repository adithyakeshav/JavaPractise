package com.keshava.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class SuppierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adithya", 2, 3.6, "male", Arrays.asList("Chess", "Volleyball", "Cricket"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

        System.out.println(studentSupplier.get());
        System.out.println(listSupplier.get());
    }
}