package com.keshava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> getStudent = () -> new Student("Adithya", 2, 3.6, "male",
            Arrays.asList("Chess", "Volleyball", "Cricket"));

    public static List<Student> getAllStudents() {
        Student student1 = new Student("Adithya", 2, 3.6, "male", Arrays.asList("Chess", "Volleyball", "Cricket"));
        Student student2 = new Student("Keshava", 2, 4.0, "male", Arrays.asList("Kabaddi", "Football", "Singing"));
        Student student3 = new Student("Ramana", 3, 4.2, "male", Arrays.asList("Kho-Kho", "Volleyball", "Dance"));
        Student student4 = new Student("Ajith", 3, 5.0, "male", Arrays.asList("Snooker", "Fitness", "Drama"));
        Student student5 = new Student("Abhay", 2, 4.6, "male", Arrays.asList("chess", "Kabaddi", "Dance"));
    
        return Arrays.asList(student1, student2, student3, student4, student5);
    }
    
}