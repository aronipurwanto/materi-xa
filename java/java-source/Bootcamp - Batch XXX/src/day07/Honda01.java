package day07;

public class Honda01 extends Bike01 {
	// run method
	void run() {
		System.out.println("method run called");
	}
	
	public static void main(String[] args) {
		Bike01 b = new Honda01();
		b.run();
	}
}

