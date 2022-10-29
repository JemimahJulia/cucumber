package Abstraction;

public class BankDetails extends partial {
	public void SalaryAccount() {
		System.out.println("SalaryAccount");
	}
public static void main(String[] args) {
	BankDetails b = new BankDetails();
	b.SalaryAccount();
	b.SavingsAccount();
	b.CurrentAccount();
}
}
