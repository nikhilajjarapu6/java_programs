package streamAPI_Project;

import java.util.List;

public class Customer {
	private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private List<String> addresses;
	public Customer(String customerId, String name, String email, String phoneNumber, List<String> addresses) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.addresses = addresses;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", addresses=" + addresses + "]";
	}
	
	
    
}