import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
