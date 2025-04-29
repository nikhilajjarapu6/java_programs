package oopsConcept;

public class Account {
	private String accName;
	private int accNo;
	private double bal;
	
	
	public Account(String accName, int accNo, double bal) {
	        setAccName(accName); // Reusing the setter method for validation
	        this.accNo = accNo;
	        setBal(bal); 		// Reusing the setter method for validation
    }
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		if(!accName.isEmpty()) {
			this.accName = accName;
		}
		else {
			System.out.println("name should not be empty");
			
		}
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		if(bal>=0) {
			this.bal = bal;
		}
		else {
			System.out.println("deposit valid amount");
		}
		
	}
	
	public void withdrawal(double amount) {
		if (amount > 0 && bal >= amount) {
            bal -= amount;
        } 
		else {
            System.out.println("Insufficient balance or invalid amount");
        }
	}
	
	public void deposit(double amount) {
		 if (amount > 0) {
	            bal += amount;
	        } 
		 else {
	            System.out.println("Invalid deposit amount");
	     }
	}
	
	
	
	
}
