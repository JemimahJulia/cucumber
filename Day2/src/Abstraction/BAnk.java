package Abstraction;

public class BAnk implements ICICI {
@Override
public void SalaryAccount() {
	System.out.println("Salary Account");
	
}
@Override
	public void CurrentAccount() {
		System.out.println("Current Account");
		
	}
public static void main(String[] args) {
	BAnk b = new BAnk();
	b.CurrentAccount();
	b.SalaryAccount();
	
}
@Override
public void SavingsAccount() {
	// TODO Auto-generated method stub
	
}
}
