package streamAPI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Common {
	public static void main(String[] args) {
		 List<Integer> list1 = List.of(1, 2, 3, 4, 5,4);
	     List<Integer> list2 = List.of(4, 5, 6, 7, 8,1);
//	     List<Integer> list3=new ArrayList<>(); we cannot use list because of duplicates
	     Set<Integer> set=new HashSet<>();   //set stores only unique values
	     list1.forEach(n->{
	    	 if(list2.contains(n))
	    		 set.add(n);
	     });
	     System.out.println(set);
	     
	     //using streams
	     Set<Integer> collect = list1.stream()
	     	  .filter(list2::contains)
	     	  .collect(Collectors.toSet());
	     System.out.println("combined numbers in both lists");
	     System.out.println(collect);
	}
}
