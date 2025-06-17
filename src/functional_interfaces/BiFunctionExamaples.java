package functional_interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExamaples {
	public static void main(String[] args) {

		// adding two numbers and returns result
		BiFunction<Integer, Integer, Integer> adding = (x, y) -> x + y;
		System.out.println(adding.apply(10, 20));

		// using than
		// adding returns result and then that result will be doubled in function
		Function<Integer, Integer> doubleIt = (result) -> result * 2;
		System.out.println(adding.andThen(doubleIt).apply(10, 20));

		// concatenating strings
		BiFunction<String, String, String> concatenate = (x, y) -> x + " " + y;
		System.out.println(concatenate.apply("Hello", "World"));

		BiFunction<Company, Product, String> concatenate2 = (x, y) -> {
			String result = "Company name:" + x.getCompanyName() + " and product is:" + y.getName();
			return result;
		};

		System.out.println(concatenate2.apply(new Company("Xiaomi", 1), new Product("Tablet", 2000.0)));

		// it takes two type of inputs and returns third type
		BiFunction<Company, Product, Sales> combined = (company, product) -> {
			String companyName = company.getCompanyName();
			String productName = product.getName();
			Double productPrice = product.getPrice();
			return new Sales(companyName, productName, productPrice);
		};

		System.out.println(combined.apply(new Company("Sony", 1), new Product("Earphones", 2000.0)));
		
	}
}
