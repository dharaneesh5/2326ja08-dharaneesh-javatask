import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) { return a + b; }
    public static int sub(int a, int b) { return a - b; }
    public static int mul(int a, int b) { return a * b; }
    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Choose an operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + sub(a, b));
            case 3 -> System.out.println("Result: " + mul(a, b));
            case 4 -> System.out.println("Result: " + div(a, b));
            default -> System.out.println("Invalid choice.");
        }
    }
}