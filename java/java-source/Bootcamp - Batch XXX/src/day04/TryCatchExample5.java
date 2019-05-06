package day04;

public class TryCatchExample5 {
	public static void main(String[] args) {
		try {
			 // may throw exception
			int data = 50 / 0;
		}
		// handling the exception
		catch (Exception e) {
			// displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}

