import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =0; i<= 100; i ++) 
			sum += i;
		
		System.out.println("Sum : " +sum);
		
		int average = IntStream.rangeClosed(1, 100).sum();
		System.out.println("Sum : " +average);
		
		
	}

}
