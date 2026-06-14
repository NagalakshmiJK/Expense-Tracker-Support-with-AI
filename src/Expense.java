
public class Expense {
	private int Food,Shopping,Medical,Travel,Rent,Entertainment,SavingAmount,EMI,Miscellaneous;
	
	public int getFoodExpense() {
		return Food;
	}
	public int getShoopingExpense() {
		return Shopping;
	}
	public int getMedicalExpense() {
		return Medical;
	}
	public int getTravelExpense() {
		return Travel;
	}
	public int getRentExpense() {
		return Rent;
	}
	public int getEntertainmentExpense() {
		return Entertainment;
	}
	public int getEMIExpense() {
		return EMI;
	}
	public int getMiscellaneousExpense() {
		return Miscellaneous;
	}
	public int getSavingAmount() {
		return SavingAmount;
	}
	Expense(int Food,int Shopping,int Medical,int Travel,int Rent,int Entertainment,int EMI,int Miscellaneous){
		this.Food = Food;
		this.Shopping = Shopping;
		this.Medical = Medical;
		this.Travel = Travel;
		this.Rent = Rent;
		this.Entertainment = Entertainment;
		this.EMI = EMI;
		this.Miscellaneous = Miscellaneous;
	}
	
	
}
