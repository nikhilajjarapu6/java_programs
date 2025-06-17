package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class CurrencyConverter {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Function<Double, Double>> conversionFormulas = new HashMap<>();

    public static void main(String[] args) {
        populateConversionFormulas();
        while (true) {
            displayOptions();
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting...");
                return;
            } else {
                convertCurrency(choice);
            }
        }
    }

    private static void populateConversionFormulas() {
        conversionFormulas.put("USD to INR", usdToInr());
        conversionFormulas.put("INR to USD", inrToUsd());
        conversionFormulas.put("USD to EUR", usdToEur());
        conversionFormulas.put("EUR to USD", eurToUsd());
    }

    private static Function<Double, Double> usdToInr() {
        return usdAmount -> usdAmount * 83.35; 
    }

    private static Function<Double, Double> inrToUsd() {
        return inrAmount -> inrAmount / 83.35;
    }

    private static Function<Double, Double> usdToEur() {
        return usdAmount -> usdAmount * 0.84; }

    private static Function<Double, Double> eurToUsd() {
        return eurAmount -> eurAmount / 0.84;
    }

    private static void displayOptions() {
        System.out.println("Choose an option:");
        System.out.println("1. Convert USD to INR");
        System.out.println("2. Convert INR to USD");
        System.out.println("3. Convert USD to EUR");
        System.out.println("4. Convert EUR to USD");
        System.out.println("5. Exit");
    }

    private static void convertCurrency(int choice) {
        String option = "";
        switch (choice) {
            case 1:
                option = "USD to INR";
                break;
            case 2:
                option = "INR to USD";
                break;
            case 3:
                option = "USD to EUR";
                break;
            case 4:
                option = "EUR to USD";
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                return;
        }

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        double convertedAmount = conversionFormulas.get(option).apply(amount);
        System.out.println("Converted amount: " +convertedAmount);
    }
}

