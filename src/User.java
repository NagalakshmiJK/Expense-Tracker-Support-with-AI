import java.util.Scanner;

public class User {
	private String Username,Password;
//	Authentication auth = new Authentication();
	
	public void Userdetail(Authentication auth) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username : ");
		Username = sc.next();
		System.out.println("Password : ");
		Password = sc.next();
		auth.setUsername(Username);
		auth.setHashingPassword(Password);
	}
}
