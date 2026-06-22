//this explains how data hidind and encapsulation
import java.util.Scanner;
public class DataEncapsulation{
	public static void main(String[] args){
	/*DataWithMethods dwm=new DataWithMethods();
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter name : ");
	dwm.setName(sc.next());
	System.out.print("Enter age : ");
	dwm.setAge(sc.nextInt());
	System.out.println("Your name is "+dwm.getName()+" and your age is "+dwm.getAge());
	*/
	A a=new A();
	a.displayNo();
	}

}
class DataWithMethods{
	//data memebers section
	private String name;
	private int age;

	//method members section
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class A{
	public int no=100;
	public void displayNo(){
		int no=200;
		System.out.println(this.no); //this damme nattan local variable eka output karanne
	}
}
	