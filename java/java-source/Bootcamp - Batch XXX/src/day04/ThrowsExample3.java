package day04;

import java.io.IOException;

class M2 {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class ThrowsExample3 {
	// declare exception
	public static void main(String args[]) throws IOException {
		M2 m = new M2();
		m.method();
		System.out.println("normal flow...");
	}
}

