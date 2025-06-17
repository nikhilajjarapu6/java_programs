package oopsConcept;


public class MethodOverLoading {

	 
	    public static void main(String[] args) {
	  Bank bank = new Bank();
      
      // Calls the first method (Savings Account)
      System.out.println("Savings Account Interest: " + bank.calculateInterest(1000, 0.05));
      
      // Calls the second method (Fixed Deposit Account)
      System.out.println("Fixed Deposit Interest: " + bank.calculateInterest(1000, 0.06, 5));
      
      // Calls the third method (Recurring Deposit Account)
      System.out.println("Recurring Deposit Interest: " + bank.calculateInterest(1000, 0.07, 5, 100));
  }
}



