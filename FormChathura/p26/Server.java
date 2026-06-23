import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server{
	public static void main(String[] args){
		System.out.println("Server is running...");
		try{
			ServerSocket ss=new ServerSocket(6500);
			Socket s=ss.accept(); //establishes connections
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("The message recieved from client was = "+str);
			s.close();
			ss.close();
		}catch(Exception e){
			System.out.println(e);
			}
		}
}