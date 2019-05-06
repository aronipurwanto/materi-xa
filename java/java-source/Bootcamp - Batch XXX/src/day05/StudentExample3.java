package day05;

class StudenClass3 {
	int id;
	String name;
}

public class StudentExample3 {
	public static void main(String args[]) {
		StudenClass3 s1 = new StudenClass3();
		s1.id = 101;
		s1.name = "Sonoo";
		// printing members with a white space
		System.out.println(s1.id + " " + s1.name);
	}
}

