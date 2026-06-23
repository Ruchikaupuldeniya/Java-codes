public class A {
  public static void main(String[] args) {
    System.out.println("Hello-1");
    greeting();
    B b = new B();
    b.greeting2();
    b.c.greeting3();
    C c1 = new C();
    c1.greeting3();

  }

  public static void greeting() {
    System.out.println("Hello, have a nice day");
    C c = new C();
    c.greeting3();
  }
}

class B {
  C c = new C();

  public void greeting2() {
    System.out.println("Have a good day");
  }
}

class C {
  public void greeting3() {
    System.out.println("Have a beautiful day");
  }
}
