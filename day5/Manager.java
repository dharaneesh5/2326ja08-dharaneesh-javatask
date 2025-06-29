import java.io.*;
import java.util.*;

public class Manager {
    static final String FILE = "students.txt";
    static HashMap<Integer, String> studentData = new HashMap<>();

    public static void loadFromFile() throws IOException {
        studentData.clear();
        File file = new File(FILE);
        if (!file.exists()) return;
        BufferedReader reader = new BufferedReader(new FileReader(FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",", 2);
            int id = Integer.parseInt(parts[0]);
            studentData.put(id, parts[1]);
        }
        reader.close();
    }

    public static void saveToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE));
        for (Map.Entry<Integer, String> entry : studentData.entrySet()) {
            writer.write(entry.getKey() + "," + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        loadFromFile();

        while (true) {
            System.out.println("\n1. Add\n2. Search\n3. Delete\n4. Display\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    studentData.put(id, name);
                    saveToFile();
                }
                case 2 -> {
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    if (studentData.containsKey(id))
                        System.out.println("Name: " + studentData.get(id));
                    else
                        System.out.println("Student not found.");
                }
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    studentData.remove(id);
                    saveToFile();
                    System.out.println("Deleted if present.");
                }
                case 4 -> {
                    System.out.println("All Students:");
                    for (Map.Entry<Integer, String> entry : studentData.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }
                case 5 -> System.exit(0);
            }
        }
    }
}