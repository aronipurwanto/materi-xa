package day04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample9 {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			// may throw exception
			pw = new PrintWriter("jtp.txt"); 
			pw.println("saved");
		}
		// providing the checked exception handler
		catch (FileNotFoundException e) {

			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}


