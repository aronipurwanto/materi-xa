package day04;

public class PropagationExample1 {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		PropagationExample1 obj = new PropagationExample1();
		obj.p();
		System.out.println("normal flow...");
	}
}

