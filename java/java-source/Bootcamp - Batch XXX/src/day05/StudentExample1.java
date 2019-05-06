package day05;

public class StudentExample1 {
	// defining fields
	int id;// field or data member or instance variable
	String name;

	// creating main method inside the Student class
	public static void main(String args[]) {
		// Creating an object or instance
		// creating an object of Student
		StudentExample1 s1 = new StudentExample1();
		// Printing values of the object
		// accessing member through reference variable
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

