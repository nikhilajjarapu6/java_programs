package collections;

public class Singleton {
	public static void main(String[] args) {
		ConfigurationManager instance=ConfigurationManager.getInstance();
		ConfigurationManager instance2=ConfigurationManager.getInstance();
		ConfigurationManager instance3=ConfigurationManager.getInstance();
		
		instance.setDbUrl("jdbc:postgresql://localhost:5432/mydb");
		instance.setPassword("newpassword");
		instance.setUsername("postgres");
		instance.displayConfiguration();
		
		
		//irrespective of object creation same object address will be same for three objects
		System.out.println(instance);
		System.out.println(instance2);
		System.out.println(instance3);
	}
}
