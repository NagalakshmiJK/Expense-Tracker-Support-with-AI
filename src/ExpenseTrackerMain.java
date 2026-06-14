import java.util.Scanner;

public class ExpenseTrackerMain {

	public static void main(String[] args) {
		System.out.println("***** WELCOME TO AI-POWERED SMART EXPENSE TRACKER *****");
		Authentication signin = new Authentication();
		while(true) {
			System.out.println("1. Authentication ");
			System.out.println("2. Authorization ");
			System.out.println("3. Exit ");
			User clientdetail = new User();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1 ->{
					clientdetail.Userdetail(signin);
					String name = signin.getUsername();
					System.out.println("Username is : "+ name);
					String password = signin.getHashingPassword();
					System.out.println("Password is : "+ password);
				}
				case 2->{
					
				}
				case 3->{
					return;
				}
			}
		}

	}

}
