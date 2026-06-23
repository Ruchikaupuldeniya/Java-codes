import java.io.*;
import java.net.*;

public class Server {
    static ServerSocket ss;
    static String str;

    public static void main(String[] args) {
        try {
            // Remove the redeclaration here
            ss = new ServerSocket(6666);
        } catch (Exception e) {
            System.out.println(e);
        }

        do {
            System.out.println("Server is running...");
            try {
                Socket s = ss.accept(); // establishes connections
                DataInputStream dis = new DataInputStream(s.getInputStream());
                str = (String) dis.readUTF();
                System.out.println("The message received from the client : " + str);
                s.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (str.equals("shutdown")) {
                try {
                    ss.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Server terminate by the client");
                break;
            }
        } while (true);
    }
}
