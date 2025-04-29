package collections;

public class ConfigurationManager {
	 	private String dbUrl;
	    private String username;
	    private String password;
	    private static ConfigurationManager instance;
	    
		private ConfigurationManager() {
			 super();
			 this.dbUrl = "jdbc:mysql://localhost:3306/mydb";
		     this.username = "admin";
		     this.password = "password";
		}
		
		//static method for creating and returning same instance
		public static synchronized ConfigurationManager getInstance() {
			if(instance==null) {
				instance=new ConfigurationManager();
			}
			return instance;
		}
		
		//displaying the details
		public void displayConfiguration() {
	        System.out.println("DB URL: " + getDbUrl());
	        System.out.println("Username: " + getUsername());
	        System.out.println("Password: " + getPassword());
	    }
	
		
		
		public String getDbUrl() {
			return dbUrl;
		}
		public void setDbUrl(String dbUrl) {
			this.dbUrl = dbUrl;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	    
	    
}
