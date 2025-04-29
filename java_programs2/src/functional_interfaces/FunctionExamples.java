package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExamples {
	public static void main(String[] args) {
		
		//examples for transforming data
		//converting String to integer
		Function<String,Integer> stringToInt=(num)->Integer.valueOf(num);
		System.out.println(stringToInt.apply("5"));
		
		//converting character to string
		Function<Character,String> charToString=(ch)->String.valueOf(ch);
		System.out.println(charToString.apply('k'));
		
		//converting int to float
		Function<Integer,Float> intToFloat= (num)->Float.valueOf(num);
		System.out.println(intToFloat.apply(10));
		
		//examples for transforming and applying logic
		Function<Integer,Integer> square=(num)->num*num;
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		ArrayList<Integer> squaresList=new ArrayList<>();
		numbers.forEach((number)->{
			squaresList.add(square.apply(number));
		});
		System.out.println(squaresList);
		
		//examples for using andthen function
		Function<Integer,Integer> multiplication=(num)->num*10;
		numbers.forEach((number)->{
			squaresList.add(square.andThen(multiplication).apply(number));
		});
		System.out.println(squaresList);
		
		//examaple for compose
		Function<Integer,Integer> add=(num)->num+11;
		numbers.forEach((number)->{
			//first applies add before multiplication
			squaresList.add(multiplication.compose(add).apply(number));
		});
		System.out.println(squaresList);
		
		
		//converting celsiusToFahrenheit
		Function<Double,Double> celsiusToFahrenheit=(celsius)->(celsius * 9/5) + 32;
		System.out.println(celsiusToFahrenheit.apply(28.0)+" F");
		
		//finding square root
		Function<Integer,Double> squareroot=(num)->Math.sqrt(num);
		System.out.println(squareroot.apply(64));
		
		//to check pallindrome
		Function<String,Boolean> checkPallindrome=(word)->{
			String reversed=new StringBuilder(word).reverse().toString();
			return reversed.equals(word);
		};
		
		System.out.println(checkPallindrome.apply("roorr")?"yes pallindrome":"no it is not pallindrome");
		
		//length of each strings in list
		List<String> lists=Arrays.asList("Alice", "Bob", "Charlie", "David");
		Function<String,Integer> lengthFunction=(word)->word.length();
		List<Integer> lengths = new ArrayList<>();
		lists.forEach((word)->{
			lengths.add(lengthFunction.apply(word));
		});
		System.out.println(lengths);
	}
}
