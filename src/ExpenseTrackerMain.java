import java.util.Scanner;
public class ExpenseTrackerMain {

	public static void main(String[] args) {
		System.out.println("***** WELCOME TO AI-POWERED SMART EXPENSE TRACKER *****");
		Authentication signin = new Authentication();
		Expense Exp_details = new Expense();
		while(true) {
			System.out.println("1. Authentication ");
			System.out.println("2. Authorization ");
			System.out.println("3. Exit ");
			User clientdetail = new User();
			AddExpenseDetails ExpenseList = new AddExpenseDetails();
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
					ExpenseList.GrossSalary();
					ExpenseList.AddExpense(Exp_details);
					System.out.println("Food Expense : "+Exp_details.getFoodExpense());
					System.out.println("Shopping Expense : "+Exp_details.getShoopingExpense());
					System.out.println("Medical Expense : "+Exp_details.getMedicalExpense());
					System.out.println("Travel Expense : "+Exp_details.getTravelExpense());
					System.out.println("Rent Expense : "+Exp_details.getRentExpense());
					System.out.println("Entertainment Expense : "+Exp_details.getEntertainmentExpense());
					System.out.println("EMI Expense : "+Exp_details.getEMIExpense());
					System.out.println("Miscellaneous Expense : "+Exp_details.getMiscellaneousExpense());
					System.out.println("Saving Amount :"+Exp_details.getSavingAmount());
				}
				case 3->{
					return;
				}
			}
		}

	}

}
