import java.io.*;
import java.util.*;

public class Employee {
    static final String FILE = "employees.txt";

    public static void addEmployee(String empData) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE, true));
        writer.write(empData);
        writer.newLine();
        writer.close();
    }

    public static void displayEmployees() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE));
        String line;
        System.out.println("Employee Records:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void deleteEmployee(String empId) throws IOException {
        File inputFile = new File(FILE);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.startsWith(empId + ",")) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();
        reader.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. Display\n3. Delete\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee (id,name,salary): ");
                    String data = sc.nextLine();
                    addEmployee(data);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    String id = sc.nextLine();
                    deleteEmployee(id);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}