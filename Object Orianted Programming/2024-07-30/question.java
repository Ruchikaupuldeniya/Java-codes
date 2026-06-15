class Question {
     double Area;
     double radius;

    Question() {
        radius = 15;
        Area = Math.PI * radius * radius; // calculate area in the constructor
    }

    public static void main(String args[]) {
        Question area = new Question();
        System.out.println("The area of the circle is: " + area.Area);
    }
}

class CircleArea {
    public static void main(String[] args) {
        double radius = 15;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is  " + area);
    }
}