package day04;

import java.io.IOException;

class M {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

public class ThrowsExample2 {
	// declare exception
	public static void main(String args[]) throws IOException {
		M m = new M();
		m.method();

		System.out.println("normal flow...");
	}
}

