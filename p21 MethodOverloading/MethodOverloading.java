public class MethodOverloading{
	public static void main(String[]args){
	m1(1,1.22);
	}
	static void m1(){
		System.out.println("I take nothing");
	}
	static void m1(int no){
		System.out.println("Your no is "+no);
	}
	static void m1(double no){
		System.out.println("your no is "+no);
	}
	static void m1(double no2,int no1){
		System.out.println("Your numbers are "+no1+" and "+no2);
	}
	static void m1(int no1, double no2){
		System.out.println("you change the argument order. Your numbers are "+no1+" and "+no2);
	}
}