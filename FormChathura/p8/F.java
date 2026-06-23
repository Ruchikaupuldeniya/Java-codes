import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Input in = new Input();
		Process pr = new Process();
		Output ou = new Output();
		ou.giveOutput(pr.doProcess(in.takeInput1(), in.takeInput2()));
	}
}

class Input {
	public static double takeInput1() {
		// input section
		Scanner N = new Scanner(System.in);
		System.out.println("Enter your first no");
		double d1 = N.nextDouble();
		return d1;
	}

	public static double takeInput2() {
		// input section
		Scanner N = new Scanner(System.in);
		System.out.println("Enter your second no");
		double d2 = N.nextDouble();
		return d2;
	}
}

class Process {
	public static double doProcess(double n1, double n2) {
		// process section
		double sum = n1 + n2;
		return sum;
	}
}

class Output {
	public static void giveOutput(double s) {
		// output section
		System.out.println("your sum is " + s);
	}
}

// void = no return value