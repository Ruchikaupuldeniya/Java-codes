import java.util.Scanner;

class Question {
    double Area;
    double radius;

    Question(double radius) {
        this.radius = radius;
        Area = Math.PI * radius * radius; // calculate area in the constructor
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Question area = new Question(radius);
        System.out.println("The area of the circle is: " + area.Area);
    }
}