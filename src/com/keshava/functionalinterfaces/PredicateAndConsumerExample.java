package com.keshava.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.keshava.data.Student;
import com.keshava.data.StudentDatabase;

public class PredicateAndConsumerExample {

    BiPredicate<Double, Integer > filterByGpaAndGradeLevelValue = (gpa, gradeLevel ) -> 
        gpa > 3.5 && gradeLevel > 2;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    Consumer<Student> studentConsumer = student -> {
        if(filterByGpaAndGradeLevelValue.test(student.getGpa(), student.getGradeLevel())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    } ;

    public PredicateAndConsumerExample(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public PredicateAndConsumerExample() {
	}

	public static void main(String[] args) {
        new PredicateAndConsumerExample(StudentDatabase.getAllStudents());
    }
}