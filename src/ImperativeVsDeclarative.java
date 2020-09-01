import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(10,2, 10, 20, 30, 40, 2, 10);
		
 		List<Integer> uniqueList = new ArrayList<>();
 		
 		for(Integer integer : integerList) {
 			if(!uniqueList.contains(integer)) {
 				uniqueList.add(integer);
 			}
 		}
 		
 		System.out.println(uniqueList);
 		
 		List<Integer> list = integerList.stream().distinct().distinct().collect(Collectors.toList());
 		System.out.println(list);

	}

}
