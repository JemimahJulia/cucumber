package loading;

public class StudentInfo {
	public void StudentID() {
		System.out.println("StudentName:Ram");}
	public void StudentID(int a) {
		System.out.println("Student ID:" +a);}
	public void StudentID(int a, String b) {
		System.out.println("Student int + String:"  +a+","+b); }
		public void StudentID(String a, int b) {
			System.out.println("Student String + int:" +a+","+b);	

	}
	public static void main(String[] args) {
		StudentInfo s= new StudentInfo();
		s.StudentID();
		s.StudentID(4);
		s.StudentID(10, "Jemi is bad girl");
		s.StudentID("Joshua is good boy", 20);
	}

	}
		
	


