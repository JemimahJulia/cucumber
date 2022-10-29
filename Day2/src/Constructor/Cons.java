package Constructor;

public class Cons {
	public Cons() {
		System.out.println("Am a default constructor"); }
	
public Cons(int a) {
	System.out.println("Am a int arug constructor"); }

public Cons(String a) {
	System.out.println("Am a string arug constructor");
}
public static void main(String[] args) {
	Cons c = new Cons();
	Cons c1= new Cons("test");
	Cons c2 = new Cons (1);
}

}
