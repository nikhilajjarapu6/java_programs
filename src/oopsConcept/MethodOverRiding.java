package oopsConcept;

public class MethodOverRiding {
	public static void main(String[] args) {
		Employee emp = new Employee("Alice", 50000);
        Employee mgr = new Manager("Bob", 60000, 5000);
        Employee dev = new Developer("Charlie", 55000, 3, 2000);

        // Polymorphic behavior - the correct `calculateSalary` method is called based on the object's type
        System.out.println(emp.name + "'s Salary: " + emp.calculateSalary());
        System.out.println(mgr.name + "'s Salary: " + mgr.calculateSalary());
        System.out.println(dev.name + "'s Salary: " + dev.calculateSalary());
	}
}
