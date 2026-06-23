import java.util.Scanner;
import java.io.DataOutputStream;
import java.net.Socket;
public class Client {
	public static Scanner sc =new Scanner(System.in);
    public static String msg; 
    public static void main(String[] args) {
        do{
	        System.out.print("Enter the message pass to the server : ");
	        msg=sc.nextLine();
	        try{
		        Socket s=new Socket("",6666);
		        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		        dout.writeUTF(msg);
		        dout.flush();
			//
		        dout.close();
		        s.close();
		        System.out.println("The message \""+msg+"\" was sent to the server.");
	        }catch(Exception e){
                System.out.println(e);
            }
            System.out.print("Another message to the server? or type (terminate) to shutdown! : ");
            String ans=sc.nextLine();
            if((ans.equals("terminate")))
                break;
        }while(true);
        System.out.println("Bye...");
    }
}
