package com.keshava.functionalinterfaces;

import java.util.function.Predicate;
/*
Lamda, Predicate, Consumer, BiConsumer
*/
public class PredicateExamples {
    
    static Predicate<Integer> evenPredicate = i -> i % 2 == 0;
    static Predicate<Integer> divisibleByFive = i -> i % 5 == 0;

    public static void predicateOr() {
        System.out.println(evenPredicate.or(divisibleByFive).test(5));
    }

    public static void main(String[] args) {

        //System.out.println(evenPredicate.test(6));
        predicateOr();
    }
}