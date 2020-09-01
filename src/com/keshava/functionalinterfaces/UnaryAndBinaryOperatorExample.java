package com.keshava.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s -> s.concat("Default");
    static BinaryOperator<String> binaryOperator = (s, q) -> s.concat(q);

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java"));
        System.out.println(binaryOperator.apply("Java", " World"));
    }
}