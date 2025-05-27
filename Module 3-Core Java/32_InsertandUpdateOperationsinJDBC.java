import java.sql.*;

public class StudentDAO {
    private Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "password");
    }

    public void insertStudent(int id, String name) {
        try (Connection conn = connect()) {
            String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Student inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String newName) {
        try (Connection conn = connect()) {
            String sql = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
