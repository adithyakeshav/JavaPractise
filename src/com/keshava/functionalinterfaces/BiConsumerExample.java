package com.keshava.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer =  (a, b) -> System.out.println("a : " + a + ", b : " + b);
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Product : " + a * b);
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division : " + a / b);

        biConsumer.accept("java7", "java8");
        multiply.andThen(division).accept(100, 20);

        nameAndActivities();
    }
}