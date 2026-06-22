import pack1.A1;
public class Inheritance extends A{                   //multiple extends krnn ba.A,B
	static int n=10;
	public static void main(String[] args){
		System.out.println("n = "+n);		//access
		System.out.println("na = "+na);		//access
		System.out.println("nb = "+nb);		//access
		System.out.println("nc = "+nc);		//access
		System.out.println("na1 = "+na1);       //access
		//System.out.println("na2 = "+na2);
		//System.out.println("na3 = "+na3);	//access
		//System.out.println("na4 = "+na4);


		displayNa();
	}
}
class A extends B{
	static int na=20;
	static void displayNa(){
		System.out.println("na = "+na);
	}
}
class B extends C{
	static int nb=30;
}
class C extends A1{
	static int nc=40;
}