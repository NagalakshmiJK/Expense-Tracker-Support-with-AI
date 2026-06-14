import java.util.Scanner;

public class AddExpenseDetails {
	private int Salary,Food,Shopping,Medical,Travel,Rent,Entertainment,EMI,Miscellaneous,SavingAmount;
	Scanner sc = new Scanner(System.in);
	public void AddExpense(Expense Exp) {
		System.out.println("Food : ");
		Food = sc.nextInt();
		System.out.println("Shopping : ");
		Shopping = sc.nextInt();
		System.out.println("Medical : ");
		Medical = sc.nextInt();
		System.out.println("Travel : ");
		Travel = sc.nextInt();
		System.out.println("Rent : ");
		Rent = sc.nextInt();
		System.out.println("Entertainment : ");
		Entertainment = sc.nextInt();
		System.out.println("EMI : ");
		EMI = sc.nextInt();
		System.out.println("Miscellaneous : ");
		Miscellaneous = sc.nextInt();
		SavingAmount = Salary - (Food + Shopping + Medical + Travel + Rent + Entertainment + EMI+Miscellnwous)
		
	}
	public void GrossSalary(Expense Exp) {
		System.out.println("Your Gross Salary : ");
		Salary = sc.nextInt();
	}
}
