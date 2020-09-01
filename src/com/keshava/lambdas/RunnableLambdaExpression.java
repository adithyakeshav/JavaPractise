package com.keshava.lambdas;

public class RunnableLambdaExpression {

	public static void main(String[] args) {
		
		// Prior to Java 8
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Inside Runnable");
				}
			}
		};
		
		new Thread(runnable).start();

		// Java- 8 Lambda
		Runnable runnableLambda = () -> {
			for(int i=3; i<8; i++) {
				try {
					Thread.sleep(200 * i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Inside Runnable Lambda");
			}
		};

		new Thread(runnableLambda).start();
		
	}

}
