import java.sql.*;

public class BankTransaction {
    public void transfer(int fromAcc, int toAcc, double amount) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "password")) {
            conn.setAutoCommit(false);

            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transaction Successful.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
