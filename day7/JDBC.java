import java.sql.*;
import java.util.Scanner;

public class JDBC {
    static final String URL = "jdbc:mysql://localhost:3306/inventorydb";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void addProduct(int id, String name, double price) throws SQLException {
        String sql = "INSERT INTO products VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setDouble(3, price);
            stmt.executeUpdate();
            System.out.println("Product added.");
        }
    }

    public static void viewProducts() throws SQLException {
        String sql = "SELECT * FROM products";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " +
                                   rs.getString("name") + " - ₹" +
                                   rs.getDouble("price"));
            }
        }
    }

    public static void searchProduct(String name) throws SQLException {
        String sql = "SELECT * FROM products WHERE name LIKE ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Found: " + rs.getInt("id") + " - " +
                                   rs.getString("name") + " - ₹" +
                                   rs.getDouble("price"));
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Product\n2. View Products\n3. Search Product\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    addProduct(id, name, price);
                }
                case 2 -> viewProducts();
                case 3 -> {
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    searchProduct(search);
                }
                case 4 -> System.exit(0);
            }
        }
    }
}