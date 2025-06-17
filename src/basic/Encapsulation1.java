package basic;

public class Encapsulation1{

	public static void main(String[] args) {
		Student s=new Student("ravi",21,1001);
		System.out.println(s.getName());
		s.setName("ravi kumar");
//		String name=s.getName();
//		System.out.println(name);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.setAge(22);
		System.out.println("his age is reinitailized to :"+s.getAge());
	}

}
