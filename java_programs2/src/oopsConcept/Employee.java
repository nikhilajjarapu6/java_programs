package oopsConcept;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Method to calculate salary - to be overridden by subclasses
	public double calculateSalary() {
		return salary;
	}
}

class Manager extends Employee {
	double bonus;

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	// Overridden method to include bonus in salary calculation
	@Override
	public double calculateSalary() {
		return salary + bonus;
	}
}

//Subclass Developer
class Developer extends Employee {
	int projectsCompleted;
	double projectBonus;

	public Developer(String name, double salary, int projectsCompleted, double projectBonus) {
		super(name, salary);
		this.projectsCompleted = projectsCompleted;
		this.projectBonus = projectBonus;
	}

	// Overridden method to include project bonus in salary calculation
	@Override
	public double calculateSalary() {
		return salary + (projectsCompleted * projectBonus);
	}
}
