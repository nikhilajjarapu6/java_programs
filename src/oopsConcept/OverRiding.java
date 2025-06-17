package oopsConcept;

public class OverRiding {
	public static void main(String[] args) {
	Parent parent=new Parent(1, 22,"John");
	Parent.display();
	Child.display();
	parent.walk();
	
	System.out.println();
	
	Parent parent1=new Child(1, 22,"John", "Rock",18);
	Parent.display();	//same method from will be called
	parent1.walk();   	//methods will be override 
//	parent1.run();  //compile time error because parent class doesnt have run method
	
	System.out.println();
	
	
	Child child=new Child(1, 22,"John","Sam",5);
	
	Child.display();
	child.walk();
	child.run();
	}
}
