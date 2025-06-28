import java.sql.*;
public class Student {
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pass = "password";
        String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, 105);
            stmt.setString(2, "praveen");
            stmt.setInt(5, 65);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}