package day04;

public class TryCatchExample3 {
	public static void main(String[] args) {
		try {
			// may throw exception
			int data = 50 / 0; 
			// if exception occurs, the remaining 
			// statement will not exceute
			System.out.println("rest of the code");
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}

