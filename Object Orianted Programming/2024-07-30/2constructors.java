class TwoConstructors {
    int num;
    String name;

    TwoConstructors(int b, String n, int c) {
        num = b;
        name = n;
        // you can use c to initialize another field or perform some operation
    }

    TwoConstructors(int x, String y) {
        num = x;
        name = y;
    }

    public static void main(String args[]) {
        TwoConstructors pass = new TwoConstructors(10, "Cod");
        System.out.println(pass.num + "\n" + pass.name);

        TwoConstructors pass1 = new TwoConstructors(20, "newn");
        System.out.println(pass1.num + "\n" + pass1.name);
    }
}