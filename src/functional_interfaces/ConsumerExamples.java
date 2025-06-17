package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExamples {
	public static void main(String[] args) {
		
		//accepts one argument and returns nothing
		//used to perform operations
		Consumer<String> message=(msg)->System.out.println(msg);
		message.accept("hello world java");
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		System.out.println("original numbers "+numbers);
		Consumer<Integer> numbersFunction=(num)->System.out.print(num*num+" ");
		numbers.forEach((number)->numbersFunction.accept(number));
		System.out.println();
		
		//Concatenation
		Consumer<String> greet = a-> System.out.print("Hello, ");
		Consumer<String> concotenate=(msg2)->System.out.println(msg2.toUpperCase());
		greet.andThen(concotenate).accept("world");
		
		//updating object 
		//increasing age +1
		Consumer<Employee> updateAge=(emp)->emp.age+=1;
		
		Employee employee=new Employee("Bob",24,"bob@gmail.com");
		System.out.println("employee age before update "+employee.getAge());
		updateAge.accept(employee);
		System.out.println("Employee age after update "+employee);
		
		//custom formating
		 List<String> names = Arrays.asList("Java", "Python", "JavaScript");
		 Consumer<String> formating=(name)->System.out.println(name+" is programming language");
		 names.forEach(formating);
//		 names.forEach(name->formating.accept(name));
		 
		 List<Employee> empList = Arrays.asList(
		            new Employee("Alice", 25,null),
		            new Employee("Bob", 30,"bob@gmail.com"),
		            new Employee("Charlie", 35,null)
		        );
		  Consumer<Employee> caseFunction = (emp) -> emp.setName(emp.getName().toUpperCase());
		  empList.forEach(caseFunction);
		  System.out.println(empList);
		 
		  //setting default values
		  Consumer<Employee> updateNulls=emp->emp.setDefaultEmails();
		  empList.forEach(updateNulls);
		  System.out.println(empList);
		  
		  
		  //applying discount 
		  List<Product> products = Arrays.asList(
		            new Product("Laptop", 1200.00),
		            new Product("Smartphone", 800.00),
		            new Product("Headphones", 150.00)
		        );
		  Double discount=20.0;
		  Consumer<Product> discountFunc=(product)->product.setPrice(product.getPrice()-product.getPrice()*(discount/100));
		  
		  products.forEach(discountFunc);
		  System.out.println(products);
		  
		  //andthen 
		  Consumer<String> uppercase=str->System.out.println(str.toUpperCase());
		  Consumer<String> lowercase=str->System.out.println(str.toLowerCase());
		  lowercase.andThen(uppercase).accept("Hello world");
	}
}

class Employee {
	String name;
	int age;
	String email;

	public Employee(String name, int age,String email) {
		super();
		this.name = name;
		this.age = age;
		this.email=email;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDefaultEmails() {
		if(this.email==null) {
			this.email="update mail please";
		}
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age+", email="+email+"\n";
	}

}



