package com.keshava.lambdas;

import java.util.Comparator;

public interface ComparatorLambdaExpression {
 
	public static void main(String[] args) {

		// Prior to Java 8
		Comparator<Integer> comparator = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		};

		// ----Lambda way ------

		// Single Line Lambda
		/*
		Parameters are automatically Identified 
		as the type mentioned in the Comparator Type
		*/
		Comparator<Integer> comparator2 = (a, b) ->  a.compareTo(b) ;

		// Multi Line Lambda
		Comparator<Integer> comparator3 = (a, b) -> {
			return a.compareTo(b);
		};

		System.out.println( comparator.compare(20, 40));
		System.out.println(comparator2.compare(20, 40));
		System.out.println(comparator3.compare(20, 40));
	}

}
