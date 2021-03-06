package com.keshava.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.keshava.data.Student;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentWithNameFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentWithNameFunction.apply("Adi"));

    }
}