package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class Filtering {
	 public static void main(String[] args) {
	        // Create a list of Person objects
	        List<Person> people = new ArrayList<>();
	        people.add(new Person("John", 25));
	        people.add(new Person("Alice", 30));
	        people.add(new Person("Bob", 20));
	        people.add(new Person("David", 35));
	        people.add(new Person("Emily", 40));

	        System.out.println("Original list: " + people);

	        // Create a new list to store filtered results
	        List<Person> filteredList = new ArrayList<>();

	        // Filter people older than 30 using a for-loop
	        for (Person person : people) {
	            if (person.getAge() > 30) {
	                filteredList.add(person); 
	            }
	        }

	        System.out.println("Filtered list (Age > 30): " + filteredList);
	    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
