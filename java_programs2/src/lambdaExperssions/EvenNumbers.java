package lambdaExperssions;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		//printing numbers
		list.forEach((n)->{
			System.out.print(n+" ");
		});
		
		//printing even numbers
		System.out.println();
		list.forEach((n)->{
			if(n%2==0)
				System.out.print(n+" ");
		});
	}
}
