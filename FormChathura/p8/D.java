import java.util.Scanner;

public class D {
	static Scanner N = new Scanner(System.in);
	static double no1, no2, sum;

	public static void main(String[] args) {
		takeInputs();
		doProcess();
		giveOutputs();
	}

	public static void takeInputs() {
		// input section
		System.out.println("Enter your first no");
		no1 = N.nextDouble();
		System.out.println("Enter your second no");
		no2 = N.nextDouble();
	}

	public static void doProcess() {
		// process section
		sum = no1 + no2;
	}

	public static void giveOutputs() {
		// output section
		System.out.println("your sum is " + sum);

	}
}
