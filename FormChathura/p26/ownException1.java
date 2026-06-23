import java.util.Scanner;
public class ownException1{
	public static void main (String[]args) throws ExceptionRead1_10{
		int no=0;
		System.out.println("Enter the number between 1 to 10 :  ");
		try{
			no=readValue();
		}catch(ExceptionRead1_10 e){
			System.out.println("ERROR!:"+e.toString());
		}
		System.out.println("No is "+no);
	}
	public static int readValue() throws ExceptionRead1_10{	
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		if(x>10||x<1){
			throw new ExceptionRead1_10(x);
		}
		return x;
	}
}
class ExceptionRead1_10 extends Exception{
	public int no;
	public ExceptionRead1_10(int no){
		this.no=no;
	}
	public String toString(){
	return"\nyou enterd a wrong value,please enter value between 1 to 10.";
	}
}