// Circle class
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// CircleCalculator class
class CircleCalculator {
    public double calculateArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(15);
        CircleCalculator calculator = new CircleCalculator();
        double area = calculator.calculateArea(circle);
        System.out.println("The area of the circle is: " + area);
    }
}