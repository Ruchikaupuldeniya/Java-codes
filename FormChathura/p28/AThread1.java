import java.util.Scanner;
public class AThread1 extends Thread{
	public String name;
	public static void main(String[]args){
		AThread1 n1=new AThread1("Kamal");
		AThread1 n2=new AThread1("Nimal");
		AThread1 n3=new AThread1("Mala");
		AThread1 n4=new AThread1("Nadun");
		n1.start();
		n2.start();
		n3.start();
		n4.start();
	}
	public void run(){
		System.out.println(name+" asked the pocket money : " );
		Scanner sc=new Scanner(System.in);
		Double pm=sc.nextDouble();
		System.out.println("Thanx by "+name+" got rs."+pm);
		
	}
	public AThread1(String name){
		this.name=name;
	}
}