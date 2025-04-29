package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 35));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person.getName() + " (" + person.getAge() + ")");
        }

        // Sorting based on age using Comparable
        Collections.sort(people);

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person.getName() + " (" + person.getAge() + ")");
        }
    }

}
