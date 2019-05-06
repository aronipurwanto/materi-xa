package day04;

public class PropagationExample2 {
	void m() {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		PropagationExample2 obj = new PropagationExample2();
		obj.p();
		System.out.println("normal flow");
	}
}

