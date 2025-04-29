package streamAPI;

import java.util.List;
import java.util.OptionalDouble;

public class Average {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		double avg=0,sum=0;
		int size=numbers.size();
		for(int number:numbers) {
			 sum=sum+number;
		}
		avg=sum/size;
		System.out.println(avg);
		
		OptionalDouble average = numbers.stream()
			   .mapToInt(Integer::intValue)
			   .average();
		
		System.out.println("average of numbers:"+average.getAsDouble());
	}
}
