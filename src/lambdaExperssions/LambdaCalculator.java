package lambdaExperssions;


@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        // Addition using lambda
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(5, 10));

        // Subtraction using lambda
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(20, 5));

        // Multiplication using lambda
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(4, 6));
    }
}
