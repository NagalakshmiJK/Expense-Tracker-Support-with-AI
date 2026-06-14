import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseStoredExpense {
	public void AddExpenses() throws SQLException {
		String url = "jdbc:mysql://Localhost:3306/Expensetracker";
		String Username = "root";
		String Password = "Kannan22";
		Connection con = DriverManager.getConnection(url, Username, Password);
		String sql = "";
		PreparedStatement st = con.prepareStatement(sql);
		int update = st.executeUpdate();
		System.out.println(update +" successfully ");
		st.close();
		con.close();
	}
}
