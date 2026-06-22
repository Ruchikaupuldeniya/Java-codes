public class Polimorphism{
	public static void main(String[] args){
		A a=new A();
		B b=new A();
		C c=new A();
		a.mB();
	}
}
class A extends B{
	public void mA(){
		System.out.println("Hello i'm from A");
	}
}
class B extends C{
	public void mB(){
		System.out.println("Hello i'm from B");
	}
}
class C{
	public void mC(){
		System.out.println("Hello i'm from C");
	}
}

/*A son
  B father
  C grand pa */