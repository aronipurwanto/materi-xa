package day05;

class StudenClass1 {
	// defining fields
	// field or data member or instance variable
	int id;
	String name;
}

//Creating another class TestStudent1 which contains the main method  
public class StudentExample2 {
	public static void main(String args[]) {
		// Creating an object or instance
		// creating an object of Student
		StudenClass1 s1 = new StudenClass1();
		// Printing values of the object
		// accessing member through reference variable
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}

