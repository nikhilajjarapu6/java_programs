package lambdaExperssions;

import java.util.Arrays;
import java.util.List;

public class StringsSort {
	public static void main(String[] args) {
		 List<String> names = Arrays.asList("John", "Jane", "Doe", "Alex", "Chris");
		 
//		 Collections.sort(names);
		 System.out.println(names);
		 
		 //Ascending order
		 System.out.println("Ascending order");
		 names.sort((name1,name2)->{return name1.compareTo(name2);});
		 System.out.println(names);
		 
		 //descending order
		 System.out.println("descending order");
		 names.sort((name1,name2)->{
			 return name2.compareTo(name1);
		 });
		 System.out.println(names);
	}
}
