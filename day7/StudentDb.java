import java.sql.*;
import java.util.Scanner;
public class StudentDb {
    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void addStudent(int id, String name, int marks) throws SQLException {
        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, marks);
            stmt.executeUpdate();
            System.out.println("Student added.");
        }
    }
    public static void viewStudents() throws SQLException {
        String sql = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " +
                                   rs.getString("name") + " - " +
                                   rs.getInt("marks"));
            }
        }
    }
    public static void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) deleted.");
        }
    }
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Delete Student\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    addStudent(id, name, marks);
                }
                case 2 -> viewStudents();
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    deleteStudent(id);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}