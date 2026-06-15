import java.util.Scanner;

class Questions {
    float Area, perimeter, length, width;
}

class calculateArea extends Questions {
    void calculateArea() {
        Area = length * width;
        System.out.println("Area: " + Area);
    }
}

class calculatePerimeter extends Questions {
    void calculatePerimeter() {
        perimeter = 2 * (clength + cwidth);
        System.out.println("Perimeter: " + perimeter);
    }
}

class squreArea extends Questions {
    void squreArea() {
        System.out.println("");
    }
}

class MainMethod {
    public static void main(String[] args) { // Corrected main method signature
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = scanner.nextFloat();

        System.out.print("Enter width: ");
        float width = scanner.nextFloat();

        calculateArea cA = new calculateArea();
        cA.calculateArea();

        calculatePerimeter cP = new calculatePerimeter();
        cP.calculatePerimeter();
    }
}