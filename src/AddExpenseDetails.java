import java.util.Scanner;

public class AddExpenseDetails {
	private int Salary,Food,Shopping,Medical,Travel,Rent,Entertainment,EMI,Miscellaneous,SavingAmount;
	Scanner sc = new Scanner(System.in);
	public void AddExpense(Expense Exp) {
		System.out.println("Food : ");
		Food = sc.nextInt();
		Exp.setFoodExpense(Food);
		System.out.println("Shopping : ");
		Shopping = sc.nextInt();
		Exp.setShoppingExpense(Shopping);
		System.out.println("Medical : ");
		Medical = sc.nextInt();
		Exp.setMedicalExpense(Medical);
		System.out.println("Travel : ");
		Travel = sc.nextInt();
		Exp.setTravelExpense(Travel);
		System.out.println("Rent : ");
		Rent = sc.nextInt();
		Exp.setRentExpense(Rent);
		System.out.println("Entertainment : ");
		Entertainment = sc.nextInt();
		Exp.setEntertainmentExpense(Entertainment);
		System.out.println("EMI : ");
		EMI = sc.nextInt();
		Exp.setEMIExpense(EMI);
		System.out.println("Miscellaneous : ");
		Miscellaneous = sc.nextInt();
		Exp.setMiscellaneousExpense(Miscellaneous);
		SavingAmount = Salary - (Food + Shopping + Medical + Travel + Rent + Entertainment + EMI+ Miscellaneous);
		Exp.setSavingAmountExpense(SavingAmount);
	}
	public void GrossSalary() {
		System.out.println("Your Gross Salary : ");
		Salary = sc.nextInt();
	}
}
