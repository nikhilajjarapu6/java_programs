package basic;

import java.util.Scanner;

public class CurrencyConverter2 {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		converter();
	}

	private static void converter() {
			System.out.println("Availbale Currency is USD,RUPEE");
		    System.out.print("Enter current currency: ");
	        String current = scanner.next();
	        System.out.print("Enter currency to convert to: ");
	        String convert = scanner.next();
	        System.out.print("Enter value to convert: ");
	        
	        double value = scanner.nextDouble();
	        current=current.toUpperCase();
	        convert=convert.toUpperCase();
	        
	        if (current.equals("USD") && convert.equals("RUPEE")) {
	            double finalValue = value * 83.35;
	            System.out.println(value + " USD in Rupee is: " + finalValue);
	            return;
	        } else if (current.equals("RUPEE") && convert.equals("USD")) {
	            double finalValue = value / 83.35;
	            System.out.println(value + " Rupees in USD is: " + finalValue);
	            return;
	        } else {
	            System.out.println("Choose Correct Currency");
	        }
	       
	        
	       
		
	}

}
