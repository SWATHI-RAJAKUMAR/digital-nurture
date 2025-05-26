public class AccountDAO {
    private Connection conn;

    public AccountDAO(Connection conn) {
        this.conn = conn;
    }

    public void transferMoney(int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);

            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            debit.executeUpdate();

            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.setAutoCommit(true);
        }
    }
}