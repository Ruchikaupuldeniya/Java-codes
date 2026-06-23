import java.util.Scanner;
import java.io.DataOutputStream;
import java.net.Socket;
public class Client01{
	public static Scanner sc =new Scanner(System.in);
	public static void main(String[] args){
	a();
	}
		public static void a(){
			System.out.print("Enter the message pass to the server : ");
			String msg=sc.nextLine();
			try{
				Socket s=new Socket("",6500);
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				dout.writeUTF(msg);
				dout.flush();
				dout.close();
				s.close();
				System.out.println("The message \""+msg+"\"was sent to the server. ");
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.print("Do you want to continue:YyNn?\n");
			Scanner sc =new Scanner(System.in);
			String x=sc.next();
				if(x.equals("y")||x.equals("Y")){
				a();
				}
				if(x.equals("n")||x.equals("N")){
				System.out.print("Bye");
				}
		}
}
	
		
		