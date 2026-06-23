import java.util.Scanner;
public class E{
	//static Scanner N= new Scanner(System.in);
	public static void main(String[] args){
	giveOutput(doProcess(takeInput1(),takeInput2()));
}
	public static double takeInput1(){
	//input section
	Scanner N= new Scanner(System.in);
	System.out.println("Enter your first no");
	double d1=N.nextDouble();
	return d1;
	
}
	public static double takeInput2(){
	//input section
	Scanner N= new Scanner(System.in);
	System.out.println("Enter your second no");
	double d2=N.nextDouble();
	return d2;
}
	
	public static double doProcess(double d1,double d2){
	//process section
	double sum =d1+d2;
	return sum;
}
	
	public static void giveOutput(double s){
	//output section 
	System.out.println("your sum is "+s);

	
}
}
