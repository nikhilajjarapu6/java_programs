package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExamples {
	public static void main(String[] args) {
		
		//returns values
		Supplier<String> basic=()->"welcome to supplier";
		System.out.println(basic.get());
		
		//generating random value
		Supplier<Double> random=()->Math.floor(Math.random()*100);
		System.out.println(random.get());
		
		//getting list of products
		 List<Product> products = Arrays.asList(
		            new Product("Laptop", 1200.00),
		            new Product("Smartphone", 800.00),
		            new Product("Headphones", 150.00)
		        );
		Supplier<List<Product>> getProduct=()->products;
		System.out.println(getProduct.get());
		
		//providing default values
		String str=null;
		Supplier<String> setDefalut=()->"Default value";
		System.out.println( Optional.ofNullable(str).orElseGet(setDefalut));
		
	}
}
