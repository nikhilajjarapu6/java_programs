package lambdaExperssions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Numbers {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(15, 3, 25, 7, 30);
		 
		 System.out.println(numbers);
		 //sorting
		 numbers.sort((a,b)->Integer.compare(a, b));
		 System.out.println(numbers);
		 
		//maximum
		Optional<Integer> max= numbers.stream().max((a,b)->Integer.compare(a, b));
		System.out.println(max.get());
		
		//minimum
		Integer min=numbers.stream().min((a,b)->Integer.compare(a, b)).get();
		System.out.println(min);
		
		
		
		
	}
}
