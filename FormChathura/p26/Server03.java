import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server03{
static ServerSocket ss;
static String str;
public static void main(String[] args){
		System.out.println("Server is running...");
		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept(); //establishes connections
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
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
				
			}
		}
}