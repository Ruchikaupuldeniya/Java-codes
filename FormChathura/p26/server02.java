import java.io.*;
import java.net.*;
public class server02{
	static ServerSocket ss;
	static String str;
	public static void main(String[] args){
		try{
			ServerSocket ss=new ServerSocket(6666);
		}catch(Exception e){
			System.out.println(e);
		}
		do{
			System.out.println("Server is running...");
			try{
				Socket s=ss.accept(); //establishes connections
				DataInputStream dis=new DataInputStream(s.getInputStream());
				str=(String)dis.readUTF();
				System.out.println("The message recieved from client was = "+str);
				s.close();
			}catch(Exception e){
				System.out.println(e);
			}
			if(str.equals("shutdown")){
				try{
					ss.close();
				}catch(Exception e){
					System.out.println(e);
				}
				System.out.println("server shuted down by client");
				break;
			}
		}while(true);
	}
}