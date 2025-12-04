import java.util.Scanner;

public class SimpleCalculator {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SIMPLE CALCULATOR =====");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
