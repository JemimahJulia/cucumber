package Axixbank;

public class SBIbank extends Axis {
		public static void pf() {
			System.out.println("Am a pf");
		}
		public static void tax() {
			System.out.println("Am a Tax");
			

		}
		public static void main(String[] args) {
			SBIbank s = new SBIbank();
		    pf();
			tax();
			SavingsAccount();
			CurrentAccount();
			
		}
	}



