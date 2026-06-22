public class methodOverriding{
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
	public void mB(){
		System.out.println("Bring me a chocolate"); //method overriding
	}
}
class B extends C{
	 public void mB(){
		System.out.println("Hello i'm from B"); //over ridden
	}
}
class C{
	public void mC(){
		System.out.println("Hello i'm from C");
	}
}
//notebook table