package com.keshava.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> toUpperCaseMethod = s -> s.toUpperCase();

    static Function<String, String> addSomeString = s -> s.concat(" Added String");

    static BiFunction<String, String, Integer> concatAndGetLength = (s1, s2) -> s1.concat(s2).length();

    public static void main(String[] args) {
        System.out.println("Length of 'Hello World' : " + addSomeString.andThen(toUpperCaseMethod).apply("Hello World"));
        System.out.println("BiFunction Result : " + concatAndGetLength.apply("Hello World", "Adithya"));
    }
}