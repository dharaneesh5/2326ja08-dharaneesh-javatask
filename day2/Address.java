
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String[] addresses = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter address for " + names[i] + ": ");
            addresses[i] = sc.nextLine();
        }

        System.out.println("\nAddress Book:");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " - " + addresses[i]);
        }
    }
}
