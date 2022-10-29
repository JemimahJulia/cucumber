package Multilevel;

public class Office extends School{
	public void OfficeName() {
		System.out.println("Cognizant");

	}
public static void main (String[] args) {
	Office o = new Office();
	o.OfficeName();
	o.SchoolName();
}
}
