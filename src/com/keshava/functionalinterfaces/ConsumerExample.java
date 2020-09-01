package com.keshava.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class ConsumerExample {
    static Consumer<Student> consumer = student -> System.out.println(student);
    static Consumer<Student> consumerName = student -> System.out.println("Name : " + student.getName());
    static Consumer<Student> consumerActivites = student -> System.out.println("Activities : " + student.getActivities() + "\n");

    public static void printName() {
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(consumer);
    }

    public static void printNameAndActivities() {
        
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(consumerName.andThen(consumerActivites));
    }

    public static void printNameAndActivitiesWithCondition() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(student -> {
            if(student.getGpa() > 4) 
                // Note : andThen can be chained n number of times
                consumerName.andThen(consumerActivites).accept(student);;
        });
    }

    public static void main(String[] args) {
        // Consumer Example with Lambda
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("Hello World");

        //printName();
        //printNameAndActivities();

        printNameAndActivitiesWithCondition();

    }
}