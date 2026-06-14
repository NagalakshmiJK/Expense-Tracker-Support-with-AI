import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class login {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://Localhost:3306/Expensetracker";
		String DBusername = "root";
		String DBpassword = "Kannan22";
//		Connection con = DriverManager.getConnection(url, DBusername, DBpassword);
//		String sql = "create table LoginDetail(username varchar(20),password varchar(10))";
//		PreparedStatement st = con.prepareStatement(sql);
//		int updated = st.executeUpdate();
//		System.out.println(updated+"Successfull");
		
		String Username_client;
		String Password_client;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Login Expense Tracker With AI Support To Saving Income");
		System.out.println("UserName : ");
		Username_client = sc.next();
		System.out.println("Passwor : ");
		Password_client = sc.next();
		System.out.println("You have to Login for Successfully for Expense Tracker Application ");
	}
	
}
