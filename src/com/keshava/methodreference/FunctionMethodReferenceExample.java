package com.keshava.methodreference;
import java.util.function.Function;

public class FunctionMethodReferenceExample {
    
    // Using Simple Lambda
    static Function<String, String> toUpperCase = s -> s.toUpperCase();

    // Using Method Reference
    static Function<String, String> toUpperCaseLambda = String::toUpperCase;
    
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Hello World"));
    }
}