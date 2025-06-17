package oopsConcept;

public class Bank {
	
	public double calculateInterest(double principal, double rate) {
        return principal * rate;
    }
    
    // Overloaded method to calculate interest for a fixed deposit account
    public double calculateInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }

    // Overloaded method to calculate interest for a recurring deposit account
    public double calculateInterest(double principal, double rate, int years, int monthlyInstallments) {
        return (principal * rate * years) + (monthlyInstallments * 12 * rate);
    }
    
	public static void main(String[] args) {
		Account account=new Account("John",123456,100);
		System.out.println(account.getAccName()+" account no is "+account.getAccNo()+" and your bal is "+account.getBal());
		
		Account account2=new Account("Rock",123456,100);
		System.out.println(account2.getAccName());
		System.out.println(account2);
	}
}
