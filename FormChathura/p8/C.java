import java.util.Scanner;

public class C {
	static Scanner N = new Scanner(System.in);
	static double no1, no2, sum;

	public static void main(String[] args) {

		System.out.println("Enter your first no");
		no1 = N.nextDouble();
		System.out.println("Enter your second no");
		no2 = N.nextDouble();
		sum = no1 + no2;
		System.out.println("your sum is " + sum);

	}
}
